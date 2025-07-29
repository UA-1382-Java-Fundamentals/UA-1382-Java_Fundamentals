package com.softserve.academy.homework12.practicalTask1;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = "SoftServe Academy";
        String fragment = "Serve";
        String quoted = Pattern.quote(fragment);

        System.out.println(text.contains(fragment));
        System.out.println(text.indexOf(fragment) > -1);
        System.out.println(text.matches(".*" + fragment + ".*"));

        System.out.println(fragment);
        System.out.println(quoted);
        System.out.println(text.matches(".*" + quoted + ".*"));
    }
}
