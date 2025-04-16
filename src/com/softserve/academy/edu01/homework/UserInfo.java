package com.softserve.academy.edu01.homework;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi. What is your name?");
        String name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();
        sc.close();

        System.out.print("Name: " + name + "\nAddress: " + address);

    }
}
