package com.example.buybook.service;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.dto.ProductPageResponse;
import com.example.buybook.entity.Product;

import java.util.List;

public interface ProductService {

    ProductPageResponse getAll(int page, int count);

    ProductDto getById(int id);

    void addProduct(ProductDto productDto);

    void deleteProduct(int id);
}
