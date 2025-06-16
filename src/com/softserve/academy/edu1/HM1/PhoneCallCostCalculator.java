package com.softserve.academy.edu1.HM1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double c1 = 2.0;//ціна
        double c2 = 3.0;
        double c3 = 4.0;
        double[] price = {c1, c2, c3};
        double t1 = 1.0;//час
        double t2 = 2.0;
        double t3 = 3.0;
        double[] time = {t1, t2, t3};
        double cost1=0.0;
        double cost2=0.0;
        double cost3=0.0;




        cost1= Cost(EnterPrice(sc,price),EnterTima(sc,time),price,time);
        cost2= Cost(EnterPrice(sc,price),EnterTima(sc,time),price,time);
        cost3= Cost(EnterPrice(sc,price),EnterTima(sc,time),price,time);
        double totalCost=cost1+cost2+cost3;
        System.out.println("Total Cost ="+totalCost);
        sc.close();
    }



    public static double Cost(int choice1, int choice2,double[] price,double[] time) {
        double cost = price[choice1]*time[choice2];
        System.out.println("Total cost is "+cost);
        return cost;
    }
    public static int EnterPrice(Scanner sc,double[] price){

        System.out.println("Enter price");
        for (int i = 0; i < price.length; i++) {
            System.out.printf(String.valueOf(i+ "- "+price[i]+"\n"));
        }
        int choice = sc.nextInt();
        return choice;
    }
    public static int EnterTima(Scanner sc, double[] time){
        System.out.println("Enter time");
        for (int i = 0; i < time.length; i++) {
            System.out.printf(String.valueOf(i+ "- "+time[i]+"\n"));
        }
        int choice2 = sc.nextInt();
        return choice2;}
}
