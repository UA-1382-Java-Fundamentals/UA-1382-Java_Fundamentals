package com.softserve.academy.edu03.homework.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person p1 = new Person();
        p1.input(scan);

        Person p2 = new Person("Katrin", "West");
        p2.setBirthYear(2002);

        Person p3 = new Person();
        p3.input(scan);

        p1.output();

        p1.changeName("Julia", "Canv");

        Person p4 = new Person();
        p4.input(scan);

        p1.output();
        p2.output();

        scan.close();
    }
}
