package com.example.buybook.dto;

import com.example.buybook.entity.Author;
import com.example.buybook.entity.Category;
import com.example.buybook.entity.PublishingHouse;

public record ProductDto(
        String ProductName,
        double ProductPrice,
        Author author,
        Category category,
        PublishingHouse publishingHouse
) {
}
