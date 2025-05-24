package com.softserve.academy.homework12.Task2;

public class Task2 {
    public static final String text = "I  am  learning  Java  Fundamental";
    public static void main(String[] args) {
        System.out.println(text);
        String newText = text.trim().replaceAll("\\s+", " ");
        System.out.println(newText);
    }
}
