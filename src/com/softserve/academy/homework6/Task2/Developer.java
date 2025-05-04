package softserve.academy.homework6.Task2;

public class Developer extends Employee {
    private String Position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.Position = position;
    }

    public String getPosition() {
        return Position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 %.2f", getName(),getAge(),getPosition(),getSalary());
    }
}
