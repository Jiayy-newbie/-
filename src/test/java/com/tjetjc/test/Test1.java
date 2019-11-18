package com.tjetjc.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tjetc.mapper.ServiceMapper;
import com.tjetc.pojo.Service;

public class Test1 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceMapper bean = context.getBean(ServiceMapper.class);
		
		PageHelper.startPage(2, 5);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "杨");
		map.put("id", "2019071621121732987365");
		List<Service> listAll = bean.listAll(map);
		PageInfo<Service> pageInfo = new PageInfo<Service>(listAll);
		for (Service service : listAll) {
			System.out.println(service);
		}
	}

}
