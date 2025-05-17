package Task09.Homework02;

import Task09.Homewok01.FullName;
import Task09.Homewok01.Person;

public class Student extends Person implements Cloneable {

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName,lastName, age);
        this.course = course;
    }

    @Override
    public String info(){
        return
                "FirstName : " + getFirstName() + '\'' +
                        ", LastName : " + getLastName() + '\'' +
                        "Age : " + age + '\'' + "Course : " + course;
    }

    public String activity(){
        return "I study at university";
    }

    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
}
