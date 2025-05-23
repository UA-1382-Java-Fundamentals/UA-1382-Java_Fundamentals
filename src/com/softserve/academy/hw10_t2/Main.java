/*
Create a class called Student which includes the following fields: name, group, course, and grades in,
different subjects. Create a collection that holds all objects. Write a methods that:

    o removes students with a grade point average of less than 3. If a student's average score is 3 or
    higher, then they will be automatically promoted to the next course level.

    o printStudents(List<Student> students, int course) which takes a list of students and a course
    number as inputs. This method should print out the names of the students who are enrolled in the
    specified course number to the console.
        • In main() method create collection and output result.
 */

package com.softserve.academy.hw10_t2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Dan Nine", 31, new ArrayList<>(List.of(2,4,5,5))),
                        new Student("Ian Mack", 54, new ArrayList<>(List.of(2,2,2))),
                        new Student("Alan Denver", 32, new ArrayList<>(List.of(2,3,5,5,4,3))),
                        new Student("Maia Delone", 28, new ArrayList<>(List.of(2,2,2)))
                )
        );

        StudentOperations.inputCourse(students);

        System.out.println("Initial list of students: " + StudentOperations.printStudents(students));

        StudentOperations.removeStudent(students);
        System.out.println("\nThe list of students after removing of students with an average grade as less than 3: " + StudentOperations.printStudents(students));

        StudentOperations.promoteStudent(students);
        System.out.println("\nThe list of students after promoting of students with an average grade as 3 and more: " + StudentOperations.printStudents(students));

    }
}