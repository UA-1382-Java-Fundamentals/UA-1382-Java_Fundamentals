package com.softserve.academy.edu1.Hw12.hw3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text with US currency values:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Found US currency values:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    }

