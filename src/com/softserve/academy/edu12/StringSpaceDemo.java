package com.softserve.academy.edu12;

public class StringSpaceDemo {
    public static void main(String[] args) {
        String str1 = "\tHello world\t";
        String str2 = "    Hello world     ";
        String str3 = "\u001C Hello world";

        System.out.println("Trim: " + str1.trim());
        System.out.println("Trim: " + str2.trim());
        System.out.println("Strip: " + str2.stripTrailing());
        System.out.println("Strip: " + str2.stripLeading());
        System.out.println("Strip: " + str2.strip());
        System.out.println(str3.trim());
        System.out.println(str3.strip());
    }
}
