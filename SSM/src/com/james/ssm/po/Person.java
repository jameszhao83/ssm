package com.james.ssm.po;

import java.util.Date;

public class Person {
    private int id;
    private String pname;
    private String ptype;
    private String pcomp;
    private  String password;
    private  String username;
    private String scope;
    private Date entrytime;
    private Date leavetime;
    private  String projectname;
    private  String officeaddress;
    private String teminalip;
    private String servicedep;
    private  String phone;
    private  String telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(String officeaddress) {
        this.officeaddress = officeaddress;
    }

    public String getTeminalip() {
        return teminalip;
    }

    public void setTeminalip(String teminalip) {
        this.teminalip = teminalip;
    }

    public String getServicedep() {
        return servicedep;
    }

    public void setServicedep(String servicedep) {
        this.servicedep = servicedep;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPcomp() {
        return pcomp;
    }

    public void setPcomp(String pcomp) {
        this.pcomp = pcomp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
