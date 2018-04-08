package com.james.ssm.service.impl;

import com.james.ssm.mapper.ReconditionMapper;
import com.james.ssm.po.Recondition;
import com.james.ssm.po.ReconditionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ReconditionServiceImpl implements com.james.ssm.service.ReconditionService {
    @Autowired
    ReconditionMapper reconditionMapper;

    @Override
    public long countByExample(ReconditionExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ReconditionExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {

        return 0;
    }

    @Override
    public int insert(Recondition record) {
        reconditionMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Recondition record) {
        return 0;
    }

    @Override
    public List<Recondition> selectByExample(ReconditionExample example) {
        List<Recondition> reconditions = reconditionMapper.selectByExample(example);
        return reconditions;
    }

    @Override
    public Recondition selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Recondition record, ReconditionExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Recondition record, ReconditionExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Recondition record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Recondition record) {
        return 0;
    }
}
