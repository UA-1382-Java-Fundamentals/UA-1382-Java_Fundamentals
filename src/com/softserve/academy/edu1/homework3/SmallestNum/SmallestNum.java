package com.softserve.academy.edu1.homework3.SmallestNum;

public class SmallestNum {
    public static void main(String[] args) {
        GetNum smallest = new GetNum();
        int a = smallest.getNum("Enter the value of first number: ");
        int b = smallest.getNum("Enter the value of second number: ");
        int c = smallest.getNum("Enter the value of third number: ");

        int smallestNum = smallest.sortNum(a,b,c);
        System.out.println("The smallest number is: " + smallestNum);
    }
}
