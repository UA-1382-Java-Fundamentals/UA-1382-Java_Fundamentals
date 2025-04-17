package com.softserve.academy.edu1.homework.hw04;

import java.util.Scanner;

public class HTTPErrorMain {
    public enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented"),
        BAD_GATEWAY(502, "Bad Gateway"),
        SERVICE_UNAVAILABLE(503, "Service Unavailable"),
        GATEWAY_TIMEOUT(504, "Gateway Timeout"),
        HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported");

        private final int code;
        private final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public static HTTPError fromCode(int code) {
            for (HTTPError err : values()) {
                if (err.code == code) {
                    return err;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an HTTP error code: ");
            int code = scanner.nextInt();
            HTTPError error = HTTPError.fromCode(code);

            if (error != null) {
                System.out.printf("%d: %s%n", code, error.getDescription());
            } else {
                System.out.printf("Unknown HTTP error code: %d%n", code);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
