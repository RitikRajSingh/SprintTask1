package com.cg.sprintexample.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.sprintexample.customer.entity.Account;

public interface IAccountRepository extends JpaRepository<Account,Long> {
}