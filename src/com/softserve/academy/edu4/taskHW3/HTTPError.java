package softserve.academy.edu4.taskHW3;

enum HTTPError {
    BADREQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENTREQUIRED(402, "Payment Required"),
    FORBIDDEN(403,"Forbidden"),
    NOTFOUND(404,"Not Found"),
    METHODNOTALLOWED(405, "Method Not Allowed");

    private final int code;
    private final String label;

    HTTPError(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static HTTPError getErrorCode(int inputCode) {
        for (HTTPError errorInstance : values()) {
            if (errorInstance.code == inputCode) {
                return errorInstance;
            }
        }
        throw new IllegalArgumentException("Invalid HTTP error code: " + inputCode);
    }

    @Override
    public String toString() {
        return code + ": " + label;
    }
}
