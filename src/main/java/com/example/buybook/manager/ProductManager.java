package com.example.buybook.manager;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.dto.ProductDtoManager;
import com.example.buybook.entity.Product;
import com.example.buybook.exception.ProductNotFoundException;
import com.example.buybook.mapper.ProductMapper;
import com.example.buybook.repository.ProductRepository;
import com.example.buybook.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Component
@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private final ProductRepository productRepository;

    private final ProductDtoManager productDtoManager;

    private final ProductMapper productMapper;
    @Override
    public List<ProductDto> getAll() {

        return productRepository.findAll().stream().
                map(productMapper::toProductDto).toList();
    }

    @Override
    public ProductDto getById(int id) {

        return productRepository.findById(id).stream().
                map(productMapper::toProductDto).
                findFirst().orElseThrow(()->new ProductNotFoundException("Product tapilmadi"));
    }

    @Override
    public void addProduct(ProductDto productDto) {
        productRepository.save(productMapper.toProductEntity(productDto));

    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);

    }
}
