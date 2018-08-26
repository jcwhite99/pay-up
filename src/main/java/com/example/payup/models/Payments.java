package com.example.payup.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Payments {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max = 30)
    private String name;

    public Payments(String name) {
        this.name = name;
    }

    public Payments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}