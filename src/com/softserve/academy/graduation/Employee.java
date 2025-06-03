package softserve.academy.graduation;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private String position;
    private LocalDate dateOfBirth;
    private String email;

    // validate for not null
    // email, dateOfBirth
    public Employee(String name, int salary, String position, int year, int month, int day, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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

    //add validation not null
    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    //add validation not null
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%-15s (%s) | %d USD | %s", name, dateOfBirth, salary, position);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
