package com.softserve.academy.edu1.Hw14.hw1_And_hw2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
    List<Product> products = new ArrayList<Product>();
    products.add(new Product("Phone", "01.05.2025", 2500));
    products.add(new Product("PC", "02.05.2024", 9000));
    products.add(new Product("Laptop", "03.05.2023", 35200));
    products.add(new Product("Keyboard", "04.05.2021", 2500));
    products.add(new Product("Phone", "05.05.2022", 2200));
    products.add(new Product("PC", "06.05.2020", 6500));
    products.add(new Product("Laptop", "07.05.2022", 6500));
    products.add(new Product("Keyboard", "08.05.2021", 6500));
    products.add(new Product("Phone", "09.05.2024", 9500));
    products.add(new Product("PC", "10.05.2022", 6500));
    products.add(new Product("Phone", "11.05.2021", 6500));
    products.add(new Product("Laptop", "12.05.2024", 2500));
    products.add(new Product("Keyboard", "13.05.2021", 2500));
    products.add(new Product("PC", "14.05.2022", 2500));
    products.add(new Product("Keyboard", "15.05.2022", 2500));
    products.add(new Product("Laptop", "16.05.2025", 2500));
    products.add(new Product("Phone", "17.05.2025", 6500));
    products.add(new Product("PC", "18.05.2022", 2000));
    products.add(new Product("Keyboard", "19.05.2021", 6500));
    products.add(new Product("Laptop", "20.05.2022", 6500));
    products.add(new Product("Phone", "21.05.2024", 1500));

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");//Ідею взяв з Stack Overflow + gpt нарадив
    Date oneYearAgo = year(new Date());

    List<Product> teleploneSorting = products.stream()
            .filter(p -> p.getManufactureCategory().equals("Phone"))
            .filter(p -> p.getPrice() > 3000)
            .filter(p -> {
                try {
                    return sdf.parse(p.getManufactureDate()).before(oneYearAgo);
                } catch (ParseException e) {
                    return false;
                }
            })
            .sorted(Comparator.comparing(Product::getPrice))
            .collect(Collectors.toList());

    teleploneSorting.forEach(p -> System.out.println(
            p.getManufactureCategory() + " | " + p.getManufactureDate() + " | " + p.getPrice()
    ));


    List<Employee> employees = List.of(
            new Employee("Oleh"),
            new Employee("Anna"),
            new Employee("Oleh"),
            new Employee("Ivan"),
            new Employee("Anna"),
            new Employee("Oleh"),
            new Employee("Maria"),
            new Employee("Anna")
    );

    Optional<String> mostPopular = mostPopularName(employees.stream());

    if (mostPopular.isPresent()) {
        System.out.println("Most popular name: " + mostPopular.get());
    } else {
        System.out.println("No employees found.");
    }


}

    private static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }


    public static Date year(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -1);
        return cal.getTime();
    }
}
