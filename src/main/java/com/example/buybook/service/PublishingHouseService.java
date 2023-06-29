package com.example.buybook.service;

import com.example.buybook.entity.PublishingHouse;

import java.util.List;

public interface PublishingHouseService {

    List<PublishingHouse> getAll();

    PublishingHouse getById(int id);

    void addPublishingHouse(PublishingHouse publishingHouse);

    void deletePublishingHouse(int id);
}
