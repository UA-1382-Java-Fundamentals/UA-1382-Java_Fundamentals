package softserve.academy.homework4.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input a number representing an HTTP error (e.g., 400, 401, 402, etc.).");
        Scanner scanner = new Scanner(System.in);
        int errorNumber = scanner.nextInt();

        String errorMessage = HTTPError.getErrorMessage(errorNumber);
        System.out.println("Error " + errorNumber + ": " + errorMessage);
    }
}
