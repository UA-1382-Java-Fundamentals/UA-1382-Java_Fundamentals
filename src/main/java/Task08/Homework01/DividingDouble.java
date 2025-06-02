package Task08.Homework01;

import Task08.PracticalTask01.Rectangle;

import java.util.Scanner;

public class DividingDouble {

    private double a;
    private double b;

    public DividingDouble(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double div(double a,double b){
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Hello.Write 1 double number:");
            double first = sc.nextDouble();
            if (first == 0) {
                // this gets caught in the catch block
                throw new IllegalArgumentException();
            }

            System.out.println("Hello.Write 2 double number:");
            double second = sc.nextDouble();
            if (second == 0) {
                // this gets caught in the catch block
                throw new IllegalArgumentException();
            }

            sc.close();

            DividingDouble divide = new DividingDouble(first,second);
            System.out.println("The divide result of 1 and 2 number : " + divide.div(first,second));

        } catch (NumberFormatException e ) {
            System.out.println("NumberFormatException");

        } catch (IllegalArgumentException e ) {
            System.out.println("Not '0' number!!!");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        } catch (Exception e) {
            System.out.println("Only NUMBERS Please!");
        }
    }


}
