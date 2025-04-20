package com.softserve.academy.edu1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я ");
        String name;
        String address;
        name = sc.nextLine();
        System.out.print("Яка ваша адреса, " + name + "? ");
        address = sc.nextLine();
        System.out.println("Ім'я: " + name + ", адреса: " + address);

        sc.close();
    }
}
