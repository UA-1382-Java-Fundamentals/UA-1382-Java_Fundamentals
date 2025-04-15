package softserve.academy.edu1.hw3.taskPractical2.model;

public class Employee {

    private static int totalEmployees;
    private String name;
    private int rate;
    private int hours;
    private static double totalSum = 0;

    public Employee() {
        totalEmployees++;
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public Employee(String name, int rate, int hours) {
        this(name);
        this.rate = rate;
        this.hours = hours;
        totalSum += getPaycheck();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getPaycheck() {
        return getSalary() + getBonuses();
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "{name: " + name + "\nhours: " + hours + "\nrate: " + rate + "}";
    }
}
