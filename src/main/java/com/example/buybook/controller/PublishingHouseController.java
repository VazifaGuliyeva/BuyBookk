package com.example.buybook.controller;

import com.example.buybook.dto.PublishingHouseDto;
import com.example.buybook.dto.PublishingHousePageResponse;
import com.example.buybook.entity.PublishingHouse;
import com.example.buybook.manager.PublishingHouseManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publishinghouses")
public class PublishingHouseController {

    Logger logger= LoggerFactory.getLogger(PublishingHouseController.class);

    private final PublishingHouseManager publishingHouseManager;

    public PublishingHouseController(PublishingHouseManager publishingHouseManager) {
        this.publishingHouseManager = publishingHouseManager;
    }
    @GetMapping
    public PublishingHousePageResponse getAll(@RequestParam(value = "page") int page, @RequestParam(value="count")int count){
        logger.info("getAll request accepted");

        return publishingHouseManager.getAll(page,count);
    }
    @GetMapping("/{id}")
    public PublishingHouseDto getById(@PathVariable int id){
        logger.info("getId reqeust accepted");

        return publishingHouseManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addPublishingHouse(@RequestBody PublishingHouseDto publishingHouseDto){
        publishingHouseManager.addPublishingHouse(publishingHouseDto);
    }
    @DeleteMapping("/{id}")
    public void deletePublishingHouses(@PathVariable int id){
        publishingHouseManager.deletePublishingHouse(id);
    }

}
