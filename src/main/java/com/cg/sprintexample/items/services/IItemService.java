package com.cg.sprintexample.items.services;

import com.cg.sprintexample.items.entity.Item;

public interface IItemService {
    Item create(Double price, String description);

    Item findByID(String itemID);

    Item buyItem(String itemID, Long customerId);

}
