package softserve.academy.edu1.hw3.taskHW2;

import softserve.academy.edu1.hw3.taskHW2.model.Finder;

public class FindLeast {
    public static void main(String[] args) {
        int count = 3;
        int[] numbers = new int[count];
        Finder least = new Finder();

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                try {
                    numbers[i] = least.getNumber("Enter number #" + (i+1) + ": ");
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("The least number is " + least.getLeast(numbers));
    }
}