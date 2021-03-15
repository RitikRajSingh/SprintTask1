package com.cg.sprintexample.customer.services;

import java.time.LocalDateTime;
import java.util.*;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.sprintexample.customer.dao.*;
import com.cg.sprintexample.customer.entity.Account;
import com.cg.sprintexample.customer.entity.Customer;
import com.cg.sprintexample.customer.exception.CustomerNotFoundException;
import com.cg.sprintexample.items.entity.Item;

    @Service
    public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository cRepository;
    @Autowired
    private IAccountRepository aRepository;

    @Transactional
    @Override
    public Customer createCustomer(String name) {

        LocalDateTime currentTime = LocalDateTime.now();
        Account account = new Account(99999, currentTime);

        aRepository.save(account);
        Customer customer = new Customer(name, account);

        customer = cRepository.save(customer);
        return customer;

    }

    @Override
    public Customer findById(Long customerId) {
        Optional<Customer> optional = cRepository.findById(customerId);
        if (!optional.isPresent()) {
            throw new CustomerNotFoundException("No Customer found for this id");
        }

        return optional.get();
    }

    @Transactional
    @Override
    public Customer addAmount(Long customerId, double amount) {

        Customer customer = findById(customerId);
        Account account = customer.getAccount();
        account.setBalance(amount);
        aRepository.save(account);
        cRepository.save(customer);
        return customer;
    }

    @Override
    public Customer findByID(long customerID) {
        return null;
    }

    @Override
    public Customer createCustomer(double v, String name) {
        return null;
    }

    @Override
    public Set<Item> itemsBoughtByCustomer(Long customerID) {
        Optional<Customer> customer = cRepository.findById(customerID);
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException("No Customer found for this id");
        }
        Customer c = customer.get();
        return c.getBoughtItems();
    }

}
