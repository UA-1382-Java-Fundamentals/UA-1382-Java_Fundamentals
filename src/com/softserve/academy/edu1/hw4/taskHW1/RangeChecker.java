package softserve.academy.edu1.hw4.taskHW1;

import java.util.Scanner;

class Checker {
    public static double[] getNumbers(int count) {
        double[] numbers = new double[count];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            String message = String.format("Enter a number #%d: ", (i+1));
            System.out.print(message);
            numbers[i] = sc.nextDouble();
            sc.nextLine();
        }
        return numbers;
    }

    public static boolean isInRange(double[] numbers) {
        for (double number : numbers) {
            if ((number < -5) || (number > 5)) {
                return false;
            }
        }
        return true;
    }
}

public class RangeChecker {

    public static void main(String[] args) {
        int count = 3;
        double[] numbers = Checker.getNumbers(count);

        String result;
        if (Checker.isInRange(numbers)) {result = "All numbers are in acceptable range";}
        else {result = "Some numbers are not in acceptable range";}

        System.out.println(result);
    }
}
