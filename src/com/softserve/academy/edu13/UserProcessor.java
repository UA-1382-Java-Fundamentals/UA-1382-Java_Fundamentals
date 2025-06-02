package com.softserve.academy.edu13;

import java.util.List;
import java.util.function.*;

public class UserProcessor {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Charlie");

        // Function: get length of a name
        Function<String, Integer> getNameLength = name -> name.length();

        // UnaryOperator: convert name to uppercase
        UnaryOperator<String> toUpperCase = name -> name.toUpperCase();

        // BiFunction: combine name with user ID
        BiFunction<String, Integer, String> createUserLabel = (name, id) -> "User#" + id + ": " + name;

        // IntFunction: create a message template based on ID
        IntFunction<String> idTemplate = id -> "Processing user with ID " + id;

        for (int i = 0; i < names.size(); i++) {
            String originalName = names.get(i);
            int id = i + 1;

            System.out.println(idTemplate.apply(id));                        // IntFunction
            String upperName = toUpperCase.apply(originalName);             // UnaryOperator
            int length = getNameLength.apply(upperName);                    // Function
            String label = createUserLabel.apply(upperName, id);            // BiFunction

            System.out.println(label + " (Length: " + length + ")");
            System.out.println("------");
        }

    }
}
