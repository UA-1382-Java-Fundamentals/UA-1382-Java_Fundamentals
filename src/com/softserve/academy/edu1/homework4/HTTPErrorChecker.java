package homework4;

//Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.).
//The program should use an enum called HTTPError to map the input number to the corresponding name of the error and output it.

import java.util.Scanner;

enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_500("Internal Server Error");

    private final String message;

    HTTPError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class HTTPErrorChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an HTTP error code (e.g., 400, 401, 402, etc.). ");
        int code = scanner.nextInt();

        HTTPError error = switch (code) {
            case 400 -> HTTPError.ERROR_400;
            case 401 -> HTTPError.ERROR_401;
            case 402 -> HTTPError.ERROR_402;
            case 403 -> HTTPError.ERROR_403;
            case 404 -> HTTPError.ERROR_404;
            case 500 -> HTTPError.ERROR_500;
            default -> {
                System.out.println("Unknown HTTP error code.");
                yield null;
            }
        };
        if (error != null) {
            System.out.println("HTTP error code " + code + ": " + error.getMessage());
        }
    }
}
