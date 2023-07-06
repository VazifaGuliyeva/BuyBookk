package com.example.buybook.repository;

import com.example.buybook.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Arxa planda sql ile bagli olan melumatlarla isleye bilmesini tanimasi ucundur,cunki repository mehz db-dan melumatlarin cekilmesi ile mesgul olur
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
