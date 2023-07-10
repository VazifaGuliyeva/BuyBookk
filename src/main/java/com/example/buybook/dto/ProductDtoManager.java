package com.example.buybook.dto;

import com.example.buybook.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ProductDtoManager implements Function<Product,ProductDto> {
    @Override
    public ProductDto apply(Product product) {
        return new ProductDto(product.getProductName(),product.getProductPrice(),product.getAuthor(),product.getCategory(),product.getPublishingHouse());
    }
}
