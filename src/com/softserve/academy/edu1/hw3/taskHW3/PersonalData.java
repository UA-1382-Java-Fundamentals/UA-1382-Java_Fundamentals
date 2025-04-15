package softserve.academy.edu1.hw3.taskHW3;

import softserve.academy.edu1.hw3.taskHW3.model.Person;

import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        Person personA = new Person();
        Person personB = new Person("John", "Doe", 1982);
        Person personC = new Person("Mike", "Bar", 1985);
        Person personD = new Person("Jane", "Foo", 1989);
        Person personE = new Person("Rob", "White", 1992);

        persons[0] = personA;
        persons[1] = personB;
        persons[2] = personC;
        persons[3] = personD;
        persons[4] = personE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Select a person:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i+1) + " " + persons[i].output());
        }
        int personId = sc.nextInt()-1;

        System.out.println("Select operation:\n1 - get age of a person\n2 - enter new data for a person\n" +
                "3 - show current data for a person\n4 - change name of a person. " +
                "First word for the first name, second - for the last name, separate by coma;");
        int selector = sc.nextInt();
        sc.nextLine();

        switch (selector) {
            case 1: {
                System.out.println(persons[personId].getAge());
                break;
            }
            case 2: {
                String oldFirstName = persons[personId].getFirstName();
                String oldLastName = persons[personId].getLastName();
                int oldBirthYear = persons[personId].getBirthYear();
                persons[personId].input();
                System.out.println(oldFirstName + " " + oldLastName + " (" + oldBirthYear  + ") was changed to "
                        + persons[personId].getFirstName() + " " + persons[personId].getLastName()
                        + " (" + persons[personId].getBirthYear() + ")");
                break;
            }
            case 3: {
                System.out.println(persons[personId].output());
                break;
            }
            case 4: {
                String oldFirstName = persons[personId].getFirstName();
                String oldLastName = persons[personId].getLastName();
                String prompt = sc.nextLine();
                String[] newName = prompt.split("\\s+");
                if (newName.length>1) {
                    persons[personId].setName(newName[0], newName[1]);
                }
                else {
                    persons[personId].setName(newName[0]);
                }
                System.out.println(oldFirstName + " " + oldLastName + " was renamed to "
                        + persons[personId].getFirstName() + " " + persons[personId].getLastName());
                break;
            }
        }
    }
}
