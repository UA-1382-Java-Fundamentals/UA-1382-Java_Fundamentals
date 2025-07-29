package com.softserve.academy.finalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startCinema();
    }

    public static void startCinema() {
        int row = inputNumber("Enter the number of rows:");
        int seatsInRow = inputNumber("Enter the number of seats in each row:");

        Cinema cinema = new Cinema(row, seatsInRow);
        menu(cinema);
    }

    public static void menu(Cinema cinema) {
        int choice;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            choice = inputMenuNumber("Enter your choice:");
            switch (choice) {
                case 1:
                    cinema.printSeats();
                    System.out.println();
                    break;
                case 2:
                    boolean success = false;

                    while (!success) {
                        int rowNumber = inputNumber("Enter a row number:");
                        int seatNumber = inputNumber("Enter a seat number in that row:");


                        if(!cinema.isValidSeat(rowNumber, seatNumber)){
                            System.out.println("Wrong input!");
                            continue;
                        }
                        if (cinema.isSeatTaken(rowNumber, seatNumber)) {
                            System.out.println("That ticket has already been purchased!");
                            continue;
                        }
                        System.out.println("Ticket price: $" + cinema.ticketPrice(rowNumber));
                        cinema.bookSeat(rowNumber, seatNumber);
                        success = true;
                    }
                    break;
                case 3:
                    cinema.printStatistics();
                    break;

                case 0:
                    System.out.println("Thank you for choosing us!");
                    break;
                default:
                    System.out.println("Wrong choice! Please enter a number between 0 and 2.");
            }
        } while (choice != 0);
    }
    public static int inputMenuNumber(String message) {
        System.out.println(message);
        var scanner = new Scanner(System.in);
        int temp = -1;
        boolean isTrue = false;
        while (!isTrue) {
            try {
                String input = scanner.nextLine();
                temp = Integer.parseInt(input);
                if (temp > -1 && temp < 4) {
                    isTrue = true;
                } else {
                    System.out.println("Please enter the position from menu:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter a number between 0 and 2:");
            }
        }
        return temp;
    }

    public static int inputNumber(String message) {
        System.out.println(message);
        var scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTrue = false;
        while (!isTrue) {
            try {
                String input = scanner.nextLine();
                temp = Integer.parseInt(input);
                if (temp > 0) {
                    isTrue = true;
                } else {
                    System.out.println("Please enter a positive number:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter an integer:");
            }
        }
        return temp;
    }
}
