package com.example.buybook.repository;

import com.example.buybook.entity.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouse,Integer> {
}
