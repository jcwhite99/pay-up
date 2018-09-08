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
    @Size(min = 5, max = 50)
    private String job;

    public Service(String job) {
        this.job = job;


    }

    public Service() {
    }
    public int getId() {
        return id;
    }
    public void setId(int anId){
        this.id = anId;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}

