package softserve.academy.homework1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.printf("Where do you live, %s ? \n", name);
        address = scanner.nextLine();
        System.out.printf("Name: %s, Address: %s", name,address);
    }
}
