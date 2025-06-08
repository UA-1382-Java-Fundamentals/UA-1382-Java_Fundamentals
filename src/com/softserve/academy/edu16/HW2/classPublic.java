package softserve.academy.edu16.HW2;

import java.util.LinkedList;

public class classPublic {
    private String name;
    private int group;
    private int course;
    private LinkedList<Integer> grades;

    public classPublic(String name, int group, int course, LinkedList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setGrades(LinkedList<Integer> grades) {
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

}
