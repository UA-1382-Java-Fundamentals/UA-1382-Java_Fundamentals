package Task09.Homewok01;

public abstract class Person extends FullName {

    protected FullName fullName;
    protected int age;

    public Person( String firstName, String lastName,int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public String info(){
        return
                "FirstName : " + getFirstName() + '\'' +
                ", LastName : " + getLastName() + '\'' +
                "Age : " + age;
    }

    public abstract String activity();
}
