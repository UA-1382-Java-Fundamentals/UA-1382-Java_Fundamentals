package Task05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

    static String[] stringArray = {"Audi", "BMW", "Mersedes", "Volvo", "Fiat", "Reno"};
    static int[] intArray = {2,345,-23,0,56};

    public String[] sortedStringArray(String[] stringArray){

        Arrays.sort(stringArray);

        for (String i : stringArray) {
            System.out.println(i);
        }
        return stringArray;
    }

    public int averageValue (int[] intArray){
        int summa = 0;
       for(int i: intArray){
          summa = summa + i;
       }
       return summa/intArray.length;
    }

    public boolean isContain (String[] stringArray, String key){
        return Arrays.asList(stringArray).contains(key);
    }


    public static void main (String[] args) {

        ArraysSort list = new ArraysSort();

        list.sortedStringArray(list.stringArray);

        System.out.println("The average of intArray is: " + list.averageValue(list.intArray));

        Scanner sc = new Scanner(System.in);

        System.out.println("Write what you are looking for :");
        String word = sc.nextLine();

        sc.close();

        if(list.isContain(ArraysSort.stringArray, word) == true){
            System.out.println("The value " + word + " exist");
        }
        else {System.out.println("The value " + word + " NOT EXIST");}

    }
}
