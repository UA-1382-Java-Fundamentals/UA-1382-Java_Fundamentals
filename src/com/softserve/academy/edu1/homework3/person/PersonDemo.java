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
        System.out.println("Data for person 2 already exist: ");
        person2.setFirstName("Dmytro");
        person2.setLastName("Sergienko");
        person2.setBirthYear(1990);
        person2.output();
        System.out.println("Enter data for person 3: ");
        System.out.println("Enter first name: ");
        person3.setFirstName(scanner.nextLine());
        System.out.println("Enter last name: ");
        person3.setLastName(scanner.nextLine());
        person3.output();
        System.out.println("Enter data for person 4: ");
        person4.input(scanner);
        person4.output();
        System.out.println("Enter data for person 5: ");
        person5.input(scanner);
        System.out.println("Person 5: " + person5.getFirstName() + " " + person5.getLastName() + ", age: " + person5.getAge());
        scanner.close();
    }
}
