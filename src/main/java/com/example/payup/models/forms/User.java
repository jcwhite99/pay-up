package com.example.payup.models.forms;



import org.hibernate.validator.constraints.Email;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.JoinColumn;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

import java.util.List;



@Entity


public class User {



    @Id

    @GeneratedValue

    private int id;



    @NotNull

    @Size(min=5, max=15)

    private String username;



    @Email

    private String email;



    @NotNull

    @Size(min=6)

    private String password;



    @OneToMany

    @JoinColumn(name = "user_id")

    private List<Cheese> cheeses;



    public User() {



    }



    public String getUsername() {

        return username;

    }



    public void setUsername(String username) {

        this.username = username;

    }



    public String getEmail() {

        return email;

    }



    public void setEmail(String email) {

        this.email = email;

    }



    public String getPassword() {

        return password;

    }



    public void setPassword(String password) {

        this.password = password;

    }