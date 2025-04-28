package com.softserve.academy.edu1.HW4.Hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter http code:");
        int code = sc.nextInt();

        HttpError error = new HttpError(code);


    }
}
