package com.example.buybook.manager;

import com.example.buybook.entity.PublishingHouse;
import com.example.buybook.service.PublishingHouseService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PublishingHouseManager implements PublishingHouseService{
    @Override
    public List<PublishingHouse> getAll() {
        return null;
    }

    @Override
    public PublishingHouse getById(int id) {
        return null;
    }

    @Override
    public void addPublishingHouse(PublishingHouse publishingHouse) {

    }

    @Override
    public void deletePublishingHouse(int id) {

    }
}
