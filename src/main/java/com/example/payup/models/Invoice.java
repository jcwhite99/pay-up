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
    private int invoiceId;

    public Invoice(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Invoice() {}

    public int getId() {
        return id;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public int getinvoiceId() {
        return invoiceId;
    }

    public void setinvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }
}