package com.cg.sprintexample.customer.services;

import com.cg.sprintexample.customer.entity.Customer;
import com.cg.sprintexample.items.entity.Item;

import javax.transaction.Transactional;
import java.util.Set;

public interface ICustomerService {

    public Customer findByID(long customerID);
    public Customer createCustomer(double v, String name);

    public Set<Item> itemsBoughtByCustomer(Long customerID);

    @Transactional
    Customer createCustomer(String name);

    Customer findById(Long customerId);

    public Customer addAmount(Long customerId, double amount);
}