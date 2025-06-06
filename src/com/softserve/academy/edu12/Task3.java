package com.softserve.academy.edu12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input the currency value
        System.out.println("Enter the US currency value");
        String input = sc.nextLine();

        //Regex pattern for the US currency
        String regex = "\\$\\d+\\.\\d{2}";

        //Creating pattern and matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        //Detecting and not detecting US currency
        boolean found = false;
        while (matcher.find()) {
            if (!found) {
                System.out.println("US currency value detected");
                found = true;
            }
            System.out.println(matcher.group());
        }
        if (!found) {
            System.out.println("No value detected");
        }
        sc.close();
    }
}
