package com.example.buybook.dto;

import com.example.buybook.entity.PublishingHouse;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class PublishingHouseDtoManager implements Function<PublishingHouse,PublishingHouseDto> {
    @Override
    public PublishingHouseDto apply(PublishingHouse publishingHouse) {
        return new PublishingHouseDto(publishingHouse.getPublishingHouseName());
    }
}
