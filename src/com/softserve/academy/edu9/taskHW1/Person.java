package softserve.academy.edu9.taskHW1;

import java.util.Random;

public abstract class Person {
    protected int age;
    protected FullName fullName;

    static final Random RANDOM = new Random();

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public String info() {
        return String.format("First name: %s | Last name: %s | Age: %d", fullName.firstName, fullName.lastName, age);
    }

    public abstract String activity();

}
