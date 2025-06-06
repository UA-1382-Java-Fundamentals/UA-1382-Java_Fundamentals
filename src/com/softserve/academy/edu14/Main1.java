package com.softserve.academy.edu14;

import java.time.LocalDate;
import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<Product1> product1s = List.of(
          new Product1("iPhone 1", "Phone", LocalDate.now().minusYears(18), 700),
                new Product1("iPhone 2", "Phone", LocalDate.now().minusYears(17), 75),
                new Product1("iPhone 3", "Phone", LocalDate.now().minusYears(16), 90),
                new Product1("iPhone 4", "Phone", LocalDate.now().minusYears(15), 1100),
                new Product1("iPhone 5", "Phone", LocalDate.now().minusYears(14), 115),
                new Product1("iPhone 6", "Phone", LocalDate.now().minusYears(13), 130),
                new Product1("iPhone 7", "Phone", LocalDate.now().minusYears(12), 150),
                new Product1("iPhone 7 Plus", "Phone", LocalDate.now().minusYears(12), 170),
                new Product1("iPhone 8", "Phone", LocalDate.now().minusYears(11), 180),
                new Product1("iPhone 8 Plus", "Phone", LocalDate.now().minusYears(11), 190),
                new Product1("iPhone 9", "Phone", LocalDate.now().minusYears(10), 200),
                new Product1("iPhone 9 Plus", "Phone", LocalDate.now().minusYears(10), 2400),
                new Product1("iPhone 10", "Phone", LocalDate.now().minusYears(9), 260),
                new Product1("iPhone 10 Plus", "Phone", LocalDate.now().minusYears(9), 3000),
                new Product1("iPhone 11", "Phone", LocalDate.now().minusYears(8), 350),
                new Product1("iPhone 12", "Phone", LocalDate.now().minusYears(7), 3700),
                new Product1("iPhone 13", "Phone", LocalDate.now().minusYears(6), 400),
                new Product1("iPhone 14", "Phone", LocalDate.now().minusYears(5), 500),
                new Product1("iPhone 15", "Phone", LocalDate.now().minusYears(4), 6500),
                new Product1("iPhone 16", "Phone", LocalDate.now().minusYears(3), 12000)
        );
        List<Product1> filtered = product1s.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product1::getPrice))
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
