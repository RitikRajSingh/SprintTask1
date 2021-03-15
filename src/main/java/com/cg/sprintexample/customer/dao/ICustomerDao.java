package com.cg.sprintexample.customer.dao;

import com.cg.sprintexample.customer.entity.Customer;

public interface ICustomerDao {
    public Customer add(Customer customer);
    public Customer findByID(long customerID);
    public Customer update(Customer customer);
}
