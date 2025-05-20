package Task10.HomeworkTask02;

import java.util.ArrayList;
import java.util.List;

import static Task10.HomeworkTask02.Subject.*;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Petrenko", 21, 3, new ArrayList<SubjectAndRate>() {{
            add(new SubjectAndRate(MATHEMATICS, 4));
            add(new SubjectAndRate(CHEMIA, 3));
            add(new SubjectAndRate(BIOLOGY, 5));
            add(new SubjectAndRate(ASTRONOMIA, 3));
        }});
        Student student2 = new Student("Kovalenko", 20, 3, new ArrayList<SubjectAndRate>() {{
            add(new SubjectAndRate(MATHEMATICS, 3));
            add(new SubjectAndRate(CHEMIA, 5));
            add(new SubjectAndRate(BIOLOGY, 5));
            add(new SubjectAndRate(ASTRONOMIA, 5));
        }});
        Student student3 = new Student("Fedorenko", 19, 2, new ArrayList<SubjectAndRate>() {{
            add(new SubjectAndRate(MATHEMATICS, 3));
            add(new SubjectAndRate(CHEMIA, 3));
            add(new SubjectAndRate(BIOLOGY, 2));
            add(new SubjectAndRate(ASTRONOMIA, 3));
        }});
        Student student4 = new Student("Lusenko", 34, 4, new ArrayList<SubjectAndRate>() {{
            add(new SubjectAndRate(MATHEMATICS, 5));
            add(new SubjectAndRate(CHEMIA, 5));
            add(new SubjectAndRate(BIOLOGY, 5));
            add(new SubjectAndRate(ASTRONOMIA, 5));
        }});

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println("STUDENT LIST: ");
        for (int i = 0; i <= studentList.size() - 1; i++) {
            System.out.println(studentList.get(i).toString());
        }

        System.out.println("===".repeat(20));

        StudentAction s1 = new StudentAction();
        s1.rateCheck(studentList);
        for (int i = 0; i <= studentList.size() - 1; i++) {
            System.out.println(studentList.get(i).toString());
        }

        System.out.println("===".repeat(20));

        s1.printStudents(studentList);
    }
}
