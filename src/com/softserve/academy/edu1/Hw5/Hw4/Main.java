package com.softserve.academy.edu1.Hw5.Hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumbersGame game = new NumbersGame();
        boolean nofound= true;
        int random=(int) (Math.random()*100);
        System.out.println("Try to find random number [0-100]");
        do {
            int usernum = sc.nextInt();
            String result = game.cheking(random, usernum);
            nofound= result.equals("Great, you found it");
        }while (!nofound);


}}
