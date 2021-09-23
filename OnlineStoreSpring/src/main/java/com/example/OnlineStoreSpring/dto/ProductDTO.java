package com.example.OnlineStoreSpring.dto;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductDTO {
    private int id;
    private String name;
    private int categoryId;
    private BigDecimal price;
    private double weight;
    private String description;
    private String imageName;
}
