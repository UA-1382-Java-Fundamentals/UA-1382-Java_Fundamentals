package softserve.academy.edu1.hw4.taskHW3;

import java.util.Scanner;

public class HTTPErrorHandler {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int code = 0;
        while (true) {
            try {
                code = inputCode("Enter HTTP code: ");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }

        HTTPError httpError = null;
        try {
            httpError = HTTPError.getErrorCode(code);
            System.out.printf(httpError.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static int inputCode(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter a proper integer!");
            }
        }
    }
}