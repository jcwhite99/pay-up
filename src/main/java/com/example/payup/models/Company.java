package com.example.payup.models;

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
    private String name;

    @NotNull
    @Email
    private String email;


    public Company(String name, String email){
        this.name = name;
        this.email = email;

    }

    public Company() {}

    public int getId() {
     return id;
    }
    public void setId(int anId){
        this.id = anId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}