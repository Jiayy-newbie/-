package com.tjetc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjetc.mapper.ServicestateMapper;
import com.tjetc.pojo.Servicestate;

@Service
public class ServiceState {
	
	@Autowired
	private ServicestateMapper mapper;

	public Servicestate getById(Integer id) {
		Servicestate servicestate = mapper.selectByPrimaryKey(id);
		return servicestate;
	}

	public List<Servicestate> listAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
