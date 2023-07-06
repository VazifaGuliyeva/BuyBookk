package com.example.buybook.manager;

import com.example.buybook.entity.PublishingHouse;
import com.example.buybook.repository.PublishingHouseRepository;
import com.example.buybook.service.PublishingHouseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
@AllArgsConstructor
public class PublishingHouseManager implements PublishingHouseService{

    private final PublishingHouseRepository publishingHouseRepository;
    @Override
    public List<PublishingHouse> getAll() {

        return publishingHouseRepository.findAll();
    }

    @Override
    public PublishingHouse getById(int id) {

        return publishingHouseRepository.findById(id).get();
    }

    @Override
    public void addPublishingHouse(PublishingHouse publishingHouse) {
        publishingHouseRepository.save(publishingHouse);

    }

    @Override
    public void deletePublishingHouse(int id) {
        publishingHouseRepository.deleteById(id);

    }
}
