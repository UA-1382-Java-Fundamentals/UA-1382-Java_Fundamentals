package softserve.academy.edu1.hw7.taskPractical2;

public class Teacher extends Staff {
    protected final String TYPE_PERSON = "Teacher";

    public Teacher (String name, int salary) {
        super(name, salary);
    }

    @Override
    void print() {
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }

    @Override
    void salary() {
        System.out.println("I earn USD " + salary);
    }
}
