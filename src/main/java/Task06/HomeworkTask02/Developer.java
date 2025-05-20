package Task06.HomeworkTask02;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String report(){
        return String.format("Name: %s, Age: %d," + " Salary: %.2f \u20B4," + " Position : "+ position ,getName(),getAge(),getSalary());
    }
}
