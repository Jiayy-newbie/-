package com.tjetc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tjetc.pojo.Service;
import com.tjetc.pojo.Servicestate;
import com.tjetc.service.PFservice;
import com.tjetc.service.RequestService;
import com.tjetc.service.ServiceState;
import com.tjetc.utils.PinYin4jUtil;

@Controller
@RequestMapping("/pinyin")
public class PinYinController {
	
	private Map<String,String> maps=new HashMap<String, String>();
	@Autowired
	private PFservice pservice;
	@Autowired
	private RequestService rservice;
	@Autowired
	private ServiceState sservice;
	
	@RequestMapping("/list")
	@ResponseBody
	public Map<String, Object>list(Integer page,Integer limit,String name){
		System.out.println(name);
		name=name==null?"":name;
		
		List<Service> list=pservice.selectByExmaple();
		if(name.length()<3){
			for (Service service : list) {
				maps.put(service.getCurname(), PinYin4jUtil.converterToFirstSpell(service.getCurname()));
			}
		}else{
			for (Service service : list) {
				maps.put(service.getCurname(), PinYin4jUtil.converterToSpell(service.getCurname()));
			}
		}
		
		page=page==null || page==0?1:page;
		limit=limit==null?5:limit;
		PageHelper.startPage(page, limit);
		HashMap<String, Object> map=new HashMap<String, Object>();
		System.out.println("name="+name);
		List<Service> list2 = pservice.list(name, maps);
		PageInfo<Service> pageInfo = new PageInfo<Service>(list2);
		List<Servicestate> list3=sservice.listAll();
		map.put("code", 0);
		map.put("msg", "");
		map.put("curname", name);
		map.put("count", pageInfo.getTotal());
		map.put("data", list2);
		
		return map;
	}
}
