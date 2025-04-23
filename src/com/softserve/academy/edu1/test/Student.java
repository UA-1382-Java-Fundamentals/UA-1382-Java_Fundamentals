public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int burse;
    private int curse;

    public Student() { }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBurse() {
        return burse;
    }

    public void setBurse(int burse) {
        this.burse = burse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int getCurse() {
        return curse;
    }
}
