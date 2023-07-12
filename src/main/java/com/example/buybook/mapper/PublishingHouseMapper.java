package com.example.buybook.mapper;


import com.example.buybook.dto.PublishingHouseDto;
import com.example.buybook.entity.PublishingHouse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublishingHouseMapper {

    PublishingHouseDto topublishingHouseDto(PublishingHouse publishingHouse);

    PublishingHouse toPublishingHouseEntity(PublishingHouseDto publishingHouseDto);
}
