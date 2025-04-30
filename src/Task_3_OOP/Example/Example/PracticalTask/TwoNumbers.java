package Task_3_OOP.Example.Example.PracticalTask;

import java.util.Scanner;

public class TwoNumbers {
    static double number;
    static Scanner sc ;

     public double getTotal( double firstNumber, double secondNumber){
        double resultTotal = firstNumber + secondNumber;
     return resultTotal;
     }

    public double getAverage( double firstNumber, double secondNumber){
        double resultAverage = getTotal(firstNumber,secondNumber)/2;
     return resultAverage;
    }

   public static double  getNumber(String prompt){
       System.out.println(prompt);

        number = sc.nextDouble();

       return number;
    }

    public static void main (String[] args){
         double firstNumber;
         double secondNumber;
         sc = new Scanner(System.in);

         TwoNumbers newNumber = new TwoNumbers();

        System.out.println(TwoNumbers.getNumber("Enter the first number :"));
        firstNumber = number;

        System.out.println(TwoNumbers.getNumber("Enter the second number :"));
        secondNumber = number;

        System.out.println("The sum of " + firstNumber + "and " + secondNumber + " is :" + newNumber.getTotal(firstNumber,secondNumber));
        System.out.println("The average of " + firstNumber + "and " + secondNumber + " is :" + newNumber.getAverage(firstNumber,secondNumber));

        sc.close();
    }


}
