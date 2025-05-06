package softserve.academy.edu1.taskPractical1;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 3;
        String[] inputs = new String[count];
        for (int i = 0; i < inputs.length; i++) {
            while (true) {
                try {
                    String message = String.format("Input a message #%d: ", i + 1);
                    inputs[i] = inputString(message);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("===========================");
        System.out.println("Here is the reverse order: ");
        for (int i = inputs.length-1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }
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
