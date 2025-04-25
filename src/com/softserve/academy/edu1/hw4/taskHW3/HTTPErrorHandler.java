package softserve.academy.edu1.hw4.taskHW3;

import java.util.Scanner;

enum HTTPError {
    BADREQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENTREQUIRED(402, "Payment Required"),
    FORBIDDEN(403,"Forbidden"),
    NOTFOUND(404,"Not Found"),
    METHODNOTALLOWED(405, "Method Not Allowed");

    private final int code;
    private final String label;

    private HTTPError(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static HTTPError getErrorCode(int inputCode) {
        for (HTTPError errorInstance : values()) {
            if (errorInstance.code == inputCode) {
                return errorInstance;
            }
        }
        return null;
    }

    public String getLabel() {
        return label;
    }
}

public class HTTPErrorHandler {
    public static void main(String[] args) {
        HTTPError httpError;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HTTP code: ");
        int code = sc.nextInt();
        sc.nextLine();

        httpError = HTTPError.getErrorCode(code);

        if (httpError != null) {
            result = String.format("Error code %d corresponds to \"%s\" label.", code, httpError.getLabel());
        }
        else {
            result = "Code out of bounds, try googling.";
        }
        System.out.println(result);

    }
}