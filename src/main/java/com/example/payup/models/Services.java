package com.example.payup.models;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Services {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 5, max = 15)
    private String job;

    @NotNull
    private int date;

    @NotNull
    private int price;


    public Services(String job, int date, int price){
        this.job = job;
        this.date = date;
        this.price = price;

    }

    public Services() {}

    public String getJob() {
        return job;
    }

    public void setJob(String services) {
        this.job = services;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

