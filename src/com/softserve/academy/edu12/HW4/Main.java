package softserve.academy.edu12.HW4;

//4*. Create a console application that validates user input for their first and last name, ensuring that
//they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
//to re-enter the data. Upon successful entry of the user's first and last names, generate a random
//greeting message that includes the user's name.
//To validate the user input, utilize String class methods, control loops, and regular expressions.
//Generate the random greeting message (use printf() method for output) by creating an array of
//phrases that contain various text options with the user's name inserted.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<String> greetings = new ArrayList<>(List.of(
                "Hi",
                "Hello",
                "Greetings",
                "Welcome",
                "G’day",
                "What’s up",
                "Hi there"
        ));

        Matcher matcher;
        while (true) {
            System.out.print("Input your first and last name: ");
            String name = sc.nextLine();
            Pattern pattern = Pattern.compile("[A-Z][A-z]+\\s[A-Z][A-z]+");
            matcher = pattern.matcher(name);
            if (!matcher.find()) {
                System.out.println("Invalid name, try harder!");
            } else {
                System.out.printf("%s, %s!\n", greetings.get(rand.nextInt(greetings.size())), name);
                break;
            }
        }
    }
}

