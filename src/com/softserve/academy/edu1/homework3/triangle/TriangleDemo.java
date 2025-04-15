package homework3.triangle;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = Triangle.getNumber(scanner, "Enter first side: ");
        int side2 = Triangle.getNumber(scanner, "Enter second side: ");
        int side3 = Triangle.getNumber(scanner,  "Enter third side: ");
        scanner.close();
        if (!Triangle.isValidTriangle(side1, side2, side3)) {
            return;
        }
        Triangle triangle = new Triangle(side1, side2, side3);
        double area = triangle.getArea();
        System.out.println("The area of the triangle is: " + area);
    }
}
