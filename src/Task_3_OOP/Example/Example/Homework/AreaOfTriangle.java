package Task_3_OOP.Example.Example.Homework;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaOfTriangle {

    public static double halfPerimeter (double a, double b, double c){
      double halfP = (a+b+c)/2;
      return halfP;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First side is?:");
        double firstSide = sc.nextDouble();

        System.out.println("Second side is?:");
        double secondSide = sc.nextDouble();

        System.out.println("Third side is?:");
        double thirdSide = sc.nextDouble();

        double p = AreaOfTriangle.halfPerimeter(firstSide, secondSide,thirdSide);

        double area = sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));

        System.out.println("Input Side 1 : " + firstSide );
        System.out.println("Input Side 2 : " + secondSide);
        System.out.println("Input Side 3 : " + thirdSide);
        System.out.println("The area of triangle is : " + area);
    }
}
