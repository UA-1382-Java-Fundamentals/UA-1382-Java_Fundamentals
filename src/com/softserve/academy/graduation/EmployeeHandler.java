package softserve.academy.graduation;

import java.time.LocalDate;
import java.util.*;

public class EmployeeHandler {
    final static ConsolePrinter PRINTER = new ConsolePrinter();
    final static InputValidator VALIDATOR = new InputValidator();

    public void addEmployee(
            Map<Integer, Employee> employees,
            String newName,
            int newSalary,
            String newPosition,
            LocalDate newDateOfBirth,
            String newEmail) {
        int newId;
        if (!employees.isEmpty()) {
            newId = Collections.max(employees.keySet()) + 1;
        } else {
            newId = 1;
        }
        PRINTER.printLine();
        if (VALIDATOR.isEmailUnique(employees, newEmail)) {
            employees.put(
                    newId,
                    new Employee(
                            newId,
                            newName,
                            newSalary,
                            newPosition,
                            newDateOfBirth,
                            newEmail
                    )
            );
            System.out.printf("New record for employee %s (ID:%d) was created!\n", newName, newId);
        } else {
            System.out.println("Employee creation failed!");
        }
    }

    public void editEmployee(
            Map<Integer, Employee> employees,
            Integer targetId,
            String newName,
            int newSalary,
            String newPosition,
            LocalDate newDateOfBirth,
            String newEmail) {

        PRINTER.printLine();

        // a little workaround to avoid self-comparing of current email and new one if they are the same;
        String oldEmail = employees.get(targetId).getEmail();
        employees.get(targetId).setEmail("");

        if (VALIDATOR.isEmailUnique(employees, newEmail)) {
            Employee employee = employees.get(targetId);
            employee.setName(newName);
            employee.setSalary(newSalary);
            employee.setPosition(newPosition);
            employee.setDateOfBirth(newDateOfBirth);
            employee.setEmail(newEmail);
            employees.put(targetId, employee);
            System.out.printf("Changes for %s (ID:%d) saved!\n", newName, targetId);
        } else {
            // if the new email has duplicate among other employees, we give back the old email to our instance;
            // this is done in case we have duplicate emails in the starting set of employees;
            employees.get(targetId).setEmail(oldEmail);
            System.out.println("Employee changes discarded!");
        }
    }

    public void sortEmployeesByName(Map<Integer, Employee> employees) {
        List<Map.Entry<Integer, Employee>> sortedList = employees.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getName()))
                .toList();
        employees.clear();
        for (Map.Entry<Integer, Employee> entry : sortedList) {
            employees.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortEmployeesByPosition(Map<Integer, Employee> employees) {
        List<Map.Entry<Integer, Employee>> sortedList = employees.entrySet().stream()
                .sorted(Comparator.comparing((Map.Entry<Integer, Employee> e) -> e.getValue().getPosition())
                        .thenComparingInt(e -> e.getValue().getSalary()))
                .toList();
        employees.clear();
        for (Map.Entry<Integer, Employee> entry : sortedList) {
            employees.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortEmployeesById(Map<Integer, Employee> employees) {
        List<Map.Entry<Integer, Employee>> sortedList = employees.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();
        employees.clear();
        for (Map.Entry<Integer, Employee> entry : sortedList) {
            employees.put(entry.getKey(), entry.getValue());
        }
    }

    public List<Task> getEmployeeTasks(Map<Integer, Task> tasks, Integer employeeId) {
        return tasks.values().stream()
                .filter(t -> t.getStaff().contains(employeeId))
                .toList();
    }

    public void removeEmployeeById(Map<Integer, Employee> employees, Map<Integer, Task> tasks, int employeeId) {
        if (VALIDATOR.isIdValid(employees, employeeId)) {
            employees.remove(employeeId);
            System.out.printf("Employee (%d) removed.\n", employeeId);
            for (Task task : tasks.values()) {
                task.getStaff().remove(employeeId);
            }
        }
    }
}
