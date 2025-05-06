package softserve.academy.edu9.taskHW1;

public class FullName implements Cloneable {
    protected String firstName;
    protected String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected FullName clone() throws CloneNotSupportedException {
        return (FullName) super.clone();
    }
}
