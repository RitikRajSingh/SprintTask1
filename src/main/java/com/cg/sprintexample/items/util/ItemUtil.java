package com.cg.sprintexample.items.util;

import org.springframework.stereotype.Component;


import com.cg.sprintexample.items.dto.ItemDetail;
import com.cg.sprintexample.items.entity.Item;

import java.util.Set;

@Component
public class ItemUtil {
    public ItemDetail toDetail(Item item) {

        return new ItemDetail(item.getId(),item.getPrice(),item.getDescription(),item.getBoughtBy().getId(), item.getBoughtBy().getName());

    }

    public Set<ItemDetail> toDetailSet(Set<Item> set) {
        return null;
    }
}
