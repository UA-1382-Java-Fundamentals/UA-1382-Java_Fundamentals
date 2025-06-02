package Task07.Practikal_task2;

public class Student extends Person{

    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super.setName(name);
    }

    public  void print(){
        System.out.println("I am a ..." + TYPE_PERSON);
    }
}
