package softserve.academy.edu1.JavaIntroduction;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! \nWhat's your name? ");
        String name = input.nextLine();

        System.out.println("And where do you live, " + name + "?");
        String address = input.nextLine();

        String output = String.format("Name: %s, Address: %s.", name, address);
        System.out.println(output);

        input.close();
    }
}
