package com.softserve.academy.edu4;

import java.util.Scanner;

public class Task3 {
    //Defining HTTPError enum
    enum HTTPError {
        ERROR_400(400, "Bad request"),
        ERROR_401(401, "Unauthorized"),
        ERROR_402(402, "Payment required"),
        ERROR_403(403, "Forbidden"),
        ERROR_404(404, "Not found"),
        ERROR_405(405, "Method not allowed"),
        ERROR_500(500, "Internal server error");

        private final int code;
        private final String message;

        //Constructor
        HTTPError(int code, String message) {
            this.code = code;
            this.message = message;
        }
public int getCode() {
            return code;
}
public String getMessage() {
            return message;
}
//Method to get enum value
public static HTTPError fromCode(int code) {
    for (HTTPError error : HTTPError.values()) {
        if (error.getCode() == code) {
return error;
        }
    }
    return null;//In case if error is not found
}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an HTTP error (e.g., 400, 401, 402, etc.) ");
        int inputCode = sc.nextInt();

        //Find error
        HTTPError error = HTTPError.fromCode(inputCode);

        //Show error
        if (error != null) {
            System.out.println("Error" + error.getCode() + ' ' + error.getMessage());
        } else {
            System.out.println("There is no such an error");
        }
        sc.close();
    }
}
