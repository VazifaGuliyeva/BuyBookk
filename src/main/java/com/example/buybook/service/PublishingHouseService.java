package com.example.buybook.service;

import com.example.buybook.dto.PublishingHouseDto;
import com.example.buybook.dto.PublishingHousePageResponse;
import com.example.buybook.entity.PublishingHouse;

import java.util.List;

public interface PublishingHouseService {

    PublishingHousePageResponse getAll(int page, int count);

    PublishingHouseDto getById(int id);

    void addPublishingHouse(PublishingHouseDto publishingHouseDto);

    void deletePublishingHouse(int id);
}
