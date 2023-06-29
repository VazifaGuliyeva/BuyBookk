package com.example.buybook.service;

import com.example.buybook.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    Product getById(int id);

    void addProduct(Product product);

    void deleteProduct(int id);
}
