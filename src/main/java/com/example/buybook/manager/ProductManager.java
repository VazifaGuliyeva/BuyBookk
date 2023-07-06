package com.example.buybook.manager;

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
    @Override
    public List<Product> getAll() {

        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {

        return productRepository.findById(id).get();
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
