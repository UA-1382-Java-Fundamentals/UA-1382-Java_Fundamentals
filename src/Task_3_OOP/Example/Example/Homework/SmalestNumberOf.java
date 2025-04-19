package Task_3_OOP.Example.Example.Homework;

import java.util.Scanner;

public class SmalestNumberOf {

    public static int smalNum (int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        if(b<a && b<c){
            return b;
        }
        if(c<a && c<b){
            return c;
        }
        else{return 0;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number is?:");
        int first = sc.nextInt();

        System.out.println("Second number is?:");
        int second = sc.nextInt();

        System.out.println("Third number is?:");
        int third = sc.nextInt();

        System.out.println("The smalest number is : " + SmalestNumberOf.smalNum(first, second, third));
    }
}
