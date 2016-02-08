package com.company;


public class Car implements Sellable {
    private String model;
    private int year;
    private int price;

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return model;
    }

    @Override
    public String description() {
        return "manufactured in " + year;
    }
}

