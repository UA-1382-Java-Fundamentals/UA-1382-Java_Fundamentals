package softserve.academy.edu1.hw3.taskHW2.model;

import java.util.Scanner;

public class Finder {
    public int getNumber(String promt) {
        System.out.print(promt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int getLeast (int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= a && b <= c) {
            return b;
        }
        else {
            return c;
        }
    }
}
