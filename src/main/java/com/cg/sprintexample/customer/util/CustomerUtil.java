package com.cg.sprintexample.customer.util;

import org.springframework.stereotype.Component;
import com.cg.sprintexample.customer.dto.CustomerDetail;
import com.cg.sprintexample.customer.entity.Customer;

@Component
public class CustomerUtil {

    public CustomerDetail toDetail(Customer customer) {
        CustomerDetail cdetail=new CustomerDetail();
        cdetail.setId(customer.getId());
        cdetail.setName(customer.getName());
        cdetail.setAccount_id(customer.getAccount().getAccountId());
        cdetail.setBalance(customer.getAccount().getBalance());
        return cdetail;
    }
}