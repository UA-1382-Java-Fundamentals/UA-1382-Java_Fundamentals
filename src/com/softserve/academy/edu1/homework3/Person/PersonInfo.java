package com.softserve.academy.edu1.homework3.Person;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person();
        people[1] = new Person("Elton","John",1947);
        people[2]= new Person("Kendrick", "Lamar", 1987);
        people[3] = new Person("James", "Hetfield", 1963);
        people[4] = new Person("Ozzy", "Osbourne", 1948);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the person: ");
        for (int i = 0; i < people.length; i++) {
            System.out.println((i+1) + " " +people[i].getFirstName() + " " + people[i].getLastName());
        }
        System.out.println("(NOTE) to select a person choose a number from 1 to 5.\n");
        int personID = sc.nextInt()-1;

        System.out.println("""
                Please choose an option:\
                
                1 - to show current information about the person.\
                
                2 - to get age of the person.\
                
                3 - to edit information\
                
                (!!!IMPORTANT NOTE!!!) if you want to change the name of the person,\
                 please provide name first and surname after.""");
        int select=sc.nextInt();
        sc.nextLine();

        switch (select) {
            case 1: {
                System.out.println(people[personID].output());
                break;
            }
            case 2: {
                System.out.println(people[personID].getFirstName() + " " + people[personID].getLastName()
                        + " is " + people[personID].getAge() + " years old.");
                break;
            }
            case 3: {
                String oldPersonName = people[personID].getFirstName();
                String oldPersonSurname = people[personID].getLastName();
                int oldBirthYear = people[personID].getBirthYear();
                people[personID].input();
                System.out.println(oldPersonName + " " + oldPersonSurname + " " + oldBirthYear +
                        " is changed to " + people[personID].getFirstName() + " " + people[personID].getLastName() +
                        " " + people[personID].getBirthYear());
            }
        }
    }
}
