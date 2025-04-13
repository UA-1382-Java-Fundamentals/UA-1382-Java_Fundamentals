package com.softserve.academy.edu1.Java_Introduction;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        String name;
        String address;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.printf("Where do you live, %s?%n", name);
        address = sc.nextLine();
        System.out.printf("Name: %s %nAddress: %s",name,address);
        sc.close();
    }
}

