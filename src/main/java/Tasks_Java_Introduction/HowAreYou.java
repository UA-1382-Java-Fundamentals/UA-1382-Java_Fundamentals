package Tasks_Java_Introduction;

import java.util.Scanner;

public class HowAreYou {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How are you?:");
        String answer = sc.nextLine();

        sc.close();

        System.out.println("You are " + answer);
    }
}
