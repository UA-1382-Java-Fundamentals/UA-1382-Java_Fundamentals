package Task_3_OOP.Example.Example.Homework;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    static Scanner sc;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){
    }

    public  void input(){

        System.out.println("Name :");
        firstName = sc.nextLine();

        System.out.println("Lastname :");
        lastName = sc.nextLine();

        System.out.println("Birth year :");
        birthYear = sc.nextInt();
    }

    public void output(Person person){
        int age = person.getAge(person);
        System.out.println("Name is + " + person.getFirstName());
        System.out.println("Lastname is : " + person.getLastName());
        System.out.println("Age is : " + age);
    }

    public int getAge(Person person){

        System.out.println("Your birsday year : ");
        birthYear = sc.nextInt();
        int age = 2025 - birthYear;
        return age;
    }

    public void changeName(String fn, String ln){

        System.out.println("Old name is " + fn);
        System.out.println("New name is ");
        fn = sc.nextLine();

        System.out.println("Old lastname is " + ln);
        System.out.println("New lastname is ");
        ln = sc.nextLine();
    }



    public static void main (String[] args){
        sc = new Scanner(System.in);

        Person person1 = new Person("Anna", "Karenina");
        Person person2 = new Person("Penelopa", "Kruz");
        Person person3 = new Person("Lesia", "Yrrainka");
        Person person4 = new Person("Lilia","Popova");
        Person person5 = new Person("Ryslana","Last");

        person1.output(person1);
        person2.output(person2);
        person3.output(person3);
        person4.output(person4);
        person5.output(person5);

        sc.close();
    }
}
