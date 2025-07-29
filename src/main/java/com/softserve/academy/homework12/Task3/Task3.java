package com.softserve.academy.homework12.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String pattern = "\\$\\d+\\.\\d{2}";
        List<String> inputs = new ArrayList<>();
        input(inputs);
        printMatches(inputs, pattern);
    }

    private static void printMatches(List<String> inputs, String pattern) {
        Pattern p = Pattern.compile(pattern);
        for (String input : inputs) {
            Matcher m = p.matcher(input);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }

    public static void input(List<String> inputs){
        System.out.println("Input a text containing several instances of US currency format via the console.");
        System.out.println("For end of input, enter the string \"end\"");

        //inputs.add("$200.11");
        //inputs.add("$0.11");
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end") && !input.equalsIgnoreCase("exit")){
            inputs.add(input);
            input = scanner.nextLine();
        }
    }
}
