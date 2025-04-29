package softserve.academy.homework3.Task1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // 10, 12, 15
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle side");
        double side1 = scanner.nextDouble();
        System.out.println("Enter second triangle side");
        double side2 = scanner.nextDouble();
        System.out.println("Enter third triangle side");
        double side3 = scanner.nextDouble();
        if (side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1){
            double s = (side1 + side2 + side3 ) / 2;
            System.out.println("The area of the triangle is " + Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
        } else{
            System.out.println("Triangle doesn't exist");
        }
    }

}
