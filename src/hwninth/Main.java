package hwninth;

public class Main {
    public static void main(String[] args) {
        Person student = new Teacher("Alex", "Kodin", 45, "KNU");

        System.out.println(student.info());
        System.out.println(student.activity());
    }
}