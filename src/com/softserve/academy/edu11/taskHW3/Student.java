package softserve.academy.edu11.taskHW3;

public class Student {
    protected String fullName;
    protected int course;

    public Student(String fullName, int course) {
        this.fullName = fullName;
        this.course = course;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return fullName + " (" + course + ")";
    }

}
