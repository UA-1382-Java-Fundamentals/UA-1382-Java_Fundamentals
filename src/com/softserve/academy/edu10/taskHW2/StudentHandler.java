package softserve.academy.edu10.taskHW2;

import java.util.ArrayList;
import java.util.List;

public class StudentHandler {

    public double getAverageGrade (Student student) {
        double sum = 0;
        for (int grade : student.getGrades()) {
            sum += grade;
        }
        return sum / student.getGrades().size();
    }

    public void promoteStudent(Student student) {
        student.setCourse(student.getCourse() + 1);
    }

    public void dropStudent(List<Student> students, int index) {
        students.remove(index);
    }

    public void printList(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public List<Student> printStudents(List<Student> students, int course) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getCourse() == course) {
                result.add(s);
            }
        }
        return result;
    }

    public void graduateStudents(List<Student> students, double passGrade) {
        for (int i = 0; i < students.size(); i++) {
            double averageGrade = getAverageGrade(students.get(i));
            if (averageGrade < passGrade) {
                dropStudent(students, i);
            }
            else if (averageGrade >= passGrade) {
                promoteStudent(students.get(i));
            }
        }
    }
}
