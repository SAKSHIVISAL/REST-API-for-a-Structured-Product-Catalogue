package com.assignment.controller;
import org.springframework.web.bind.annotation.*;

import com.assignment.entity.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> productList = new ArrayList<>();

    // Create operation
    @PostMapping("/")
    public Product createProduct(@RequestBody Product product) {
        productList.add(product);
        return product;
    }

    // Read operation
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; 
    }

    // Update operation
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getId().equals(id)) {
                productList.set(i, updatedProduct);
                return updatedProduct;
            }
        }
        return null; 
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        productList.removeIf(product -> product.getId().equals(id));
        return "Product with ID " + id + " deleted successfully";
    }
}
