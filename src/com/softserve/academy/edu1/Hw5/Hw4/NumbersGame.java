package com.softserve.academy.edu1.Hw5.Hw4;

public class NumbersGame {
    public String cheking(int random, int numberOf_players) {
             if (numberOf_players < random) {
                System.out.println("Your number is lower than random number");
                 return "Your number is lower than random number";
            } else if (numberOf_players > random) {
                System.out.println("Your number is higher than random number");
                return "Your number is higher than random number";
            } else  {
                System.out.println("Great, you found it");
                return "Great, you found it";
            }
    }
}
