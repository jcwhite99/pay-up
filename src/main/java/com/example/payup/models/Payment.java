package com.example.payup.models;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Email
    @Size(min = 1, max = 30)
    private String email;

    public Payment(String email) {
        this.email = email;
    }

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}