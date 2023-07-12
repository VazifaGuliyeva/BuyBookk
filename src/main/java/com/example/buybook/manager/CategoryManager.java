package com.example.buybook.manager;

import com.example.buybook.dto.CategoryDto;
import com.example.buybook.dto.CategoryDtoManager;
import com.example.buybook.entity.Category;
import com.example.buybook.exception.CategoryNotFoundException;
import com.example.buybook.mapper.CategoryMapper;
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

    private final CategoryDtoManager categoryDtoManager;

    private final CategoryMapper categoryMapper;
    @Override
    public List<CategoryDto> getAll() {

     //   return categoryRepository.findAll().stream().map(category -> new CategoryDto(category.getCategoryName())).toList();

        return categoryRepository.findAll().stream().
                map(categoryMapper::toCategoryDto).toList();
    }

    @Override
    public CategoryDto getById(int id) {

        //return categoryRepository.findById(id).stream().map(category -> new CategoryDto(category.getCategoryName())).findFirst().get();
        return categoryRepository.findById(id).stream()
                .map(categoryMapper::toCategoryDto).
                findFirst().orElseThrow(()->new CategoryNotFoundException("Category tapilmadi"));

    }

    @Override
    public void addCategory(CategoryDto categoryDto) {

        categoryRepository.save(categoryMapper.categoryEntity(categoryDto));
    }

    @Override
    public void deletecategory(int id) {
         categoryRepository.deleteById(id);

    }
}
