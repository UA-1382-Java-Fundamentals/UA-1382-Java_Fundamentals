package softserve.academy.edu3.taskHW1.model;

import java.util.Scanner;

public class TriCalculator {
    static final Scanner SCANNER = new Scanner(System.in);

    public int getSide(String prompt) {
        int side = 0;
        while (true) {
            try {
                System.out.print(prompt);
                side = Integer.parseInt(SCANNER.nextLine());
                if (side < 1) {
                    throw new IllegalArgumentException("Side can't be negative or zero!");
                }
                return side;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter an integer!");
            }
        }
    }

    public double getArea (int side1, int side2, int side3) {
        double semiP = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));
        return area;
    }

    public void checkTriangleValidity(int[] sides) {
        double halfP = 0;
        int max = Integer.MIN_VALUE;
        for (int side : sides) {
            if (max < side) {
                max = side;
            }
            halfP += side / 2.0;
        }
        if (halfP <= max) {
            throw new IllegalArgumentException("Triangle should be valid!");
        }
    }
}
