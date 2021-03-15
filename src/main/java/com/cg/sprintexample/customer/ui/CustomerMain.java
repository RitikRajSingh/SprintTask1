package com.cg.sprintexample.customer.ui;

import com.cg.sprintexample.customer.entity.Customer;
import com.cg.sprintexample.customer.services.ICustomerService;
import com.cg.sprintexample.items.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMain {

    @Autowired
    private ICustomerService service;

    public static void main(String[] args) {
        CustomerMain app=new CustomerMain();
        app.start();
    }

    public void start() {
        System.out.println("Customer Creation..........");
        System.out.println();
        Customer customer1 = service.createCustomer(20000.0, "Ritik Raj Singh");
        Customer customer2 = service.createCustomer(20000.0, "Rishav Raj Singh");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println();
        System.out.println("Item Creation..........");
        System.out.println();

        Item item1 = service.createCustomer(20000.0, "Redmi");
        System.out.println("id=" + item1.getId() + " ,description=" + item1.getDescription() + " and price= " + item1.getPrice());

        Customer item2 = service.createCustomer(40000.0, "OnePlus");
        System.out.println("id=" + item2.getId() + " ,description=" + item2.getDescription() + " and price= " + item2.getPrice());

        Customer findItem1 = service.findByID(item2.getId());
        System.out.println("id=" + findItem1.getId() + " and description=" + findItem1.getDescription());

    }
}
