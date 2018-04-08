package com.james.ssm.service.impl;


import com.james.ssm.mapper.PersonCustomMapper;
import com.james.ssm.po.Person;
import com.james.ssm.po.PersonCustom;
import com.james.ssm.po.PersonQueryVo;
import com.james.ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonCustomMapper personCustomMapper;

    public List<PersonCustom> queryPersonList(PersonQueryVo personQueryVo) {

        return personCustomMapper.queryPersonList(personQueryVo);
    }

    public void savePerson(PersonCustom personCustom){
        personCustomMapper.savePerson(personCustom);
    }


    public Person findPersonById(Integer id) {
        return personCustomMapper.findPersonById(id);
    }

    @Override
    public void updatePerson(PersonCustom personCustom) {
        personCustomMapper.updatePerson(personCustom);
    }

    @Override
    public void deletePersonById(Integer id) {
        personCustomMapper.deletePersonById(id);
    }
}
