package com.tjetc.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.tjetc.mapper.AdminMapper;
import com.tjetc.mapper.ServiceMapper;
import com.tjetc.mapper.ServicestateMapper;
import com.tjetc.pojo.Service;
import com.tjetc.pojo.ServiceExample;
import com.tjetc.pojo.ServiceExample.Criteria;

@org.springframework.stereotype.Service
public class PFservice {

	@Autowired
	private ServiceMapper mapper;
	@Autowired
	private AdminMapper amapper;
	@Autowired
	private ServicestateMapper smapper;
	
	public List<Service> list(String curname,Map<String,String> maps){
		System.out.println(curname);
		ServiceExample example = new ServiceExample();
		Set<Entry<String,String>> entrySet=maps.entrySet();
		if(curname.length()==curname.getBytes().length && !("".equals(curname))){
			System.out.println("——————————————————————————————————————————————————————");
			for (Entry<String, String> entry : entrySet) {
				if(entry.getValue().contains(curname)){
					String key = entry.getKey();
					System.out.println("key="+key);
					Criteria or = example.or();
					example.or().andCurnameLike("%"+key+"%");
				}
			}
			List<Service> list=mapper.selectByExample(example);
			for (Service service : list) {
				service.setAdmin(amapper.selectByPrimaryKey(service.getUid()));
				service.setState(smapper.selectByPrimaryKey(service.getStateid()));
				service.setAname(service.getAdmin().getName());
				service.setStatee(service.getState().getName());
				System.out.println(service);
			}
			return list;
		}else{
			System.out.println("——————————————————————————————————————————————————————");
			example.createCriteria().andCurnameLike("%"+curname+"%");
			List<Service> list2 = mapper.selectByExample(example);
			for (Service service : list2) {
				service.setAdmin(amapper.selectByPrimaryKey(service.getUid()));
				service.setState(smapper.selectByPrimaryKey(service.getStateid()));
				service.setAname(service.getAdmin().getName());
				service.setStatee(service.getState().getName());
			}
			return list2;
		}
		
	}

	public List<Service> selectByExmaple() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}
	
}


