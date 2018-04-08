package com.james.ssm.service.impl;

import com.james.ssm.mapper.InspectionMapper;
import com.james.ssm.po.Inspection;
import com.james.ssm.po.InspectionExample;
import com.james.ssm.service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InsperctionServiceImpl implements InspectionService {

    @Autowired
    InspectionMapper inspectionMapper;
    @Override
    public long countByExample(InspectionExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(InspectionExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Inspection record) {
        return 0;
    }

    @Override
    public int insertSelective(Inspection record) {
        return 0;
    }

    @Override
    public List<Inspection> selectByExample(InspectionExample example) {
        return null;
    }

    @Override
    public Inspection selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Inspection record, InspectionExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Inspection record, InspectionExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Inspection record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Inspection record) {
        return 0;
    }
}
