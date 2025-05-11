package com.softserve.academy.edu1.homework.lesson4;

import java.util.Scanner;

public class HTTPErrorMapper {
    enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error");

        private final int code;
        private final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static String getDescription(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.code == code) {
                    return error.description;
                }
            }
            return "Unknown Error";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP error code: ");
        int errorCode = scanner.nextInt();

        System.out.println("Error: " + HTTPError.getDescription(errorCode));
    }
}
