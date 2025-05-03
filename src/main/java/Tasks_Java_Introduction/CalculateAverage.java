package Tasks_Java_Introduction;

import java.util.Scanner;

public class CalculateAverage {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First number is?:");
        double firstNum = sc.nextDouble();

        System.out.println("Second number is?:");
        double secondNum = sc.nextDouble();

        System.out.println("Third number is?:");
        double ThirdNum = sc.nextDouble();

        sc.close();

        double averageResult = (firstNum + secondNum + ThirdNum) /3;
        System.out.println("Average result is : " + averageResult);
    }
}
