package softserve.academy.edu1.hw3.taskHW2;

import softserve.academy.edu1.hw3.taskHW2.model.Finder;

public class FindLeast {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Finder least = new Finder();

        for (int i = 0; i < 3; i++) {
            numbers[i] = least.getNumber("Enter number #" + (i+1) + ": ");
        }

        System.out.println("The least number is " + least.getLeast(numbers[0], numbers[1], numbers[2]));
    }
}
