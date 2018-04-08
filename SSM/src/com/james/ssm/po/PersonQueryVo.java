package com.james.ssm.po;

public class PersonQueryVo {
    Person person;
PersonCustom personCustom;

    public PersonCustom getPersonCustom() {
        return personCustom;
    }

    public void setPersonCustom(PersonCustom personCustom) {
        this.personCustom = personCustom;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
