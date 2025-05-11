package com.softserve.academy.edu4.homework.HTTPerror;

//Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
//program should use an enum called HTTPError to map the input number to the corresponding name of the error and
//        output it.

public enum HTTPError {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401, "Unauthorized"),
    ERROR_402(402, "Payment Required"),
    ERROR_403(403, "Forbidden"),
    ERROR_404(404, "Not Found"),
    ERROR_500(500, "Internal Server Error");

    private final int errorNumber;
    private final String description;

    HTTPError(int errorNumber, String description) {
        this.errorNumber = errorNumber;
        this.description = description;
    }

    public static String getCodeDescription(int code) {
        return switch (code) {
            case 400 -> HTTPError.ERROR_400.description;
            case 401 -> HTTPError.ERROR_401.description;
            case 402 -> HTTPError.ERROR_402.description;
            case 403 -> HTTPError.ERROR_403.description;
            case 404 -> HTTPError.ERROR_404.description;
            case 500 -> HTTPError.ERROR_500.description;
            default -> "Unknown HTTP error code";

        };

    }


}


