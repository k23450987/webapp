package com.tom.webapp.model;

public class DeptWithCompany {

    private Integer id;
    private String name;
    private Integer personnum;
    private Company company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPersonnum() {
        return personnum;
    }

    public void setPersonnum(Integer personnum) {
        this.personnum = personnum;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "DeptWithCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personnum=" + personnum +
                ", company=" + company +
                '}';
    }
}
