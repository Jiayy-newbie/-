package com.tjetc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.tjetc.mapper.ServiceMapper;
import com.tjetc.mapper.ServicerequestMapper;
import com.tjetc.pojo.Service;
import com.tjetc.pojo.ServiceExample;
import com.tjetc.pojo.ServiceExample.Criteria;
import com.tjetc.pojo.Servicerequest;


@org.springframework.stereotype.Service
public class NService {

	@Autowired
	private ServiceMapper mapper;
	@Autowired
	private ServicerequestMapper reapper;
	
	public List<Service> list() {
		List<Service> list = mapper.selectByExample(null);
		return list;
	}

	public List<Service> listByName(String curname) {
		// TODO Auto-generated method stub
		ServiceExample example=new ServiceExample();
		Criteria criteria = example.createCriteria();
		criteria.andCurnameLike("%"+curname+"%");
		return mapper.selectByExample(example);
	}


	public List<Service> listAll(Map<String, Object> map2) {
		// TODO Auto-generated method stub
		List<Service> list = mapper.listAll(map2);
		return list;
		
	}

	public void add(Service service) {
		// TODO Auto-generated method stub
		mapper.insert(service);
	}

	public void del(String id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
		//mapper.del(id);
	}

	public Service get(String id) {
		// TODO Auto-generated method stub
		Service service = mapper.selectByPrimaryKey(id);
		Servicerequest selectByPrimaryKey = reapper.selectByPrimaryKey(service.getUid());
		service.setReService(selectByPrimaryKey);
		return service;
	}

	public void updateByStateid(Service service) {
		// TODO Auto-generated method stub
		mapper.updateByStateid(service);
	}

}
