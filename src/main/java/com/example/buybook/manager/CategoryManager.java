package com.example.buybook.manager;

import com.example.buybook.entity.Category;
import com.example.buybook.service.CategoryService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CategoryManager implements CategoryService {
     private static List<Category> list=new ArrayList<>();

     static{
         list.add(new Category(1,"dram"));
     }
    @Override
    public List<Category> getAll() {
        return list;
    }

    @Override
    public Category getById(int id) {
        return list.get(id-1);
    }

    @Override
    public void addCategory(Category category) {
         list.add(category);
    }

    @Override
    public void deletecategory(int id) {
         list.remove(id-1);

    }
}
