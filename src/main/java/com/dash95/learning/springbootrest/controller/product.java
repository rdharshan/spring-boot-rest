package com.dash95.learning.springbootrest.controller;

import com.dash95.learning.springbootrest.model.Milk;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class product {
    @RequestMapping("/")
    public List<Milk> getMilkBrands() {
        List<Milk> milkBrands = new ArrayList<>();
        Milk m1 = new Milk(1, "Nandhini");
        Milk m2 = new Milk(2, "Kaveri");
        milkBrands.add(m1);
        milkBrands.add(m2);
        return milkBrands;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
