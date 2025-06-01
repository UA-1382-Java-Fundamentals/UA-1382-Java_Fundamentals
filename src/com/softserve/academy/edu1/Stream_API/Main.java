package com.softserve.academy.edu1.Stream_API;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Item> items = List.of(
                new Item("Phone", LocalDate.now().minusYears(2), 5000),
                new Item("Phone", LocalDate.now().minusYears(1).minusDays(1), 3200),
                new Item("Laptop", LocalDate.now().minusYears(3), 10000),
                new Item("Phone", LocalDate.now().minusMonths(6), 4500),
                new Item("Phone", LocalDate.now().minusYears(2), 1500),
                new Item("Phone", LocalDate.now().minusYears(2), 6000),
                new Item("Phone", LocalDate.now().minusYears(1).minusDays(10), 3400),
                new Item("Tablet", LocalDate.now().minusYears(2), 3500),
                new Item("Phone", LocalDate.now().minusYears(3), 7000),
                new Item("Phone", LocalDate.now().minusYears(2), 8000),
                new Item("Phone", LocalDate.now().minusYears(2), 3900),
                new Item("Phone", LocalDate.now().minusYears(2), 3100),
                new Item("Phone", LocalDate.now().minusYears(1), 3050),
                new Item("Phone", LocalDate.now().minusYears(1), 2900),
                new Item("Phone", LocalDate.now().minusYears(4), 9000),
                new Item("Phone", LocalDate.now().minusYears(2), 500),
                new Item("TV", LocalDate.now().minusYears(2), 4000),
                new Item("Phone", LocalDate.now().minusYears(2), 4500),
                new Item("Phone", LocalDate.now().minusYears(5), 3600),
                new Item("Phone", LocalDate.now().minusYears(2), 4300)
        );

        List<Item> filtered = items.stream()
                .filter(i -> i.getCategory().equals("Phone"))
                .filter(i -> i.getPrice() > 3000)
                .filter(i -> i.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Item::getPrice))
                .collect(Collectors.toList());

        System.out.println("📦 Відібрані товари:");
        filtered.forEach(System.out::println);


        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopular = NameUtils.mostPopularName(employeeStream);
        System.out.println("\n👤 Найпопулярніше імʼя: " + mostPopular.orElse("Немає"));
    }
}