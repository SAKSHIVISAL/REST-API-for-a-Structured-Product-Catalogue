package com.assignment.service;

import org.springframework.stereotype.Service;

import com.assignment.entity.Product;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImp implements ProductService {

    private final Map<String, Product> products = new HashMap<>();

    @Override
    public Product createProduct(Product product) {
        products.put(product.getId(), product);
        return product;
    }

    @Override
    public Product getProductById(String id) {
        return products.get(id);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        if (products.containsKey(id)) {
            products.put(id, product);
            return product;
        }
        return null; // or throw exception
    }

    @Override
    public void deleteProduct(String id) {
        products.remove(id);
    }
}

