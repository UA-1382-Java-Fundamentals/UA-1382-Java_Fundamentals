package com.softserve.academy.edu1.Condition_Statements.Homework_3;

import java.util.Scanner;

public class HTTPErrorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP error code (e.g., 400, 404, 500): ");
        int code = scanner.nextInt();

        HTTPError error = HTTPError.fromCode(code);

        if (error != null) {
            System.out.println("Error message: " + error.getMessage());
        } else {
            System.out.println("Unknown HTTP error code.");
        }

        scanner.close();
    }
}