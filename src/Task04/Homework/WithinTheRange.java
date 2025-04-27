package Task04.Homework;

import java.util.Scanner;

public class WithinTheRange {

    private double number;

    public double getNumber() {
        return number;
    }

    public WithinTheRange(double number) {
        this.number = number;
    }

    public String valueNumber (){
    double num = this.getNumber();
        if ( num >= -5 && num <= 5){
            return "The number : " + num + " belong to the range [-5;5]";
        }
        else{
            return "NOT BELONG THE RANGE: " + num;
        }
    }

    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
        System.out.println("Write number to the range [-5;5] : ");
        double num1 = sc.nextDouble();
        WithinTheRange number1 = new WithinTheRange(num1);
        System.out.println(number1.valueNumber());

        System.out.println("Write number to the range [-5;5] : ");
        double num2 = sc.nextDouble();
        WithinTheRange number2 = new WithinTheRange(num2);
        System.out.println(number2.valueNumber());

        System.out.println("Write number to the range [-5;5] : ");
        double num3 = sc.nextDouble();
        WithinTheRange number3 = new WithinTheRange(num3);
        System.out.println(number3.valueNumber());

        sc.close();
    }
}
