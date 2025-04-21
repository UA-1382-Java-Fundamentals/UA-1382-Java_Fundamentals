package softserve.academy.homework3.Task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String output(){
        return String.format("%s %s born in %d and %d years old", getFirstName(), getLastName(), getBirthYear(), getAge());
    }

    public int getAge(){
        return LocalDate.now().getYear() - getBirthYear();
    }

    public void input(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter person's first name: ");
        setFirstName(console.nextLine());
        System.out.println("Enter person's last name: ");
        setLastName(console.nextLine());
        System.out.println("Enter person's year of birth: ");
        setBirthYear(console.nextInt());
    }
    public void changeName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person() {
    }

    public Person(String lastName,  String firstName, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", birthYear = " + birthYear +
                ", years = " + getAge() +
                '}';
    }
}
