package com.softserve.academy.edu1.Hw8.hw1;

public class Main {
    public static void main(String[] args) {


        CalculateNumbers calculateNumbers = new CalculateNumbers(1,0);
        try{
            double result = calculateNumbers.div();
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("You input the wrong numbers "+e.getMessage());
        }catch (Exception e){
            System.out.println("Sth wrong: "+e.getMessage());
        }

    }
}
