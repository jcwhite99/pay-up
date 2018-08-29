package com.example.payup.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Service {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String date;

    @NotNull
    @Size(min = 5, max = 50)
    private String job;

    @NotNull
    private int price;


    public Service(String date, String job, int price) {
        this.date = date;
        this.job = job;
        this.price = price;

    }

    public Service() {
    }
    public int getId() {
        return id;
    }
    public void setId(int anId){
        this.id = anId;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

