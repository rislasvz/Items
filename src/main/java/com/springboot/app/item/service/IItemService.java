package com.springboot.app.item.service;

import com.springboot.app.item.model.Item;

import java.util.List;

public interface IItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

}
