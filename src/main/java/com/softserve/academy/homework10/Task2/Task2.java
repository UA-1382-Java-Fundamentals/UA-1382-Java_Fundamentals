package com.softserve.academy.homework10.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Ivan", 12,12, Arrays.asList(4,4,3,2,2,1)),
                new Student("Іван Петренко", 101, 1, Arrays.asList(4, 3, 5, 4)),
                new Student("Олена Ковальчук", 102, 1, Arrays.asList(2, 3, 2, 3)),
                new Student("Максим Іванов", 101, 2, Arrays.asList(5, 5, 5, 4)),
                new Student("Анастасія Бондар", 103, 3, Arrays.asList(3, 3, 3, 3)),
                new Student("Денис Шевченко", 102, 2, Arrays.asList(1, 2, 2, 2))
                ));
        printStudents(students);
        removeStudent(students);
        printStudents(students);


    }

    public static void removeStudent(List<Student> students){
        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            List<Integer> grades = student.getGrades();
            int sum = 0;
            for (int j = 0; j < grades.size(); j++) {
                sum += grades.get(j);
            }

            double average = (double) sum / grades.size();
            if (average < 3.0){
                students.remove(i);
                System.out.println(student.getName() + " was removed");
            }else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
