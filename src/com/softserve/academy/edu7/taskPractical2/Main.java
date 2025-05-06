package softserve.academy.edu7.taskPractical2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Mike"),
                new Student("John"),
                new Student("Alice"),
                new Teacher("Rob", 1500),
                new Teacher("Kate", 1700),
                new Cleaner("Frank", 700)
        };

        for (Person p : persons) {
            p.print();
            if (p instanceof Staff) {
                ((Staff)p).salary();
            }
            System.out.println("--------------------------");
        }
    }
}
