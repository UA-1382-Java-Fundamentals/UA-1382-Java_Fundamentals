package Tasks_Java_Introduction_Homework;

import java.util.Scanner;

public record FlowerBedCalculator() {
    public static void main(String[] args) {
        int radius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the radius:");
        radius = sc.nextInt();

        sc.close();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println ("Perimeter is : " + perimeter);
        System.out.println ("Area is : " + area);
    }
}
