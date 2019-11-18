package com.tjetc.mapper;

import com.tjetc.pojo.Service;
import com.tjetc.pojo.ServiceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface ServiceMapper {
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    List<Service> listAll(Map<String, Object> map);

	int del(String cretime);

	int updateByStateid(Service service);
	
}