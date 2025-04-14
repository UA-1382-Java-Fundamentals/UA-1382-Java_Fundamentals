package com.softserve.academy.edu1.homework.hw01;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name?");

            String name = scanner.nextLine();
            System.out.println(String.format("Where do you live, %s?", name));

            String address = scanner.nextLine();
            System.out.println(String.format("Name: %s, Address: %s", name, address));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
