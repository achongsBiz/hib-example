package com.demo.hibexample.controller;

import com.demo.hibexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SingleTableController {

    //TODO: Autowire in repository:

    @GetMapping("/products")
    public List<Product> findAll() {

        // TODO: retrieve all products
        // The findAll method can be used out of the box, note that it's not defined in
        // the ProductRepository interface
        return null;
    }

    @GetMapping("/search")
    public List<Product> findByName(@RequestParam String q) {

        // TODO: retrieve product by name
        // Note that this is a custom method specified in the ProductRepository interface.
        return null;
    }

    @GetMapping("/search-fuzzy")
    public List<Product> findByNameFuzzy(@RequestParam String q) {

        // TODO: retrieve product through a fuzzy search
        // Note that this is a custom method specified in the ProductRepository interface.
        return null;
    }
}
