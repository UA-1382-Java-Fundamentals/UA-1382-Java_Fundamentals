package softserve.academy.edu1.hw1.UserInfo;

import java.util.Scanner;

public class UserInfo {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = null;
        String address = null;
        while (true) {
            try {
                name = inputData("Welcome! \nWhat's your name? ");
                String prompt = String.format("And where do you live, %s? ", name);
                address = inputData(prompt);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        String output = String.format("Name: %s, Address: %s.", name, address);
        System.out.println(output);

        SCANNER.close();
    }

    static String inputData (String message) {
        System.out.print(message);
        String input = SCANNER.nextLine();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("The field cannot be empty!");
        }
        return input;

    }
}
