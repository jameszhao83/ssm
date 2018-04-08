package com.james.ssm.service;

import com.james.ssm.po.Recondition;
import com.james.ssm.po.ReconditionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReconditionService {

    long countByExample(ReconditionExample example);

    int deleteByExample(ReconditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recondition record);

    int insertSelective(Recondition record);

    List<Recondition> selectByExample(ReconditionExample example);

    Recondition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recondition record, @Param("example") ReconditionExample example);

    int updateByExample(@Param("record") Recondition record, @Param("example") ReconditionExample example);

    int updateByPrimaryKeySelective(Recondition record);

    int updateByPrimaryKey(Recondition record);
}
