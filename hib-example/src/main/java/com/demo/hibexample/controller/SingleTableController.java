package com.demo.hibexample.controller;

import com.demo.hibexample.data.ProductRepository;
import com.demo.hibexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SingleTableController {
    @Autowired
    private ProductRepository prodRepo;

    @GetMapping("/products")
    public List<Product> findAll() {

        // The findAll method can be used out of the box, note that it's not defined in
        // the ProductRepository interface
        return prodRepo.findAll();
    }

    @GetMapping("/search")
    public List<Product> findByName(@RequestParam String q) {

        // Note that this is a custom method specified in the ProductRepository interface.
        return prodRepo.findByProductName(q);
    }

    @GetMapping("/search-fuzzy")
    public List<Product> findByNameFuzzy(@RequestParam String q) {

        // Note that this is a custom method specified in the ProductRepository interface.
        return prodRepo.findByProductNameContainingIgnoreCase(q);
    }
}
