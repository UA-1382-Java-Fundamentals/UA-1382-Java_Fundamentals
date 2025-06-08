package softserve.academy.edu13.taskPractical4;

//• Create array Integers which has 10 elements, create method count() that takes an array
//of integers as the first parameter and functional interface as the second parameter,
//that functional interface works with integers and defines a condition. Method count()
//return count of elements in array that satisfy the condition defined by the second
//argument.

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 10);
        int count = 10;
        Integer[] array = new Integer[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = integerSupplier.get();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Even numbers in the array: " + count(array, i -> i % 2 == 0));
        System.out.println("Prime numbers in the array: " + count(array, Main::isPrime));

    }

    private static int count(Integer[] array, Predicate<Integer> predicate) {
        int count = 0;
        for (Integer i : array) {
            if (predicate.test(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n != 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
