package com.example.payup.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max = 10000)
    private int number;

    public Invoice(int number) {
        this.number = number;
    }

    public Invoice() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}