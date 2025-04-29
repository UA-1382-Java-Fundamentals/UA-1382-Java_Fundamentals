package softserve.academy.homework5.Task1;

import java.util.Scanner;

public class ArrayAnalyzer {
    private int [] array;

    public ArrayAnalyzer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers");
        array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("position of second positive number = " + positionOfSecondPositiveNumber(array));
        System.out.println("minimum value = " + minimumNumber(array) + " , and its index = " + minimumNumberIndex(array));
        System.out.println("Product of even numbers = " + productArray(array));

    }

    private int positionOfSecondPositiveNumber(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
                if (count == 2){
                    return i;
                }
            }
        }
        return -1;
    }

    private int minimumNumber(int[]array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    private int minimumNumberIndex(int[]array){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index + 1;
    }

    private int productArray(int[]array){
        int temp = 1;
        boolean hasEven = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 && array[i] != 0){
                temp *= array[i];
                hasEven = true;
                }
        }
        if(!hasEven){
            return 0;
        }
        return temp;
    }
}
