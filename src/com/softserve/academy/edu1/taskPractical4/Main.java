package softserve.academy.edu1.taskPractical4;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = null;
        while (true) {
            try {
                answer = inputString("How are you? : ");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("You are %s.\n", answer);
    }

    public static String inputString(String prompt) {
        System.out.print(prompt);
        String out = SCANNER.nextLine();
        if (out.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty!");
        }
        return out;
    }
}
