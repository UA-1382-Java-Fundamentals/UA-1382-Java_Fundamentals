package Task10.HomeworkTask02;

import java.util.ArrayList;

public class Student implements Comparable {

    private String name;
    private int group;
    private int course;
    ArrayList<SubjectAndRate> rateList;

    public Student(String name, int group, int course, ArrayList<SubjectAndRate> rateList) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rateList = rateList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<SubjectAndRate> getRateList() {
        return rateList;
    }

    public void setRateList(ArrayList<SubjectAndRate> rateList) {
        this.rateList = rateList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course + " " +
                rateList +
                '}';
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
