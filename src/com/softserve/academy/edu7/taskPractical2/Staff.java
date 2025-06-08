package softserve.academy.edu7.taskPractical2;

public abstract class Staff extends Person {
    protected int salary;

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    abstract void salary();
}
