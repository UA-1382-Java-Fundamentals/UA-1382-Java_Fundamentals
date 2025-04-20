package com.softserve.academy.edu1.Condition_Statements.Homework_3;

public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

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

    public static HTTPError fromCode(int code) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == code) {
                return error;
            }

        }
        return null;
    }
}
