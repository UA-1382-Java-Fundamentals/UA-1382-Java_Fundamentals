package softserve.academy.edu13.taskPractical3;

//• Write a method for sorting list of Strings using Java 8

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(33, 22, 11, 44));
        // original array
        System.out.println(numbers);

        // sort ascending
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // reverse descending
        numbers.sort((a,b) -> -a.compareTo(b));
        System.out.println(numbers);
    }
}
