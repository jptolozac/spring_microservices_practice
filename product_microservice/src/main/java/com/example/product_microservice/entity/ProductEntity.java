package com.example.product_microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(value = "product")
public class ProductEntity implements Serializable {
    String id;
    String name;
    String description;
    String unitPrice;
}
