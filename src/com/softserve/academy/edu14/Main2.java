package com.softserve.academy.edu14;

import java.util.List;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        List<Employee2> employee2s = List.of(
                new Employee2("Jason"),
                new Employee2("Sam"),
                new Employee2("Sam"),
                        new Employee2("Nick")
        );
        Optional<String> result = PopName2.mostPopularName(employee2s.stream());
        System.out.println(result.orElse("No name found"));
    }
}
