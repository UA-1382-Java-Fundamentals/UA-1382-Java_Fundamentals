package softserve.academy.edu1.hw4.taskHW1;

import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {
        int count = 3;
        double[] numbers = new double[count];
        int rangeStatus = 1;
        String result;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            String message = String.format("Enter a number #%d: ", (i+1));
            System.out.print(message);
            numbers[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < count; i++) {
            boolean statement = numbers[i] >= -5 && numbers[i] <= 5;
            if (statement) {
                rangeStatus = 0;
            }
            else {
                rangeStatus = 1;
                break;
            }
        }

        if (rangeStatus == 0) {
            result = "All numbers are in acceptable range";
        }
        else {
            result = "Some numbers are not in acceptable range";
        }

        System.out.println(result);
    }
}
