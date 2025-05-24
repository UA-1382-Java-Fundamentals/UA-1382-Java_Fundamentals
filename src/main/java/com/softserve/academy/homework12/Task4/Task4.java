package com.softserve.academy.homework12.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Task4 {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z]+([\\s-][a-zA-Z]+)*$";
        var scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        while (!name.matches(pattern)) {
            System.out.println("Invalid name. Try again.");
            name = scanner.nextLine();
        }
        randomPrint(name);
    }

    private static void randomPrint(String name) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hola");
        list.add("Bonjour");
        list.add("Ciao");
        list.add("Hallo");
        list.add("qq");
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        System.out.printf("%s, %s%n", list.get(randomNumber), name);
    }

}
