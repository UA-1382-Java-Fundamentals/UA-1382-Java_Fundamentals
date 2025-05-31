package com.softserve.academy.homework14.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Phone", LocalDate.of(1992,10,7), 4500));
        productsList.add(new Product("Laptop", LocalDate.of(2023, 3, 5), 8500));
        productsList.add(new Product("Tablet", LocalDate.of(2021, 6, 15), 3200));
        productsList.add(new Product("Phone", LocalDate.of(2020, 12, 25), 3100));
        productsList.add(new Product("TV", LocalDate.of(2022, 7, 20), 5000));
        productsList.add(new Product("Phone", LocalDate.of(2021, 5, 30), 2999));
        productsList.add(new Product("Camera", LocalDate.of(2023, 1, 1), 2700));
        productsList.add(new Product("Phone", LocalDate.of(2022, 11, 10), 6000));
        productsList.add(new Product("Phone", LocalDate.of(2023, 4, 18), 3300));
        productsList.add(new Product("Phone", LocalDate.of(2021, 2, 14), 2900));
        productsList.add(new Product("Tablet", LocalDate.of(2022, 9, 9), 3100));
        productsList.add(new Product("Phone", LocalDate.of(2023, 6, 6), 4500));
        productsList.add(new Product("Smartwatch", LocalDate.of(2020, 8, 8), 1500));
        productsList.add(new Product("Phone", LocalDate.of(2022, 3, 12), 3800));
        productsList.add(new Product("Phone", LocalDate.of(2021, 1, 1), 2000));
        productsList.add(new Product("Phone", LocalDate.of(2022, 10, 22), 7000));
        productsList.add(new Product("TV", LocalDate.of(2023, 2, 28), 6400));
        productsList.add(new Product("Phone", LocalDate.of(2020, 6, 1), 4500));
        productsList.add(new Product("Phone", LocalDate.of(2023, 5, 20), 5100));
        productsList.add(new Product("Laptop", LocalDate.of(2021, 7, 13), 9000));

        productsList.stream()
                .filter(product -> product.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(2)))
                .forEach(System.out::println);


    }
}
