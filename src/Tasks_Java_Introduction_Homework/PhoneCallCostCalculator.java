package Tasks_Java_Introduction_Homework;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main (String[] args) {
        double c1, c2, c3;
        int t1, t2, t3;
        Scanner sc = new Scanner(System.in);

        System.out.println("The cost per minute for 1 call :");
         c1 = sc.nextDouble();
        System.out.println("The cost per minute for 2 call :");
         c2 = sc.nextDouble();
        System.out.println("The cost per minute for 3 call :");
         c3 = sc.nextDouble();

        System.out.println("The duration of 1 call :");
         t1 = sc.nextInt();
        System.out.println("The duration of 2 call :");
         t2 = sc.nextInt();
        System.out.println("The duration of 3 call :");
         t3 = sc.nextInt();

         sc.close();

         double cost1 = c1 * t1;
         double cost2 = c2 * t2;
         double cost3 = c3 * t3;
         double totalCost = cost1 + cost2 + cost3;

        System.out.println("The cost of 1 call is: " + cost1);
        System.out.println("The cost of 2 call is: " + cost2);
        System.out.println("The cost of 3 call is: " + cost3);
        System.out.println("The total cost of all calls is: " + totalCost);
    }
}
