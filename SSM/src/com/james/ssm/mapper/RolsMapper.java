package com.james.ssm.mapper;

import com.james.ssm.po.Rols;
import com.james.ssm.po.RolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolsMapper {

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