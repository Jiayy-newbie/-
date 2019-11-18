package com.tjetjc.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjetc.mapper.ServiceMapper;
import com.tjetc.pojo.Service;
import com.tjetc.pojo.ServiceExample;
import com.tjetc.pojo.ServiceExample.Criteria;
import com.tjetc.utils.PinYin4jUtil;

public class Pinyin4jTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceMapper bean = context.getBean(ServiceMapper.class);
		
		ServiceExample example=new 	ServiceExample();
		Criteria criteria = example.createCriteria();
		String curname="杨立新";
		
		String pinyin = PinYin4jUtil.converterToFirstSpell(curname);
		String spell = PinYin4jUtil.converterToSpell(curname);
		System.out.println(spell);
		System.out.println(pinyin);
		criteria.andCurnameLike("%"+curname+"%");
		
		List<Service> list = bean.selectByExample(example);
		for (Service service : list) {
			System.out.println(service);
		}
		
		
	}

}
