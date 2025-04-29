package softserve.academy.homework5.practicalTask4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Peter", "office",1, 40000);
        Employee employee2 = new Employee("Oksana", "administration", 2 , 22000);
        Employee employee3 = new Employee("Taras", "homeworker", 3, 0);
        Employee employee4 = new Employee("Anna", "marketing", 4, 35000);
        Employee employee5 = new Employee("Igor", "sales", 5, 28000);

        Employee [] employees = new Employee[]{employee1,employee2,employee3,employee4,employee5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department number to display employees: ");
        int department = scanner.nextInt();

        System.out.println("Employees in department " + department + ":");
        displayEmployeesByDepartment(employees, department);

        System.out.println("Employees sorted by salary (descending):");
        sortEmployee(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void displayEmployeesByDepartment(Employee [] employees, int department){
        for (Employee employee: employees){
            if(employee.getNumber() == department){
                System.out.println(employee);
            }
        }
    }
    public static void sortEmployee(Employee[] employees){
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.getSalary(),o1.getSalary());
            }
        });
    }
}
