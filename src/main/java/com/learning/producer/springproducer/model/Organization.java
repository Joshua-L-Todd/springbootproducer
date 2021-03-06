package com.learning.producer.springproducer.model;

import javax.persistence.*;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String company_name;
    private int year_of_inc;
    private int postal_code;
    private int employee_count;
    private String slogan;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getYear_of_inc() {
        return year_of_inc;
    }

    public void setYear_of_inc(int year_of_inc) {
        this.year_of_inc = year_of_inc;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
