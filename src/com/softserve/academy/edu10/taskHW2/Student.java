package softserve.academy.edu10.taskHW2;

import java.util.LinkedList;

public class Student {
    protected String name;
    protected int group;
    protected int course;
    protected LinkedList<Integer> grades;

    public Student(String name, int group, int course, LinkedList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public LinkedList<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return name + ", Gr:" + group + ", Yr:" + course + ", grades=" + grades;
    }
}
