package softserve.academy.edu1.hw3.taskHW3;

import softserve.academy.edu1.hw3.taskHW3.model.Person;

import java.util.Scanner;

public class PersonalData {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Person[] persons = {
                new Person(),
                new Person("John", "Doe", 1982),
                new Person("Mike", "Bar", 1985),
                new Person("Jane", "Foo", 1989),
                new Person("Rob", "White", 1992)
        };

        System.out.println("Current list of persons:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + " " + persons[i].output());
        }

        int personId = 0;
        while (true) {
            try {
                personId = Integer.parseInt(Person.inputFromConsole("Select a person: ")) - 1;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid person ID");
            }
        }

        int selector = 0;
        while (true) {
            try {
                System.out.println("Select operation:\n" +
                        "1 - get age of a person;\n" +
                        "2 - enter new data for a person;\n" +
                        "3 - show current data for a person;\n" +
                        "4 - change name of a person. " +
                        "First word for the first name, second - for the last name, separate by space;");
                selector = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid person operation number!");
            }
        }

        switch (selector) {
            case 1: {
                System.out.println(persons[personId].getAge());
                break;
            }
            case 2: {
                Person oldPerson = new Person(
                        persons[personId].getFirstName(),
                        persons[personId].getLastName(),
                        persons[personId].getBirthYear());
                while (true) {
                    try {
                        persons[personId].inputNewData();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(oldPerson.toString() + " was changed to " + persons[personId].toString());
                break;
            }
            case 3: {
                System.out.println(persons[personId].toString());
                break;
            }
            case 4: {
                String prompt = null;
                while (true) {
                    try {
                        prompt = SCANNER.nextLine();
                        Person.checkEmptyLine(prompt);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                String[] newName = prompt.split("\\s+");
                Person oldPerson = new Person(
                        persons[personId].getFirstName(),
                        persons[personId].getLastName(),
                        persons[personId].getBirthYear());
                if (newName.length > 1) {
                    persons[personId].setName(newName[0], newName[1]);
                } else {
                    persons[personId].setName(newName[0]);
                }
                System.out.println(oldPerson.toString() + " was renamed to " + persons[personId].toString());
                break;
            }
        }
        SCANNER.close();
    }
}
