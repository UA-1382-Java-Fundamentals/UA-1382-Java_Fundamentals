package softserve.academy.edu11.taskHW3;

import java.util.Comparator;
import java.util.List;

public class StudentHandler {
    public void printStudents (List<Student> students, int course) {
        for (Student student : students) {
            // 0 course to print all students
            if (student.getCourse() == course | course == 0) {
                System.out.println(student.toString());
            }
        }
    }

    public void sortByName (List<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFullName().compareTo(s2.getFullName());
            }
        });
    }

    public void sortByCourse (List<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int comparison = Integer.compare(s1.getCourse(), s2.getCourse());
                if (comparison == 0) {
                    return s1.getFullName().compareTo(s2.getFullName());
                } else {
                    return comparison;
                }
            }
        });
    }

}
