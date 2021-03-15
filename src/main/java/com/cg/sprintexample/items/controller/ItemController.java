package com.cg.sprintexample.items.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.cg.sprintexample.items.dto.BuyItemRequest;
import com.cg.sprintexample.items.dto.CreateItemRequest;
import com.cg.sprintexample.items.dto.ItemDetail;
import com.cg.sprintexample.items.services.IItemService;
import com.cg.sprintexample.items.util.ItemUtil;

@RequestMapping("/items")
@RestController
public class ItemController {

    @Autowired
    private IItemService iService;

    @Autowired
    private ItemUtil util;

    @PostMapping("/add")
    public ItemDetail addItem(@RequestBody CreateItemRequest request )
    {
        return util.toDetail(iService.create(request.getPrice(),request.getDescription()));
    }

    @GetMapping("/findbyid/{id}")
    public ItemDetail findById(@PathVariable String id)
    {
        return util.toDetail(iService.findByID(id));
    }

    @PutMapping("/customer/add")
    public ItemDetail buyItem(@RequestBody BuyItemRequest request)
    {
        return util.toDetail(iService.buyItem(request.getItem_id(),request.getCustomer_id()));
    }

}
