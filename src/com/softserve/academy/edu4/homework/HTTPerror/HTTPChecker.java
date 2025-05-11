package com.softserve.academy.edu4.homework.HTTPerror;

import java.util.Scanner;

public class HTTPChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an HTTP error code (e.g., 400, 401, 404): ");
        int code = scan.nextInt();
        System.out.println("HTTP Error " + code + ": " + HTTPError.getCodeDescription(code));
    }
}
