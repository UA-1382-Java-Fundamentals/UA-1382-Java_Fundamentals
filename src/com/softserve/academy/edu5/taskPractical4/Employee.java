package softserve.academy.edu5.taskPractical4;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private int departmentId;
    private int salary;

    public Employee() {
        this("Default Employee", 0, 0);
    }

    public Employee(String name, int departmentId, int salary) {
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return -(Integer.compare(getSalary(), otherEmployee.getSalary()));
    }

    public static void main(String[] args) {
        int count = 5;
        Employee[] employees = new Employee[count];
        employees[0] = new Employee("John Doe", 1, 60);
        employees[1] = new Employee("Mike Foo", 2, 20);
        employees[2] = new Employee("Ellen Bar", 2, 25);
        employees[3] = new Employee("Mary Black", 3, 16);
        employees[4] = new Employee("Rob Lee", 2, 23);
        int departmentIdMax = 0;
        for (Employee employee : employees) {
            departmentIdMax = Math.max(departmentIdMax, employee.getDepartmentId());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department ID (number): ");
        int departmentId = sc.nextInt();
        while ((departmentId > departmentIdMax) || departmentId <= 0) {
            System.out.print("Department ID out of bounds, try again: ");
            departmentId = sc.nextInt();
        }
        System.out.println("======================================================================");
        System.out.println("Here is the list of employees, with default order: ");
        System.out.println("======================================================================");
        List<Employee> employeesList = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                employeesList.add(employee);
                System.out.println(employee.getName() + "; salary " + employee.getSalary());
            }
        }
        System.out.println("======================================================================");
        System.out.println("Here is the list of employees, ordered by salary in descending order: ");
        System.out.println("======================================================================");
        Collections.sort(employeesList);
        for (Employee employee : employeesList) {
            System.out.println(employee.getName() + "; salary " + employee.getSalary());
        }
    }
}
