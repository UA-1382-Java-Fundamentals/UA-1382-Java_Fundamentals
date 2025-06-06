package com.softserve.academy.edu14;

import java.time.LocalDate;

public class Product1 {
    private String name;
    private String category;
    private LocalDate manufactureDate;
    private double price;

    public Product1(String name, String category, LocalDate manufactureDate, double price) {
     this.name = name;
     this.category = category;
     this.manufactureDate = manufactureDate;
     this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " " + category + " " + manufactureDate + " " + price;
    }
}
