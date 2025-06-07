package com.softserve.academy.edu1.Hw10.hw2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Student {
   public String name;
   public String group;
   public int course;

   public  List<Integer> grades=new LinkedList();


   Student(String name, String group, int course) {
       this.name = name;
       this.group = group;
       this.course = course;

   }
    public void fill() {
        Random rand = new Random();
        int n = rand.nextInt(4) + 2; // Від 2 до 5 оцінок
        for (int i = 0; i < n; i++) {
            grades.add(rand.nextInt(12)); // оцінка від 0 до 11
        }
    }

    public double averageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
   public void print(){
       for(int i=0; i<grades.size(); i++){
           System.out.println(grades.get(i));
       }

   }
}
