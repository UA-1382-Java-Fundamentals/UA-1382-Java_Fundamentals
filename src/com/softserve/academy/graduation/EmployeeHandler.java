package softserve.academy.graduation;

import java.time.LocalDate;
import java.util.*;

public class EmployeeHandler {
    final static ConsolePrinter PRINTER = new ConsolePrinter();
    final static InputValidator VALIDATOR = new InputValidator();

    public void addEmployee(
            Map<Integer, Employee> employeeMap,
            String newName,
            int newSalary,
            String newPosition,
            LocalDate newDateOfBirth,
            String newEmail) {
        Set<Integer> idSet = employeeMap.keySet();
        Integer newId = Collections.max(idSet) + 1;
        PRINTER.printLine();
        if (VALIDATOR.isEmailUnique(employeeMap, newEmail)) {
            employeeMap.put(
                    newId,
                    new Employee(
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
            Map<Integer, Employee> employeeMap,
            Integer targetId,
            String newName,
            int newSalary,
            String newPosition,
            LocalDate newDateOfBirth,
            String newEmail) {

        PRINTER.printLine();

        // a little workaround to avoid self-comparing of current email and new one if they are the same;
        String oldEmail = employeeMap.get(targetId).getEmail();
        employeeMap.get(targetId).setEmail("");

        if (VALIDATOR.isEmailUnique(employeeMap, newEmail)) {
            Employee employee = employeeMap.get(targetId);
            employee.setName(newName);
            employee.setSalary(newSalary);
            employee.setPosition(newPosition);
            employee.setDateOfBirth(newDateOfBirth);
            employee.setEmail(newEmail);
            employeeMap.put(targetId, employee);
            System.out.printf("Changes for %s (ID:%d) saved!\n", newName, targetId);
        } else {
            // if the new email has duplicate among other employees, we give back the old email to our instance;
            // this is done in case we have duplicate emails in the starting set of employees;
            employeeMap.get(targetId).setEmail(oldEmail);
            System.out.println("Employee changes discarded!");
        }
    }

    public void sortEmployeesByName(Map<Integer, Employee> employeeMap) {
//        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<>(employeeMap.entrySet());
//        employeeList.sort(Comparator.comparing(e -> e.getValue().getName()));
//        employeeMap.clear();
//        for (Map.Entry<Integer, Employee> entry : employeeList) {
//            employeeMap.put(entry.getKey(), entry.getValue());
//        }
        employeeMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .sorted(Comparator.comparing(Employee::getName))
                .collect()

    }

    public void sortEmployeesByPosition(Map<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<>(employeeMap.entrySet());
        employeeList.sort(Comparator.comparing((Map.Entry<Integer, Employee> e) ->
                e.getValue().getPosition()).thenComparingInt(e ->
                e.getValue().getSalary()));
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortEmployeesById(Map<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<>(employeeMap.entrySet());
        employeeList.sort(Comparator.comparingInt(Map.Entry::getKey));
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
    }

    public List<Task> getEmployeeTasks(Map<Integer, Task> taskMap, Integer employeeId) {
        List<Task> tasksAssigned = new ArrayList<>();
        for (Task task : taskMap.values()) {
            if (task.getStaff().contains(employeeId)) {
                tasksAssigned.add(task);
            }
        }
        return tasksAssigned;
    }

    public void removeEmployeeById(Map<Integer, Employee> employeeMap, Map<Integer, Task> taskMap, int employeeId) {
        if (VALIDATOR.isIdValid(employeeMap, employeeId)) {
            employeeMap.remove(employeeId);
            System.out.printf("Employee (%d) removed.\n", employeeId);
            for (Task task : taskMap.values()) {
                task.getStaff().remove(employeeId);
            }
        }
    }


}
