package com.softserve.academy.homework14.Task2;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"));
        System.out.println(mostPopularName(employees.stream()));

    }
    static Optional<String> mostPopularName(Stream<Employee> employees){
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
