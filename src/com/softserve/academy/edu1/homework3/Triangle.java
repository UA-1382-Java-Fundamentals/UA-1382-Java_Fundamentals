package homework3;

import java.util.Scanner;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    public Triangle (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }
    public int smallestSideOrSmallestNumber() {
        return Math.min(sideA, Math.min(sideB, sideC));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number/side: ");
        int side1 = getNumber(scanner);
        System.out.println("Enter second number/side: ");
        int side2 = getNumber(scanner);
        System.out.println("Enter third number/side: ");
        int side3 = getNumber(scanner);
        scanner.close();
        Triangle triangle = new Triangle(side1, side2, side3);
        double area = triangle.getArea();
        System.out.println("The area of the triangle is: " + area);
        System.out.println("The smallest number or side of the triangle is: " + triangle.smallestSideOrSmallestNumber());
    }
}
