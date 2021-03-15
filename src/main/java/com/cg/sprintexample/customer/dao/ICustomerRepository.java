package com.cg.sprintexample.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.sprintexample.customer.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
