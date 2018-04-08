package com.james.ssm.service;

import com.james.ssm.po.Rols;
import com.james.ssm.po.RolsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolsService {
    long countByExample(RolsExample example);


    int deleteByExample(RolsExample example);


    int deleteByPrimaryKey(Integer id);


    int insert(Rols record);


    int insertSelective(Rols record);


    List<Rols> selectByExample(RolsExample example);


    Rols selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") Rols record, @Param("example") RolsExample example);

    int updateByExample(@Param("record") Rols record, @Param("example") RolsExample example);

    int updateByPrimaryKeySelective(Rols record);

    int updateByPrimaryKey(Rols record);
}
