package homework3.person;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        System.out.println("Enter data for person 1: ");
        person1.input(scanner);
        person1.changeName("Artemii", "Kostariev");
        person1.output();
        System.out.println("Enter data for person 2: ");
        person2.input(scanner);
        person2.output();
        System.out.println("Enter data for person 3: ");
        person3.input(scanner);
        person3.output();
        System.out.println("Enter data for person 4: ");
        person4.input(scanner);
        person4.output();
        System.out.println("Enter data for person 5: ");
        person5.input(scanner);
        person5.output();
        scanner.close();
    }
}
