package com.example.buybook.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity(name="Products")
public class Product {
     @Id
     Integer ProductId;
     @Column(name="Product_Name")
     String ProductName;
     @Column(name="Product_Price")
     double ProductPrice;

     @ManyToOne
     @JoinColumn(name="AuthorId")
     Author author;

     @ManyToOne
     @JoinColumn(name="CategoryId")
     Category category;

     @ManyToOne
     @JoinColumn(name="PublishingHouseId")
     PublishingHouse publishingHouse;
}
