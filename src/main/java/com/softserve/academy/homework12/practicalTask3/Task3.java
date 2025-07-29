package com.softserve.academy.homework12.practicalTask3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter username");
            String userName = scanner.nextLine();
            boolean isValid = validate(userName);
            if(isValid){
                System.out.printf("Username '%s' is valid%n", userName);
            }else {
                System.out.printf("Username '%s' is invalid%n", userName);
            }
        }
    }
    public static boolean validate(String userName){
        return userName.matches("^[a-zA-Z0-9_-]{3,16}$");
    }
}
