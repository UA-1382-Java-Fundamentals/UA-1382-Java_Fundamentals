package softserve.academy.edu1.hw3.taskPractical1.model;

import java.util.Scanner;

public class LocalMath {
    public double getTotal (double oper1, double oper2) {
        return oper1 + oper2;
    }

    public double getAverage (double oper1, double oper2) {
        return (oper1 + oper2) / 2.0;
    }

    public double getNumber(String promt) {
        System.out.print(promt);
        Scanner sc = new Scanner (System.in);
        return sc.nextDouble();
    }
}
