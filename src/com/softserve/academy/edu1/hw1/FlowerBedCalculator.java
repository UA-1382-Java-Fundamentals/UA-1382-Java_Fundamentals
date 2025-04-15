package softserve.academy.edu1.hw1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;
        double area;
        double circumf;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter flowerbed radius: ");
        radius = input.nextInt();
        System.out.print("\n");

        circumf = 2 * radius * Math.PI;
        area = Math.PI * Math.pow(radius,2);

        String resCircumf = String.format("Flowerbed circumference: %.2f", circumf);
        System.out.println(resCircumf);
        String resultArea = String.format("Flowerbed area: %.2f", area);
        System.out.println(resultArea);

        input.close();
    }
}