package softserve.academy.edu1.hw3.taskHW1.model;

import java.util.Scanner;

public class TriCalculator {
    public int getSide(String promt) {
        System.out.print(promt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public double getArea (int side1, int side2, int side3) {
        double semiP = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));
        return area;
    }
}
