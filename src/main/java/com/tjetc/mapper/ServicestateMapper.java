package com.tjetc.mapper;

import com.tjetc.pojo.Servicestate;
import com.tjetc.pojo.ServicestateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicestateMapper {
    int countByExample(ServicestateExample example);

    int deleteByExample(ServicestateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Servicestate record);

    int insertSelective(Servicestate record);

    List<Servicestate> selectByExample(ServicestateExample example);

    Servicestate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Servicestate record, @Param("example") ServicestateExample example);

    int updateByExample(@Param("record") Servicestate record, @Param("example") ServicestateExample example);

    int updateByPrimaryKeySelective(Servicestate record);

    int updateByPrimaryKey(Servicestate record);
}