package homework3.employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Art");
        employee1.setRate(20);
        employee1.setHours(40);
        Employee employee2 = new Employee("Dmytro");
        employee2.setRate(25);
        employee2.setHours(35);
        Employee employee3 = new Employee("Vlad", 30, 30);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary of all employees: " + Employee.getTotalSalary());
    }
}
