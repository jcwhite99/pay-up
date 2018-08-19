package com.example.payup.models.forms;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Company {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max = 15)
    private String company;

    @NotNull
    @Email
    private String email;


    public Company(String company, String email){
        this.company = company;
        this.email = email;

    }

    public Company() {}

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}