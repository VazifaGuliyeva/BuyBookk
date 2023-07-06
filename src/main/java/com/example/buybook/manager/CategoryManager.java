package com.example.buybook.manager;

import com.example.buybook.entity.Category;
import com.example.buybook.repository.CategoryRepository;
import com.example.buybook.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Component
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {

        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {

        return categoryRepository.findById(id).get();
    }

    @Override
    public void addCategory(Category category) {

        categoryRepository.save(category);
    }

    @Override
    public void deletecategory(int id) {
         categoryRepository.deleteById(id);

    }
}
