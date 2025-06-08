package com.softserve.academy.edu1.homework8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchingException {
        public static double div(double a, double b){
            if (b==0){
                throw new ArithmeticException("Division by zero is impossible");
            }
            return a/b;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number");
            double a = sc.nextDouble();
            System.out.println("Enter the second number");
            double b = sc.nextDouble();
            double result = div(a,b);
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            sc.close();
        }
    }
}
