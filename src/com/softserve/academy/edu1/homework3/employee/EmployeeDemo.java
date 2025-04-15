package homework3.employee;

public class EmployeeDemo {
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
