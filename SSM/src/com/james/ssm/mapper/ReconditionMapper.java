package com.james.ssm.mapper;

import com.james.ssm.po.Recondition;
import com.james.ssm.po.ReconditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconditionMapper {

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