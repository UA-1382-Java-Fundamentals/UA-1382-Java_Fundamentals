package Task04.Homework;

import java.util.Scanner;

enum HTTP {
    ERROR_400("Bad Request error"),
    ERROR_401("Unauthorized error"),
    ERROR_402("Payment Required error"),
    ERROR_403("Forbidden error"),
    ERROR_404("Not Found error"),
    ERROR_500("Internal Server Error error");

    private final String text;

    HTTP(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text;
    }
}

public class HTTPError {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the error code (400,401,402,403,404,500)");
        int errorNum = sc.nextInt();
        sc.close();
        switch (errorNum){
            case 400:
                System.out.println(HTTP.ERROR_400.getMessage());
                break;
            case 401:
                System.out.println(HTTP.ERROR_401.getMessage());
                break;
            case 402:
                System.out.println(HTTP.ERROR_402.getMessage());
                break;
            case 403:
                System.out.println(HTTP.ERROR_403.getMessage());
                break;
            case 404:
                System.out.println(HTTP.ERROR_404.getMessage());
                break;
            case 500:
                System.out.println(HTTP.ERROR_500.getMessage());
                break;
            default:
                System.out.println("Unknown error");
        }

    }


}
