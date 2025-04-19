package homework3.triangle;

import java.util.Scanner;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    public Triangle (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
    public static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            return true;
        } else {
            System.out.println("Not a valid triangle.");
            return false;
        }
    }
}