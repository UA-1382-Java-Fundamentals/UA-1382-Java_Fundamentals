package softserve.academy.edu1.hw3.taskHW2.model;

import java.util.Scanner;

public class Finder {
    static final Scanner SCANNER = new Scanner(System.in);

    public int getNumber(String promt) {
        while (true) {
            try {
                System.out.print(promt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid number!");
            }
        }
    }

    public int getLeast (int[] array) {
        int least = Integer.MAX_VALUE;
        for (int a : array) {
            least = Math.min(least, a);
        }
        return least;
    }
}
