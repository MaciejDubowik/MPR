package com.example.demo.controller;

import com.example.demo.car.Car;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private Service service;

    @Autowired
    public CarController(Service service){
        this.service = service;
    }

    @GetMapping("/car/{id}")
    public String getCar(@PathVariable String id){
        return service.getcar(id).getBrand();
    }
}
