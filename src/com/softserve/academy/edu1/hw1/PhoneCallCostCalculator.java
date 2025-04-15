package softserve.academy.edu1.hw1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int calls = 3;
        int[] cost = new int[calls];
        int[] duration = new int[calls];
        int[] price = new int[calls];
        int total = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < calls; i++) {
            System.out.print("What is the cost of the call #" + (i+1) + "? ");
            cost[i] = input.nextInt();
            System.out.print("What is the duration of the call #" + (i+1) + "? ");
            duration[i] = input.nextInt();
            price[i] = cost[i] * duration[i];
            total = total + price[i];
        }

        for (int i = 0; i < calls; i++) {
            System.out.println("Call #" + (i+1) + " lasted " + duration[i] + " minutes and cost " + price[i] + " UAH" );
        }
        System.out.println("Overall price for " + calls + " calls is " + total + " UAH" );

        input.close();

    }
}