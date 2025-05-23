package Task09.Homework02;

public class Main {

    public static void main(String[] args){

        Student[] studentList = {
                new Student("Petrenko","Pavlo",20,3),
                new Student("Lusenko","Ivan",18,2)
        };

        System.out.println("Before changes:");
        for(Student s : studentList){
            System.out.println(s.info());
            System.out.println(s.activity());
        }

        System.out.println("*=*".repeat(20));

        try{
            Student studentCopy = (Student) studentList[0].clone();
            studentCopy.setCourse(99);
            System.out.println(studentCopy.info());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
