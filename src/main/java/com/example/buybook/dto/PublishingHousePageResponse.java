package com.example.buybook.dto;

import java.util.List;

public record PublishingHousePageResponse(
        List<PublishingHouseDto> authors,
        long totalElements,
        int totalPages,
        boolean hasNextPage
) {
}
