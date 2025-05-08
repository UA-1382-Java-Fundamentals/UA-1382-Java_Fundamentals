package softserve.academy.edu10.taskPractical2;

//2. Suppose, the user enters a set of numbers as a single string "1, 2, 3, 4, 4, 5, 6, 6, 7, 8" from the console (can be other
//numbers):
//• Remove of duplicate elements in a string.
//• Output the result to the console

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Handler handler = new Handler();
        String message = handler.userInput("Input integers, separated by coma: ");
        Set<Integer> numbers = handler.parseInput(message);
        System.out.println(numbers.toString());
    }
}
