package Task12.Homework04;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String regex = "^[A-Za-z]+(?:[- ][A-Za-z]+)*$";
        GetName get = new GetName();

        while (true){
            firstName = get.getNameMetod();
            if(firstName.matches(regex)){
                break;
            }
            System.out.println("Invalid input. Only English letters, hyphens, and spaces are allowed.");
        }

        while (true){
            lastName = get.getNameMetod();
            if(lastName.matches(regex)){
                break;
            }
            System.out.println("Invalid input. Only English letters, hyphens, and spaces are allowed.");
        }

        String[] outputs = {
                "Hello, %s %s ! Nice to meet you.",
                "Welcome, %s %s!",
                "Goodbye, %s %s"
        };

        Random random = new Random();
        int index = random.nextInt(outputs.length);

        System.out.printf(outputs[index] + "%n",firstName,lastName);
    }
}
