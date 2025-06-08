package softserve.academy.edu10.taskHW2;

//2. Create a class called Student which includes the following fields: name, group, course, and grades in
//different subjects. Create a collection that holds all objects. Write a methods that:
//o removes students with a grade point average of less than 3. If a student's average score is 3 or
//higher, then they will be automatically promoted to the next course level.
//o printStudents(List<Student> students, int course) which takes a list of students and a course
//number as inputs. This method should print out the names of the students who are enrolled in the
//specified course number to the console.
//• In main() method create collection and output result.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static final StudentHandler SH = new StudentHandler();

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("John Doe", 1, 2, new LinkedList<>(List.of(3,5,4,2,3,4))),
                new Student("Alice Foo", 1, 1, new LinkedList<>(List.of(2,4,4,5,2,3))),
                new Student("Dean Bar", 2, 1, new LinkedList<>(List.of(1,2,3,2,2,4))),
                new Student("Charlie White", 1, 3, new LinkedList<>(List.of(2,1,2,3,2,4))),
                new Student("Ellen Bright", 2, 2, new LinkedList<>(List.of(2,2,4,2,3,5))),
                new Student("Frank Groom", 1, 3, new LinkedList<>(List.of(5,5,2,3,1,4))),
                new Student("Gina Moore", 2, 2, new LinkedList<>(List.of(3,2,4,1,3,1))),
                new Student("Harry Puck", 2, 3, new LinkedList<>(List.of(2,2,1,2,3,4)))
        ));

        System.out.println("Initial list of students: ");
        SH.printList(students);
        System.out.println("=".repeat(50));

        double passGrade = 3;
        SH.graduateStudents(students, passGrade);
        System.out.println("List of students, who passed and advanced the year: ");
        SH.printList(students);
        System.out.println("=".repeat(50));

        int courseId = 3;
        System.out.printf("List of students of Year %d: \n", courseId);
        List<Student> result = SH.printStudents(students, courseId);
        SH.printList(result);
    }
}