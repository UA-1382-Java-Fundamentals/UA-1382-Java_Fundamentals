package softserve.academy.edu9.taskHW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Mike", "Foo", 19, 2));
        studentsList.add(new Student("Cathy", "Bar", 21, 4));
        studentsList.add(new Student("Rob", "Black", 20, 3));
        studentsList.add(new Student("Alice", "Smith", 21, 4));

        for (Student student : studentsList) {
            System.out.println(student.info() + " " + student.activity());
        }

        System.out.println("=".repeat(40));

        studentsList.add(studentsList.getFirst().clone());
        studentsList.getLast().setCourseId(3);
        studentsList.getLast().setFirstName("Juliet");
        studentsList.getLast().setLastName("Doe");

        for (Student student : studentsList) {
            System.out.println(student.info() + " " + student.activity());
        }

    }
}
