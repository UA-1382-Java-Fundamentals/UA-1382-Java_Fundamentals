package com.softserve.academy.edu1.Hw5.Hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Car car = new Car("B",yearOfProduction(), 920);
        Car car2 = new Car("B",yearOfProduction(), 420);
        Car car3 = new Car("D",yearOfProduction(), 490);
        ArrayList<Car> list = new ArrayList<Car>();
        list.add(car);
        list.add(car2);
        list.add(car3);

       Sorting sorting = new Sorting(car, car2, car3);

        sorting.sortByYear();
        for(Car c : list){
            System.out.println(c.toString());
        }
//        sorting.sortByEngineCapacity();// Чисто для інтересу добавив.
//        for(Car c : list){
//            System.out.println(c.toString());
//        }


    }



    public static int yearOfProduction(){
        System.out.println("Enter the year of production");
        int yearOfProduction=sc.nextInt();
        return yearOfProduction;
    }
}
