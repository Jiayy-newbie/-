package com.tjetc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjetc.mapper.AdminMapper;
import com.tjetc.pojo.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminMapper mapper;

	public Admin getByUid(Integer id) {
		// TODO Auto-generated method stub
		Admin admin = mapper.selectByPrimaryKey(id);
		return admin;
	}

}
