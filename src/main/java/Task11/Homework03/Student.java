package Task11.Homework03;

import java.util.Iterator;
import java.util.List;

public class Student implements Comparable {

    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudent(List<Student> studentList, int courseNum) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse() == courseNum) {
                System.out.println("Name : " + s.getName() + " | course : " + s.getCourse());
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (name.equals(s.getName())) {
            if (course > s.getCourse()) {
                return 1;
            } else if (course < s.getCourse()) {
                return -1;
            } else {
                return 0;
            }
        }
        return name.compareTo(s.getName());
    }
}
