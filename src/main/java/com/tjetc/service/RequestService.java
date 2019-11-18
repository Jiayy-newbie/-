package com.tjetc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjetc.mapper.ServicerequestMapper;
import com.tjetc.pojo.Servicerequest;

@Service
public class RequestService {
	
	@Autowired
	private ServicerequestMapper mapper;

	public void add(Servicerequest srquest) {
		// TODO Auto-generated method stub
		mapper.insert(srquest);
	}

	public void insert(Servicerequest srquest) {
		// TODO Auto-generated method stub
		mapper.insert(srquest);
	}

}
