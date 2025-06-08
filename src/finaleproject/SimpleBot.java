package finaleproject;

import java.util.Scanner;

public class SimpleBot {
    private final String botName;
    private final int birthYear;
    private final Scanner scanner;

    public SimpleBot(String botName, int birthYear) {
        this.botName = botName;
        this.birthYear = birthYear;
        this.scanner = new Scanner(System.in);
    }

    public void greet() {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    public String remindName() {
        System.out.println("Please, remind me your name.");
        return scanner.nextLine();
    }

    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
    }

    public void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }
}