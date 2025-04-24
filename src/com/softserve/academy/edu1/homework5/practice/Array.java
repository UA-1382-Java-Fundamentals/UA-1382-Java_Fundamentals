package com.softserve.academy.edu1.homework5.practice;

//Write a Java program that performs the following tasks and outputs the results:
//
//Create a string array and sort it.
//Create an array with 5 elements and calculate the average value
//Сheck if the array (any of the previous ones) contains the value ( value enter  from the console). Output the result of the search.


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] stringsArrays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int [] intArrays = {1,0,4,5,6 };
        System.out.println("Average value of the array: " + averageArray(intArrays));
        System.out.print("Sorted string array: ");
        sortArray(stringsArrays);
        for (String str : stringsArrays) {
            System.out.print(str + " ");
        }
        System.out.println();
        searchArray(intArrays);
    }
   public static void sortArray (String[]array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static double averageArray (int[]array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum / array.length;
    }

    public static void searchArray (int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to search for: ");
        int value = scanner.nextInt();
        boolean found = false;
        for (int j : array) {
            if (j == value) {
                System.out.println("The value " + value + " is found in the array.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + value + " is not found in the array.");
        }

    }
}