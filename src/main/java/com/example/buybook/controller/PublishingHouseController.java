package com.example.buybook.controller;

import com.example.buybook.entity.PublishingHouse;
import com.example.buybook.manager.PublishingHouseManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PublishingHouseController {

    private final PublishingHouseManager publishingHouseManager;

    public PublishingHouseController(PublishingHouseManager publishingHouseManager) {
        this.publishingHouseManager = publishingHouseManager;
    }
    @GetMapping("/publishinghouses")
    public List<PublishingHouse> getAll(){
        return publishingHouseManager.getAll();
    }
    @GetMapping("/publishinghouses/{id}")
    public PublishingHouse getById(@PathVariable int id){
        return publishingHouseManager.getById(id);
    }
    @PostMapping("/publishinghouses")
    public void addPublishingHouse(@RequestBody PublishingHouse publishingHouse){
        publishingHouseManager.addPublishingHouse(publishingHouse);
    }
    @DeleteMapping("/publishinghouses/{id}")
    public void deletePublishingHouses(@PathVariable int id){
        publishingHouseManager.deletePublishingHouse(id);
    }

}
