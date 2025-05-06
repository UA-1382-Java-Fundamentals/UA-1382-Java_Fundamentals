package softserve.academy.edu9.taskHW1;

public class Student extends Person implements Cloneable {
    protected int courseId;

    public Student(
            String firstName,
            String lastName,
            int age,
            int courseId) {
        super(firstName, lastName, age);
        this.courseId = courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setFirstName(String firstName) {
        this.fullName.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        this.fullName.setLastName(lastName);
    }

    @Override
    public String info() {
        return String.format("%s %s (%d) (%d year)",
                fullName.firstName,
                fullName.lastName,
                age,
                courseId);
    }

    @Override
    public String activity() {
        return switch (RANDOM.nextInt(3)) {
            case 0 -> "is between lessons";
            case 1 -> "is studying";
            case 2 -> "is sleeping";
            default -> "is doing unknown activity";
        };
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.fullName = this.fullName.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
