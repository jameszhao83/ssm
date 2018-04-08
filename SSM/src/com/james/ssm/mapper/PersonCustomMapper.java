package com.james.ssm.mapper;

import com.james.ssm.po.*;

import java.util.List;

public interface PersonCustomMapper {
    public List<PersonCustom> queryPersonList(PersonQueryVo personQueryVo);
    public void savePerson(PersonCustom personCustom);
    public Person findPersonById(Integer id);
    public void updatePerson(PersonCustom personCustom);
    public void deletePersonById(Integer id);
}
