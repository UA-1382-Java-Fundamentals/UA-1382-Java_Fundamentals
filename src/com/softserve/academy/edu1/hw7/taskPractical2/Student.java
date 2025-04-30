package softserve.academy.edu1.hw7.taskPractical2;

public class Student extends Person {
    protected final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }
}
