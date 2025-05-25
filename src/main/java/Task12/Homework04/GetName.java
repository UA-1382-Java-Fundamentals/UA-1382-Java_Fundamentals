package Task12.Homework04;

import java.util.Scanner;

public class GetName {

    public GetName() {
    }

    public String getNameMetod() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = scanner.nextLine();
        return name;
    }
}
