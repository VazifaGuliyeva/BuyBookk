package com.example.buybook.service;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();

    ProductDto getById(int id);

    void addProduct(Product product);

    void deleteProduct(int id);
}
