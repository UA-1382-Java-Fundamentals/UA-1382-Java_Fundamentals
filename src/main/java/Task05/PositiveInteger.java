package Task05;

import java.util.Scanner;

public class PositiveInteger {

    public boolean isPrimeNumber(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

    public void message(int numberToCheck) {
        if (isPrimeNumber(numberToCheck))
            System.out.println(numberToCheck + " is a Prime number");
        else
            System.out.println(numberToCheck + " is not a Prime number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello.Write  some integer number:");
        int number = sc.nextInt();

        sc.close();

        PositiveInteger myNumb = new PositiveInteger();

        myNumb.message(number);
    }
}




