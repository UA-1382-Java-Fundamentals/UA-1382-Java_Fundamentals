package com.softserve.academy.edu1.HW3.hw3;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private Long birthYear;

    Scanner input = new Scanner(System.in);


    Person(String firstName, String lastName) {
        input();
        System.out.println(output());
        changeName();
        System.out.println(output());
    }

   public void input() {
       System.out.println("Enter your first name: ");
       setFirstName( input.nextLine());

       System.out.println("Enter your last name: ");
       setLastName(input.nextLine());
       System.out.print("When did you born?");
       setBirthYear( input.nextLong());
       input.nextLine();
   }



    public String output(){
        return firstName + " " + lastName+ " " + birthYear+" age:"+ getAge();
    }
    public long  getAge(){
        return 2024-birthYear;
    }

    public void changeName(){
        System.out.println("Enter your NEW first name: ");
        String newFirstName = input.nextLine();
        setFirstName(newFirstName);
        System.out.println("Enter your NEW last name: ");
        String newLastName = input.nextLine();
        setLastName(newLastName);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(Long birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
