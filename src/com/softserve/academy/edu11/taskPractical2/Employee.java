package softserve.academy.edu11.taskPractical2;

import java.time.LocalDate;

public class Employee {
    protected String name;
    protected int salary;
    protected String position;
    protected LocalDate dateOfBirth;

    public Employee(String name, int salary, String position, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return String.format("%-15s (%s) | %d USD | %s", name, dateOfBirth, salary, position);
    }
}
