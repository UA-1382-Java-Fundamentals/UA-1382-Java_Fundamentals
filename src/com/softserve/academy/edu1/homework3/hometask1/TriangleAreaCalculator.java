
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input side 3: ");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);
        System.out.printf("The area of the triangle is %.2f%n", area);

        scanner.close();
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}