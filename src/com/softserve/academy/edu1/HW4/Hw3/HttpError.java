package com.softserve.academy.edu1.HW4.Hw3;

public class HttpError {


    enum HttpStatus {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found");

        private final int code;
        private  final String message;

        HttpStatus(int code, String message) {
            this.code = code;
            this.message = message;
        }

    }
    public  HttpError (int code) {
        for(HttpStatus httpStatus : HttpStatus.values()) {
            if(httpStatus.code == code) {
                System.out.println(httpStatus.message);
            }
        }

    }
    

}
