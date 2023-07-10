package com.example.buybook.manager;

import com.example.buybook.dto.ProductDto;
import com.example.buybook.dto.ProductDtoManager;
import com.example.buybook.entity.Product;
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
    @Override
    public List<ProductDto> getAll() {

        return productRepository.findAll().stream().map(productDtoManager).toList();
    }

    @Override
    public ProductDto getById(int id) {

        return productRepository.findById(id).stream().map(productDtoManager).findFirst().get();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);

    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);

    }
}
