package com.tjetc.mapper;

import com.tjetc.pojo.Servicerequest;
import com.tjetc.pojo.ServicerequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicerequestMapper {
    int countByExample(ServicerequestExample example);

    int deleteByExample(ServicerequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Servicerequest record);

    int insertSelective(Servicerequest record);

    List<Servicerequest> selectByExample(ServicerequestExample example);

    Servicerequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Servicerequest record, @Param("example") ServicerequestExample example);

    int updateByExample(@Param("record") Servicerequest record, @Param("example") ServicerequestExample example);

    int updateByPrimaryKeySelective(Servicerequest record);

    int updateByPrimaryKey(Servicerequest record);
}