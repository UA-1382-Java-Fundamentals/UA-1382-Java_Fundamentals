package Task05;

import java.util.Arrays;
import java.util.Random;

public class RandomInteger {

   private int[] arr;

    public RandomInteger(int[] arr) {
        this.arr = arr;
    }

    public RandomInteger() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    static int maxValue(RandomInteger rand){
        int[] getmas = rand.getArr();

        if(rand == null) {
            return 0;
        }
        if(getmas.length == 0){
            return 0;
        }
        Arrays.sort(getmas);
        return getmas[getmas.length-1];
    }

    public static int sumPositive (RandomInteger rand){
        int[] getmas = rand.getArr();
        int summa = 0;

        for(int i : getmas){
          if (i > 0){
            summa =  summa + i;
          }
        }
       return summa;
    }

    public static int countOfNegative (RandomInteger rand){
        int count = 0;
        int[] getmas = rand.getArr();

        for(int i : getmas){
            if (i < 0){
                count++;
            }
        }
        return count;
    }

    public static int countOfPositive(RandomInteger rand){
        int count = 0;
        int[] getmas = rand.getArr();

        for(int i : getmas){
            if (i > 0){
                count++;
            }
        }
        return count;
    }

    public static String determinateValues(RandomInteger rand) {
        String message = null;
        if (countOfPositive(rand) > countOfNegative(rand)) {
            message =  "There are more POSITIVE values in the array.";
        }
        if (countOfPositive(rand) < countOfNegative(rand)) {
            message =  "There are more NEGATIVE values in the array.";
        }
        if (countOfPositive(rand) == countOfNegative(rand)) {
            message =  "There are an EQUALE number of positive and negative values in the array";
        }
        return message;
    }

    public static void main(String[] args) {

    Random rand = new Random();
    int[] massive = new int[10];
    RandomInteger mass = new RandomInteger(massive);

        for (int i = 0; i < massive.length; i++){
        massive[i] = rand.nextInt(-100,100);
    }
        System.out.println(Arrays.toString(massive));
        System.out.println("The max value is: " + RandomInteger.maxValue(mass));
        System.out.println("The summa of positive values is : " + RandomInteger.sumPositive(mass));
        System.out.println("The count of negative numbers is :" + RandomInteger.countOfNegative(mass));
        System.out.println(RandomInteger.determinateValues(mass));
}
}
