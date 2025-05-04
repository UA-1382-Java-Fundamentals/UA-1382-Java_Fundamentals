package softserve.academy.homework7.practicalTask2;

public class Teacher extends Staff{
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Type of person " + TYPE_PERSON + ", name: " + getName());
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public double salary() {
        return 12000;
    }
}
