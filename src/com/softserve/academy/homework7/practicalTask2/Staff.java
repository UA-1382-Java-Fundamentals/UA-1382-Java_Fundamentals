package softserve.academy.homework7.practicalTask2;

public abstract class Staff extends Person{
    public final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}
