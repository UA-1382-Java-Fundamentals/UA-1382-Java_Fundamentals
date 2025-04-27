package softserve.academy.edu1.hw6.taskHW2;


public class Developer extends Employee {
    protected String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s | Age: %d years | Salary: \u20b4 %.2f | Position: %s", name, age, salary, position);
    }
}
