package com.softserve.academy.hw10_t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentOperations {
    static Scanner sc = new Scanner(System.in);

    // input a course for students
    public static void inputCourse(List<Student> students) throws Exception {
        for (Student s : students) {
            System.out.println("Input a number of a course for a student: " + s.getName());
            try {
                s.setCourse(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Not an integer number");
            } catch (Exception e) {
                throw new Exception("Unknown error");
            }
        }
    }

    // calculate an average grade for a list of grades
    public static int calculateAverageGrade(List<Integer> grades) {
        int totalGrade = 0;

        for (Integer grade : grades) {
            totalGrade += grade;
        }

        return totalGrade / grades.size();
    }

    // remove students with an average grade as less than 3
    public static void removeStudent(List<Student> students) {
        List<Integer> indexOfStudentToRemove = new ArrayList<>();

        // add to the list "indexOfStudentToRemove" indexes of students to be removed
        for (Student s : students) {
            if (StudentOperations.calculateAverageGrade(s.getGrades()) < 3) {
                indexOfStudentToRemove.add((students.indexOf(s)));
            }
        }

        // remove students by indexes
        for (int i = students.size() - 1; i >= 0; i--) {
            for (Integer ind : indexOfStudentToRemove) {
                if (ind == i) {
                    students.remove(ind.intValue());
                }
            }
        }
    }

    // promote students with an average grade as 3 and more
    public static void promoteStudent(List<Student> students) {

        for (Student s : students) {
            if (StudentOperations.calculateAverageGrade(s.getGrades()) >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    // print students
    public static String printStudents(List<Student> students) {
        return students.toString();
    }
}
