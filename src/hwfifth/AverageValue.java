package hwfifth;
public class AverageValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int number : numbers) {
            sum =sum + number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average value: " + average);
    }
}
