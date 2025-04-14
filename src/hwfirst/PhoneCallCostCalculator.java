package hwfirst;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter c1:");
        double c1 = scan.nextDouble();

        System.out.println("Enter t1:");
        double t1 = scan.nextDouble();

        double cost1 = c1 * t1;
        System.out.println("Cost 1=" + cost1 + "$");

        System.out.println("Enter c2:");
        double c2 = scan.nextDouble();

        System.out.println("Enter t2:");
        double t2 = scan.nextDouble();

        double cost2 = c2 * t2;
        System.out.println("Cost 2=" + cost2 + "$");

        System.out.println("Enter c3:");
        double c3 = scan.nextDouble();

        System.out.println("Enter t3:");
        double t3 = scan.nextDouble();

        double cost3 = c3 * t3;
        System.out.println("Cost 3=" + cost3 + "$");

        double totalCost = cost1 + cost2 + cost3;
        System.out.println("Total Cost=" + totalCost + "$");
        scan.close();
    }
}
