package com.softserve.academy.edu1.Hw13.hw2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List timeChekings = new ArrayList();
        timeChekings.add(TimeCheking.isValidDate("02.20.25"));
        timeChekings.add(TimeCheking.isValidDate("02.05.26"));
        timeChekings.add(TimeCheking.isValidDate("42.10.27"));
        timeChekings.add(TimeCheking.isValidDate("15.05.99"));
        timeChekings.add(TimeCheking.isValidDate("01.01.999"));
        timeChekings.forEach(System.out::println);
    }
}
