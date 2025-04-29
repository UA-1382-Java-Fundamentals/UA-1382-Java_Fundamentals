package softserve.academy.homework4.Task3;

public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented");

    private final int code;
    private final String message;

    HTTPError(int code, String message){
        this.code = code;
        this.message = message;
    }

    public static String getErrorMessage(int code){
        for (HTTPError error : HTTPError.values()) {
            if(error.code == code){
                return  error.message;
            }
        }
        return "Unknown Error";
    }
}
