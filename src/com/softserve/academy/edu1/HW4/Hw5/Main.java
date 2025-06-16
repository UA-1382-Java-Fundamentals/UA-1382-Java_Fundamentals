package com.softserve.academy.edu1.HW4.Hw5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Faculty");
        String faculty = sc.nextLine();
        System.out.println("Enter Number of Students");
        int numOfStudents = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter season of studying");
        String season = sc.nextLine();

        Faculty f1 = new Faculty(faculty,numOfStudents,season);
    }
}
