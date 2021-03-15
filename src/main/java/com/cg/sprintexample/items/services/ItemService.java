package com.cg.sprintexample.items.services;

import java.time.LocalDateTime;
import java.util.*;
import javax.transaction.Transactional;

import com.cg.sprintexample.items.dao.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.sprintexample.customer.entity.Customer;
import com.cg.sprintexample.customer.dao.*;
import com.cg.sprintexample.items.entity.*;

@Service
public class ItemService implements IItemService {


    public String generateString() {
        String str="Item";
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<3;i++) {
            Random random=new Random();
            int generateid=random.nextInt(9);
            builder.append(generateid);
        }
        String itemid=builder.toString();
        return str+itemid;

    }

    @Autowired
    private IItemRepository irepo;
    @Autowired
    private ICustomerRepository crepo;

    @Transactional
    @Override
    public Item create(Double price, String description) {

        Item item = new Item(price, description);
        LocalDateTime addedTime = LocalDateTime.now();
        item.setAddedDate(addedTime);

        String id=generateString();
        item.setId(id);
        return irepo.save(item);

    }

    @Override
    public Item findByID(String itemID) {
        Optional<Item> item = irepo.findById(itemID);
        return item.get();
    }

    @Transactional
    @Override
    public Item buyItem(String itemID, Long customerId) {
        Optional<Customer> customer = crepo.findById(customerId);
        Item item = findByID(itemID);


        item.setBoughtBy(customer.get());

        irepo.save(item);
        crepo.save(customer.get());

        return item;
    }

}