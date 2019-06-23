package com.crud.entreprise.controller;


import com.crud.entreprise.entities.Product;
import com.crud.entreprise.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    IProductService service;

    @PostMapping("/add")
    public void ajouter(@RequestBody Product product) {
        service.ajouter(product);
    }

    @GetMapping("/get/{id}")
    public Product get(@PathVariable (name = "id") Long id) {
        Optional<Product> product = service.findByID(id);
        return product.get();
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        List<Product> products = service.findAll();
        return products;
    }
}
