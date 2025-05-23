package Task11.Homework03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Ivanov", 2));
        list.add(new Student("Petrov", 3));
        list.add(new Student("Sidorov", 2));
        list.add(new Student("Pavlov", 2));
        list.add(new Student("Naluvaiko", 1));
        list.add(new Student("Petrov", 4));

        System.out.println("=List of students=");
        for (Student s : list) {
            System.out.println("Name : " + s.getName() + " | course : " + s.getCourse());
        }
        System.out.println("==".repeat(20));

        Collections.sort(list);
        System.out.println("=List after sorting=");
        for (Student s : list) {
            System.out.println("Name : " + s.getName() + " | course : " + s.getCourse());
        }
        System.out.println("==".repeat(20));

        System.out.println("After check with iterator:");
        Student s = new Student();
        s.printStudent(list, 2);

    }
}
