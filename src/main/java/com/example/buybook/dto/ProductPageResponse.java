package com.example.buybook.dto;

import java.util.List;

public record ProductPageResponse(
        List<ProductDto> authors,
        long totalElements,
        int totalPages,
        boolean hasNextPage
) {

}
