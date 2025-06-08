package softserve.academy.edu14.taskPractical2;

//2. For given collection
//List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//calculate count, min, max, sum, for numbers and print all results

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CombinedOperation {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream().
                mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Initial list:\n" + primes);
        System.out.println("===".repeat(20));
        System.out.printf("Number of elements:\t\t%d\n", statistics.getCount());
        System.out.printf("Minimal number:\t\t\t%d\n", statistics.getMin());
        System.out.printf("Maximal number:\t\t\t%d\n", statistics.getMax());
        System.out.printf("Sum of all elements:\t%d\n", statistics.getSum());
    }
}
