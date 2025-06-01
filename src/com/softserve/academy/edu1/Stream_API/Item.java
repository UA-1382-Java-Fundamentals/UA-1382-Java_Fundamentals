package com.softserve.academy.edu1.Stream_API;

import java.time.LocalDate;

// На назву класу Product свариться сонар, оскільки в Java є клас Product, який використовується для роботи з файлами JAR.
public class Item {
    private String category;
    private LocalDate manufactureDate;
    private double price;

    public Item(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
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
        return category + " | " + manufactureDate + " | " + price;
    }
}