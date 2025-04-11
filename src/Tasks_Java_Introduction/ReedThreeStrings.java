package Tasks_Java_Introduction;

import java.util.Scanner;

public class ReedThreeStrings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello.Write something:");
        String firstWord = sc.nextLine();

        System.out.println("Write something else:");
        String secondWord = sc.nextLine();

        System.out.println("And one more time:");
        String thirdWord = sc.nextLine();

        sc.close();

        System.out.print(thirdWord + "\n" + secondWord + "\n" + firstWord );

    }
}
