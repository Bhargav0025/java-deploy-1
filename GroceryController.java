package com.example.groceryapp.controller;

import com.example.groceryapp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GroceryController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product("Apple", 1.50),
            new Product("Banana", 0.75),
            new Product("Carrot", 2.00)
        );
    }
}
