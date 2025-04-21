package softserve.academy.homework3.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n = scanner.nextInt();
        scanner.nextLine();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person();
        }

        System.out.println("Enter 'stop' to end ");
        while (true) {
            printMenu();
            String input = scanner.nextLine();
             switch (input) {
                 case "1":input(persons);
                 break;
                 case "2":output(persons);
                 break;
                 case "3":change(persons);
                 break;
                 case "4":print(persons);
                 break;
                 case "stop":return;
                 default:
                     System.out.println("Wrong command!");
             }
        }


    }

    public static void printMenu(){
        System.out.println("Menu:");
        System.out.println("Chose command:");
        System.out.println("1 - input information about the person ");
        System.out.println("2 - output information about the person");
        System.out.println("3 - change the first name or/and last name");
        System.out.println("4 - output all information");
    }

    public static void change(Person[]person){
        String command = "change";
        System.out.println("Change first name and last name");
        person[choose(command)].changeName(name(),name());
    }

    public static void output(Person[]person){
        String command = "output";
        System.out.println(person[choose(command)].output());

    }

    public static void input(Person[]person){
        System.out.println("Input information about the person ");
        String command = "input";
        person[choose(command)].input();
    }


    public static void print(Person[]persons){
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }

    public static int choose(String command){
        System.out.println("Chose person information to " + command);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() - 1;

    }

    public static String name(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
