import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1;
        int c2;
        int c3;
        int t1;
        int t2;
        int t3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute for the first call: ");
        c1 = scanner.nextInt();
        System.out.println("Enter the cost per minute for the second call: ");
        c2 = scanner.nextInt();
        System.out.println("Enter the cost per minute for the third call: ");
        c3 = scanner.nextInt();
        System.out.println("Enter the duration of the first call in minutes: ");
        t1 = scanner.nextInt();
        System.out.println("Enter the duration of the second call in minutes: ");
        t2 = scanner.nextInt();
        System.out.println("Enter the duration of the third call in minutes: ");
        t3 = scanner.nextInt();
        scanner.close();
        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;
        int totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost of the first call: " + cost1);
        System.out.println("Cost of the second call: " + cost2);
        System.out.println("Cost of the third call: " + cost3);
        System.out.println("Total cost of all calls: " + totalCost);
    }
}
