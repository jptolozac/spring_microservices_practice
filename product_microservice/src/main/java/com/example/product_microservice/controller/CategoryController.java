package com.example.product_microservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
public class CategoryController {

    @Value("${app.testProp}")
    String testProp;

    @GetMapping("/")
    public String getTestProp() {
        return this.testProp;
    }
}
