package com.dash95.learning.springbootrest.model;

public class Milk {
    private Integer id;
    private String brand;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Milk(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }
}
