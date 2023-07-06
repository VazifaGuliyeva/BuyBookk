package com.example.buybook.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity(name="Categories")
public class Category {
     @Id
     Integer CategoryId;
     @Column(name="Category_Name")
     String CategoryName;

  //   @OneToMany(mappedBy = "category")
    // List<Product> products;
}
