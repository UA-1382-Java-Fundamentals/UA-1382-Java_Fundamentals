package com.softserve.academy.edu10;

import java.util.List;

class Student2 {
 private String name;
 private String group;
 private int course;
 private List<Integer>grades;

 //Constructor for analyzing every field
 public Student2(String name, String group, int course, List<Integer>grades) {
     this.name = name;
     this.group = group;
     this.course = course;
     this.grades = grades;
 }

 //Getter for the student's name
 public String getName() {
     return name;
 }

 //Getter for the course
 public int getCourse() {
     return course;
 }

 //Promotion of a student
 public void promote() {
     this.course++;
 }

 //Calculating the average grade
 public double getAverageGrade() {
     if (grades == null || grades.isEmpty())
         return 0;
     int sum = 0;
     for (int grade : grades) sum += grade;
     return (double) sum / grades.size();
 }
}