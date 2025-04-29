import com.softserve.academy.edu1.homework3.hometask3.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Input information for person " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input();
            System.out.println();
        }

        System.out.println("People information:");
        for (Person person : people) {
            person.output();
            System.out.println("---------------------------");
        }
    }
}

