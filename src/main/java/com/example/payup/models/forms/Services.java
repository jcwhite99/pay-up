package com.example.payup.models.forms;

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
    private String services;

    @NotNull
    @Size(min = 4, max = 8)
    private int date;

    @NotNull
    @Size(min = 1, max = 6)
    private int price;

    public Services(String services, int date, int price){
        this.services = services;
        this.date = date;
        this.price = price;

    }

    public Services() {}

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
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
