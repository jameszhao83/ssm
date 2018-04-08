package com.james.ssm.service.impl;

import com.james.ssm.mapper.MemuleftMapper;
import com.james.ssm.mapper.SysteminfoMapper;
import com.james.ssm.po.Memuleft;
import com.james.ssm.po.MemuleftExample;
import com.james.ssm.service.MemuleftService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemuleftServiceImpl implements MemuleftService {

    @Autowired
    MemuleftMapper memuleftMapper;

    @Override
    public long countByExample(MemuleftExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MemuleftExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Memuleft record) {
        memuleftMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Memuleft record) {
        return 0;
    }

    @Override
    public List<Memuleft> selectByExample(MemuleftExample example) {
        List<Memuleft> memus=memuleftMapper.selectByExample(example);
        return memus;
    }

    @Override
    public Memuleft selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Memuleft record, MemuleftExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Memuleft record, MemuleftExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Memuleft record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Memuleft record) {
        return 0;
    }
}
