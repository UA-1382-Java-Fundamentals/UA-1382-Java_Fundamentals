package practice.class1;

import java.util.Scanner;

public class ClothingStoreReceipt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input necessary data
        System.out.print("Enter the customer's name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the number of items: ");
        int itemsBought = scanner.nextInt();

        System.out.print("Enter the price per item (UAH): ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine();

        if (itemsBought < 0 || itemPrice < 0) {
            System.out.println("Number of items and price must be non-negative.");
            return;
        }

        int paymentChoice = 0;
        String paymentMethod = "";

        while (paymentChoice != 1 && paymentChoice != 2) {
            System.out.print("Select a payment method (1 - card, 2 - cash): ");

            if (scanner.hasNextInt()) {
                paymentChoice = scanner.nextInt();
                scanner.nextLine();

                if (paymentChoice == 1) {
                    paymentMethod = "Card";
                } else if (paymentChoice == 2) {
                    paymentMethod = "Cash";
                } else {
                    System.out.println("!!! Invalid choice. Please try again.");
                }
            } else {
                System.out.println("!!! Invalid input. Please try again.");
                scanner.nextLine();
            }
        }

        // Calculate total cost
        double totalCost = itemsBought * itemPrice;

        // Print purchase details
        System.out.println("\n----- Receipt -----");
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("--------------------");

        scanner.close();
    }
}
