package com.softserve.academy.hw12_t4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextOperations {
    String text;

    public void validateFirstNameAndLastName() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first name and last name using: English letters, spaces and hyphens");

        Pattern pattern = Pattern.compile("^[a-z -]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sc.nextLine());

        try {
            while (!matcher.find()) {
                System.out.println("Not a correct format. Please input first name and last name using: English letters, spaces and hyphens");
                matcher = pattern.matcher(sc.nextLine());
            }

            text = matcher.group();

        } catch (Exception e) {
            throw new Exception("Unknown error");
        }
    }

    public void printf() {
        List<Integer> greetings = Arrays.asList(1, 2, 3);

        Random random = new Random();
        int randomGreeting = greetings.get(random.nextInt(greetings.size()));

        switch (randomGreeting) {
            case 1:
                System.out.println("Hello " + text);
                break;
            case 2:
                System.out.println("Greetings for " + text);
                break;
            case 3:
                System.out.println("Happy new day " + text);
                break;
            default:
                System.out.println("Hi " + text);
        }
    }
}
