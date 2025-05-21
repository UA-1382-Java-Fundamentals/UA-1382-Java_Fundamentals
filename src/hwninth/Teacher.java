package hwninth;

public class Teacher extends Person {

    private final String university;

    public Teacher(String firstName, String lastName, int age, String university) {
        super(firstName, lastName, age);
        this.university = university;
    }

    @Override
    public String activity() {
        return "I at " + university;
    }
}
