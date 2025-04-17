package softserve.academy.edu1.hw4.taskHW2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int count = 3;
        int[] numbers = new int[count];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            String message = String.format("Enter a number #%d: ", (i+1));
            System.out.print(message);
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        String result = String.format("The minimum number is %d\nThe maximum number is %d", min, max);
        System.out.println(result);

    }
}
