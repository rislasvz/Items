package com.springboot.app.item.service;

import com.springboot.app.item.model.Item;
import com.springboot.app.item.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemService implements IItemService{

    @Autowired
    private RestTemplate clienteRest;


    @Override
    public List<Item> findAll() {
        List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:9001/producto", Producto[].class));
        return productos.stream().map(p-> new Item(p,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id.toString());
        Producto producto = clienteRest.getForObject("http://localhost:9001/producto/{id}", Producto.class, pathVariables);
        return new Item(producto, cantidad);
    }
}
