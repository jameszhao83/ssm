package com.james.ssm.service.impl;

import com.james.ssm.mapper.ReconditionMapper;
import com.james.ssm.mapper.SysteminfoMapper;
import com.james.ssm.po.Systeminfo;
import com.james.ssm.po.SysteminfoExample;
import com.james.ssm.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemInfoServiceImpl implements SystemInfoService{



    @Autowired
    SysteminfoMapper systeminfoMapper;
    @Override
    public long countByExample(SysteminfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SysteminfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Systeminfo record) {
        systeminfoMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Systeminfo record) {
        return 0;
    }

    @Override
    public List<Systeminfo> selectByExample(SysteminfoExample example) {
        List<Systeminfo> systemInfos = systeminfoMapper.selectByExample(example);
        return systemInfos;
    }

    @Override
    public Systeminfo selectByPrimaryKey(Integer id) {
        Systeminfo systeminfo=systeminfoMapper.selectByPrimaryKey(id);
        return systeminfo;
    }

    @Override
    public int updateByExampleSelective(Systeminfo record, SysteminfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Systeminfo record, SysteminfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Systeminfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Systeminfo record) {
        systeminfoMapper.updateByPrimaryKey(record);
        return 0;
    }
}
