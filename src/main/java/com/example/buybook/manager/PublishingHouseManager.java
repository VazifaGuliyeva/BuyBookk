package com.example.buybook.manager;

import com.example.buybook.dto.PublishingHouseDto;
import com.example.buybook.dto.PublishingHouseDtoManager;
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

    private final PublishingHouseDtoManager publishingHouseDtoManager;
    @Override
    public List<PublishingHouseDto> getAll() {

        return publishingHouseRepository.findAll().stream().map(publishingHouseDtoManager).toList();
    }

    @Override
    public PublishingHouseDto getById(int id) {

        return publishingHouseRepository.findById(id).stream().map(publishingHouseDtoManager).findFirst().get();
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
