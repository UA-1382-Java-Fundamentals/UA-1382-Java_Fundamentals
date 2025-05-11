package com.softserve.academy.edu1.practice.lesson4;

public class ProductAnalysis {
    static class Product {
        String name;
        double price;
        int quantity;

        Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Milk", 1.5, 10);
        Product p2 = new Product("Bread", 2.0, 5);
        Product p3 = new Product("Cheese", 5.0, 2);
        Product p4 = new Product("Apple", 3.0, 20);

        Product mostExpensive = p1;
        Product mostQuantity = p1;

        Product[] products = {p1, p2, p3, p4};
        for (Product p : products) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
            if (p.quantity > mostQuantity.quantity) {
                mostQuantity = p;
            }
        }

        System.out.println("Most expensive: " + mostExpensive.name + ", quantity: " + mostExpensive.quantity);
        System.out.println("Biggest quantity: " + mostQuantity.name);
    }
}
