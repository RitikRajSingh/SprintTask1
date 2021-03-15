package com.cg.sprintexample.items.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sprintexample.items.entity.Item;

public interface IItemRepository extends JpaRepository<Item,String> {

}
