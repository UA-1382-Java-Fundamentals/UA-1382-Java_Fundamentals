package com.softserve.academy.homework13.practicalTask3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        var names =  new ArrayList<>(List.of("bob","Alice","Bob"));
        names.sort((a, b) ->a.compareToIgnoreCase(b));
        System.out.println(names);
        names.sort(String::compareTo);
        System.out.println(names );
    }
}
