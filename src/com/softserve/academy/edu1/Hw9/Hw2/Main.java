package com.softserve.academy.edu1.Hw9.Hw2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Pablo", "Pomidorini"), 19, 2);
        System.out.println(student1.info());
        System.out.println("Activity: " + student1.activity());
        System.out.println("-".repeat(22));
        Student student2 = student1.clone();
        student2.setCourse(9912);
        student2.setAge(99);//ну щоб було видно
        student2.getFullName().setFirstName("Oleh");
        student2.getFullName().setLastName("Vlasyuk");
        System.out.println(student2.info());
        System.out.println("Activity: " + student2.activity());
        System.out.println();
    }
}
