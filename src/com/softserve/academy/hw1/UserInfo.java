package com.softserve.academy.hw1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        //String name;
        String address;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Where do you live, " + name + " ?");
        address = input.nextLine();

        System.out.println("Name: " + name + ", Address: " + address);
    }
}
