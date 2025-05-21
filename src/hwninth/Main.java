package hwninth;

public class Main {
    public static void main(String[] args) {
        Person teacher = new Teacher("Alex", "Kodin", 45, "KNU");

        System.out.println(teacher.info());
        System.out.println(teacher.activity());
    }
}