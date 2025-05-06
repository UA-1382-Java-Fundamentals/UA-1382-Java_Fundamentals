package softserve.academy.edu7.taskPractical2;

public class Cleaner extends Staff {
    protected final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, int salary) {
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
