package Task12.Homework02;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with extra spaces:");
        String input = scanner.nextLine();

        String output = input.replaceAll("\\s+", " ");

        System.out.println("Result: " + output);
    }
}
