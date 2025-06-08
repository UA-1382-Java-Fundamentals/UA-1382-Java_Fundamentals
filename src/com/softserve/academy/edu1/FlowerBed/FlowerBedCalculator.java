package softserve.academy.edu1.FlowerBed;

import java.util.Scanner;

public class FlowerBedCalculator {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double radius = 0;
        while (true) {
            try {
                radius = inputRadius();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            } catch (LessThanZeroException e) {
                System.out.println("The radius must be greater than zero!");
            }
        }

        double circumference = getCircumference(radius);
        double area = getArea(radius);

        String resultCir = String.format("Flowerbed circumference: %.2f", circumference);
        System.out.println(resultCir);
        String resultArea = String.format("Flowerbed area: %.2f", area);
        System.out.println(resultArea);

        SCANNER.close();
    }

    private static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static double inputRadius() throws LessThanZeroException {
        while (true) {
            try {
                System.out.print("Enter flowerbed radius: ");
                double radius = Double.parseDouble(SCANNER.nextLine());
                if (radius <= 0) {
                    throw new LessThanZeroException("The radius must be greater than zero!");
                }
                return radius;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Please enter a valid number!");
            }
        }
    }

    static double getCircumference(double radius) {
        return 2 * radius * Math.PI;
    }
}