package softserve.academy.homework5.practicalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String strings[] = new String[]{"apple", "banana", "eggs", "honey", "cucumber", "tomato", "orange", "strawberry" };
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        int numbers[] = new int[]{1, 2, 3, 4, 5};
        int sum = 0;

        for(int number: numbers){
            sum += number;
        }

        double result = (double) sum /numbers.length;
        System.out.println(result + " average value");

        System.out.println("Enter the value");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean found = false;
        for (int number : numbers){
            if (number == value){
                System.out.println("array contains value + " + value);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("array don't contains value");
        }

    }



}
