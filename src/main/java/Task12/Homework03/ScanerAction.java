package Task12.Homework03;

import java.util.Scanner;

public class ScanerAction {

    public ScanerAction() {
    }

    public double getScaner() {
        Double number = 0.0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter the amount you need :");
            number = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("NumberFormatException. PLEACE ENTER ONLY NUMBERS");
        }
        scanner.close();
        return number;

    }
}
