package com.cg.sprintexample.items.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cg.sprintexample.customer.entity.Customer;


@Entity
public class Item {

    @Id
    private String id;

    private double price;
    private String description;

    @ManyToOne
    private Customer boughtBy;

    private LocalDateTime addedDate;



    public Item() {

    }


    public Item(double price, String description) {
        this.price = price;
        this.description = description;
    }




    public Long getId() {
        return Long.valueOf(id);
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getBoughtBy() {
        return boughtBy;
    }
    public void setBoughtBy(Customer boughtBy) {
        this.boughtBy = boughtBy;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }
    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }
    @Override
    public String toString() {
        return "Item [id=" + id + ", price=" + price + ", description=" + description + ", addedDate=" + addedDate + "]";
    }
}