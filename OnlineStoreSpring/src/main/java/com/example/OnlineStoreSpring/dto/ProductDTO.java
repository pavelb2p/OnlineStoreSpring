package com.example.OnlineStoreSpring.dto;

import com.example.OnlineStoreSpring.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
