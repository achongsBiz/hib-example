package com.demo.hibexample.data;

import com.demo.hibexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductName(String name);
    List<Product> findByProductNameContainingIgnoreCase(String name);
}
