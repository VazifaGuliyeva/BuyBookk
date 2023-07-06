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
@Entity(name="Authors") // JPA-nin authoru bir cedvel kimi tanimasi ucun istifade olunan annotasiya
public class Author {
     @Id  //ID primary key xususiyytei verir
     Integer AuthorId;
     @Column(name="Author_name")
     String AuthorName;

  //   @OneToMany(mappedBy = "author")  //author ManyToOne elaqesinde olan obyekt authordur.OneToMany elaqseinde hemise List deyer qaytarilmalidir,cunki bir nece element qaytarilmis olur
   //  List<Product> products;--dovr yaranib xeta atir deye onetomanyler silinir



}


//spring.datasource.url=jdbc:h2:mem:BuyBook- h2 database den istifade ucun
//devtools bizim deyisiklerimizi avtomatik olaraq elave edir