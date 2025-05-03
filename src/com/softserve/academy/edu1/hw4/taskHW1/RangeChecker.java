package softserve.academy.edu1.hw4.taskHW1;

public class RangeChecker {

    public static void main(String[] args) {
        int count = 3;
        int minBoundary = -5;
        int maxBoundary = 5;

        double[] numbers = Checker.getNumbers(count);

        if (Checker.isInRange(numbers, minBoundary, maxBoundary)) {
            System.out.println("All numbers are in acceptable range!");
        } else {
            System.out.printf(
                    "Some numbers are not in acceptable range between %d and %d!",
                    minBoundary, maxBoundary
            );
        }
}
}
