package softserve.academy.edu1.CallCost;

import softserve.academy.edu1.FlowerBed.LessThanZeroException;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int calls = 3;
        int[] cost = new int[calls];
        int[] duration = new int[calls];
        int[] price = new int[calls];
        int total = 0;

        for (int i = 0; i < calls; i++) {
            while (true) {
                try {
                    cost[i] = inputInteger("What is the cost of the call #%d ? ", i);
                    duration[i] = inputInteger("What is the duration of the call #%d ? ", i);
                    break;
                } catch (LessThanZeroException | NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            price[i] = calculatePrice(cost[i], duration[i]);
            total += price[i];
        }

        for (int i = 0; i < calls; i++) {
            String message = String.format("Call #%d lasted %d minutes and cost %d UAH", (i+1), duration[i], price[i]);
            System.out.println(message);
        }
        String message = String.format("Overall price for %d calls is %d UAH", calls, total);
        System.out.println(message);

        SCANNER.close();

    }

    private static int calculatePrice(int cost, int duration) {
        return cost * duration;
    }

    private static int inputInteger(String prompt, int index) throws LessThanZeroException {
        try {
            String message = String.format(prompt, (index + 1));
            System.out.print(message);
            int value = Integer.parseInt(SCANNER.nextLine());
            if (value < 0) {
                throw new LessThanZeroException("The value must be a positive integer!");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Enter a valid integer!");
        }
    }
}