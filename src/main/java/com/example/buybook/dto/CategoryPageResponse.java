package com.example.buybook.dto;

import java.util.List;

public record CategoryPageResponse(
        List<CategoryDto> authors,
        long totalElements,
        int totalPages,
        boolean hasNextPage
) {
}
