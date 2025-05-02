package Task04.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Write number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Write number 3 : ");
        int num3 = sc.nextInt();

        sc.close();

        int [] numbers = {num1,num2,num3};
        Arrays.sort(numbers);

        System.out.println("The maximum value is : " + numbers[2]);
        System.out.println("The minimum value is : " + numbers[0]);




    }
}
