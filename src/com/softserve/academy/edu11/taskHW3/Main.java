package softserve.academy.edu11.taskHW3;

//3. Create a class named Student that stores information about the student's name and
//course.
//• The class should include properties to access these fields, a constructor with
//parameters, and a method called printStudents that takes a List of students and an
//Integer representing the course number as arguments.
//• This method should print the names of the students from the list who are enrolled in
//the specified course to the console using an iterator.
//• Additionally, add methods to compare students by name and by course.
//• In the main() method, create a List named "students" and add five different Student
//objects to it. Then, display the list of students sorted by name and sorted by course.

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final StudentHandler SH = new StudentHandler();

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(List.of(
                new Student ("John Foo",3),
                new Student ("Bob White",2),
                new Student ("Dan Bar",2),
                new Student ("Carl Moore",3),
                new Student ("Ellie Doe",3)
        ));

        System.out.println("List of students:");
        SH.printStudents(students, 0);
        System.out.println("===".repeat(15));

        int targetCourse = 3;
        System.out.printf("List of students on course %d: \n", targetCourse);
        SH.printStudents(students, targetCourse);
        System.out.println("===".repeat(15));

        System.out.println("List of students sorted by name: ");
        SH.sortByName(students);
        SH.printStudents(students, 0);
        System.out.println("===".repeat(15));

        System.out.println("List of students sorted by course: ");
        SH.sortByCourse(students);
        SH.printStudents(students, 0);
        System.out.println("===".repeat(15));
    }
}
