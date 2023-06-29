package com.example.buybook.manager;

import com.example.buybook.entity.Product;
import com.example.buybook.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductManager implements ProductService {

    private static List<Product> list=new ArrayList<>();

    static {
        list.add(new Product(1,"Parfiya",23.90));
    }
    @Override
    public List<Product> getAll() {
        return list;
    }

    @Override
    public Product getById(int id) {
        return list.get(id-1);
    }

    @Override
    public void addProduct(Product product) {
        list.add(product);

    }

    @Override
    public void deleteProduct(int id) {
        list.remove(id-1);

    }
}
