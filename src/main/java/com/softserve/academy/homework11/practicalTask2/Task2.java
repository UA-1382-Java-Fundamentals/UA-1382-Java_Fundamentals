package com.softserve.academy.homework11.practicalTask2;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        var register = new EmployeeManagementSystem();
        register.run();
    }
}

class EmployeeManagementSystem {
    private Map<Integer, Employee> employees = new LinkedHashMap<>();
    public EmployeeManagementSystem() {
        addEmployee(new Employee(
                1,
                "Alice",
                Position.DEV,
                10_000,
                LocalDate.of(1999, Month.JANUARY, 1)));
        addEmployee(new Employee(
                2,
                "John",
                Position.QA,
                15_000,
                LocalDate.of(1998, Month.JANUARY, 1)
        ));
    }

    private void addEmployee(Employee employee) {
        if (employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id " + employee.id() + " already exists");
        }
        employees.put(employee.id(), employee);
    }



    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(3);
            switch (option) {
                case 1 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                //case 2 -> removeEmployee();
                case 3 -> editEmployee();

                case 4 -> {
                    showAllEmployees();
                }
                case 5 -> sortEmployees();
                case 6 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye");
    }

    private void sortEmployees() {
        System.out.println("""
                Chose the sorting criteria: "
                "1. By id" 
                "2. By name" 
                "3. By position
                """);
        int option = readOption(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            default -> throw new IllegalStateException("Invalid option");
        };
        List<Employee> employeeList = new ArrayList<>(employees.values());
        employeeList.sort(comparator);
        employees = new LinkedHashMap<>();
        for (Employee employee : employeeList) {
            employees.put(employee.id(), employee);
        }
        showAllEmployees();
    }

    private void editEmployee() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter employee's id to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        var employee = employees.get(id);
        if (employee == null) {
            System.out.println("Employee with id " + id + " not found");
            return;
        }
        System.out.println("The current name is " + employee.name());
        System.out.println("Enter new name or an empty string to keep the old name:");
        String newName = scanner.nextLine().trim();
        if (!newName.isEmpty()) {
            employee = employee.withName(newName);
        }
        System.out.println("The current position is " + employee.position());
        System.out.println("Enter new position or an empty string to keep the old position:");
        String newPositionText = scanner.nextLine().trim();
        if (!newPositionText.isEmpty()) {
            Position newPosition = Position.valueOf(newPositionText.trim().toUpperCase());
            employee = employee.withPosition(newPosition);
        }
        System.out.println("The current salary is " + employee.salary());
        System.out.println("Enter new salary or an empty string to keep the old salary:");
        String newSalaryText = scanner.nextLine().trim();
        if (!newSalaryText.isEmpty()) {
            double newSalary = Double.parseDouble(newSalaryText);
            employee = employee.withSalary(newSalary);
        }
        System.out.println("The current date of birth is " + employee.dateOfBirth());
        System.out.println("Enter new date of birth or an empty string to keep the old date of birth:");
        employees.put(id,employee);
    }

    private int readIdForNewEmployee() {
        var scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter employee's id: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (!employees.containsKey(id)) {
                return id;
            }
            System.out.println("Employee with id " + id + " already exists. Try another id.");
        }
    }

    private Employee promptNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets add new employee.");
        int id = readIdForNewEmployee();
        System.out.println("Enter employee's name: ");
        String name = scanner.nextLine();
        Position position = readPosition();
        System.out.println("Enter employee's salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter employee's date of birth: ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine().trim());
        return new Employee(id,
                name,
                position,
                salary,
                dateOfBirth);
    }

    private Position readPosition() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter employee's position: " + Arrays.toString(Position.values()) + ".");
        var positionText = scanner.nextLine();
       return Position.valueOf(positionText.trim().toUpperCase());
    }

    private void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private int readOption(int nOptions) {
        System.out.println("Enter your choice: ");
        var scanner = new Scanner(System.in);
        int res = Integer.parseInt(scanner.nextLine());
        return res;
    }

    private void showMainMenu() {
        System.out.println("Main menu: ");
        System.out.println("1. Add employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Show all employees");
        System.out.println("5. Sort");
        System.out.println("6. Exit");
    }
}

record Employee(
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
) {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
    public Employee withName(String name){
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withPosition(Position position) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withSalary(double newSalary) {
        return new Employee(id, name, position, newSalary, dateOfBirth);
    }
}

enum Position {
    DEV, QA, DEVOPS, MANAGER
}