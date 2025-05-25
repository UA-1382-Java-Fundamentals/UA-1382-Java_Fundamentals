package Task12.PractikalTask02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String lastName = "";
        String firstName = "";
        String middleName = "";

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello.Write last name : ");
            lastName = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("No name");
        }
        try {
            System.out.println("Write first name : ");
            firstName = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("No first name");
        }
        try {
            System.out.println("Write middle name : ");
            middleName = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("No middle name");
        }
        sc.close();

        System.out.println(lastName + " " + firstName + " " + middleName);

        System.out.println(lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".");

        System.out.println(firstName);
    }
}
