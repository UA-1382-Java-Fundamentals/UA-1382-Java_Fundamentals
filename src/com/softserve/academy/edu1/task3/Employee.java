package task3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum = 0;
    public Employee () {
     }
    public Employee (String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }
    public Employee (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getSalary() {
        return rate * hours;
    }
    public double getBonus() {
        return getSalary() * 0.1;
    }
    public static int getTotalSum() {
        return totalSum;
    }
    @Override
    public String toString() {
        return "Employee: " +
                "name= "  + name +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Art", 20, 40);
        Employee employee2 = new Employee("Dmytro", 25, 35);
        Employee employee3 = new Employee("Vlad", 30, 30);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }
}
