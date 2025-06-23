package com.mahendra.SimpleWeb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;


}

