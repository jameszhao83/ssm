package com.james.ssm.service;

import com.james.ssm.po.*;

import java.util.List;

public interface PersonService {
    public List<PersonCustom> queryPersonList(PersonQueryVo personQueryVo);
    public void savePerson(PersonCustom personCustom);
    public Person findPersonById(Integer id);

    public void updatePerson(PersonCustom personCustom);
    public void deletePersonById(Integer id);
}
