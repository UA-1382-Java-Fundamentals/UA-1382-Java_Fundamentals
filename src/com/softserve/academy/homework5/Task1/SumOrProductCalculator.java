package softserve.academy.homework5.Task1;

import java.util.Scanner;

public class SumOrProductCalculator {
    private int [] numbers;

    public SumOrProductCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
         numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        numValues(numbers);
        printProduct(numbers);
    }

    private String numValues(int [] numbers){
        int value = 0;
        for (int i = 0; i < 5; i++) {
           if (numbers[i] > 0){
               value++;
           }
        }
        int temp = 0;
        if (value == 5){
            for (int i = 0; i < 5; i++) {
                temp += numbers[i];
            }
            return "sum of first 5 = " + temp;
        }
        int product = 1;
            for (int i = 5; i < 10; i++){
                product *= numbers[i];
            }

        return "product of last 5 = " + product;

    }

    private void printProduct(int [] numbers){
        System.out.println(numValues(numbers));
    }
}
