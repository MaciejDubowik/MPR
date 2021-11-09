package com.example.demo.service;

import com.example.demo.car.Car;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Service {
    HashMap<String, Car> carsInService = new HashMap<String, Car>();

    public Service() {


        carsInService.put("1",new Car("Opel", "Meriva", 2000, "Yellow"));
        carsInService.put("2", new Car( "Fiat", "Punto", 2007, "Blue"));
        carsInService.put("3", new Car( "Citroen", "Fajen", 2006, "Purple"));
        carsInService.put("4", new Car("Nissan", "R34", 1998, "Red"));



    }

    public Car getcar(String id){
        return carsInService.get(id);
    }

}
