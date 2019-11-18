package com.tjetc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.imageio.spi.ServiceRegistry;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tjetc.pojo.Admin;
import com.tjetc.pojo.Service;
import com.tjetc.pojo.Servicerequest;
import com.tjetc.pojo.Servicestate;
import com.tjetc.service.AdminService;
import com.tjetc.service.NService;
import com.tjetc.service.RequestService;
import com.tjetc.service.ServiceState;

@Controller
@RequestMapping("/servlet")
public class ningController {
	
	@Autowired
	private NService nservice;
	@Autowired
	private ServiceState stateService;
	@Autowired
	private AdminService aservice;
	@Autowired
	private RequestService rservice;
	
	@RequestMapping("/create")
	private String create(Model model) {
		
		Integer id=1;
		Servicestate state=stateService.getById(id);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String format = sdf.format(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String format2 = sdf2.format(date);
		
		int uuid = UUID.randomUUID().toString().hashCode();
		System.out.println("uuid:"+uuid);
		String oid = (format+uuid+1).replaceAll("-", "");
		Integer uid=10;
		Admin admin=aservice.getByUid(uid);
		
		model.addAttribute("admin", admin);
		model.addAttribute("oid",oid);
		model.addAttribute("format2",format2);

		model.addAttribute("state", state);
		return "/createService";
	}
		
	@RequestMapping("/add")
	private String add(Service service,Model mdoel,HttpServletRequest request) {
		Servicerequest srquest=new Servicerequest();
		srquest.setSertext(request.getParameter("sertext"));
		srquest.setCretime(service.getCretime());
		srquest.setSerid(service.getId());
		rservice.add(srquest);
		service.setStateid(2);
		System.out.println(service);
		nservice.add(service);
		return "list";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	private Map<String,Object> list(Integer page,Integer limit,String name,String id,Model model) {
		if("".equals(name)){
			name=null;
		}else{
			name=name;
		}
		if("".equals(id)){
			id=null;
		}else{
			id=id;
		}
		PageHelper.startPage(page, limit);
		
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("name", name);
		map2.put("id", id);
		List<Service> list=nservice.listAll(map2);
		PageInfo<Service> pageInfo = new PageInfo<Service>(list);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", pageInfo.getTotal());
		map.put("data", list);
		return map;
		
	}
	
	@RequestMapping("/del/{id}")
	@ResponseBody
	private boolean del(@PathVariable("id") String id) {
		System.out.println(id+"*********////////////");
		// TODO Auto-generated method stub
		nservice.del(id);
		return true;
	}
	
	@RequestMapping("/get/{id}")
	private String get(@PathVariable("id") String id,Model model) {
		System.out.println("——————————————————————————————");
		Service ser=nservice.get(id);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String cretime = sdf.format(date);
		System.out.println(ser);
		model.addAttribute("cretime", cretime);
		model.addAttribute("ser", ser);
		
		System.out.println(ser);
		return "/hadle";
	}
	
	@RequestMapping("/addr")
	@ResponseBody
	private String addr(Service service,Model mdoel,HttpServletRequest request) {
		System.out.println(service+"*****************");
		Servicerequest srquest=new Servicerequest();
		srquest.setSertext(request.getParameter("sertext"));
		srquest.setCretime(service.getCretime());
		srquest.setSerid(service.getId());
		System.out.println(srquest+"==============");
		System.out.println(service.getStateid());
		if(service.getStateid()==2){
			service.setStateid(3);
			System.out.println("service="+service);
			nservice.updateByStateid(service);
			rservice.insert(srquest);
		}else if(service.getStateid()==3){
			service.setStateid(4);
			System.out.println(service);
			nservice.updateByStateid(service);
			rservice.insert(srquest);
		}
		
		return "<script>parent.location.reload()</script>";
	}
}
