package com.softserve.academy.edu1.Hw14.hw1_And_hw2;

public class Product {


    private String manufactureCategory;
    private String manufactureDate;
    private double price;

    Product(String manufactureCategory, String manufactureDate, double price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }
}
