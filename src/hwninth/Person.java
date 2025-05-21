package hwninth;

public abstract class Person {


    private FullName fullName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }


    public String info() {
        return String.format(
                "First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(),
                fullName.getLastName(),
                age
        );
    }


    public abstract String activity();


    public class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
