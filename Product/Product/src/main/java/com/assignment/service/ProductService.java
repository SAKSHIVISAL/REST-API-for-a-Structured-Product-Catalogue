package com.assignment.service;

import com.assignment.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(String id);
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
}


