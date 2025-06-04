package softserve.academy.graduation;

import java.util.List;
import java.util.Map;

public class ConsolePrinter {
    private final int WIDTH = 20;

    final static EmployeeHandler EMP_HANDLER = new EmployeeHandler();
    final static TaskHandler TASK_HANDLER = new TaskHandler();
    final static InputValidator VALIDATOR = new InputValidator();

    public void outputEmployeeByName(
            Map<Integer, Employee> employees,
            Map<Integer, Task> tasks,
            String employeeName) {
        List<String> employeeNames = employees.values().stream()
                .map(Employee::getName)
                .map(String::toLowerCase)
                .toList();
        if (!employeeNames.contains(employeeName.toLowerCase())) {
            System.out.println(employeeName + " not found!");
        } else {
            for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                if (employeeName.equalsIgnoreCase((entry.getValue()).getName())) {
                    printLine();
                    System.out.printf("Employee found:\n%s: %s\n", entry.getKey(), entry.getValue());
                    printLine();
                    List<Task> tasksAssigned = EMP_HANDLER.getEmployeeTasks(tasks, entry.getKey());
                    if (!tasksAssigned.isEmpty()) {
                        System.out.printf("Tasks (%d) assigned to employee:\n", tasksAssigned.size());
                        for (Task task : tasksAssigned) {
                            System.out.println(task.toString());
                        }
                    } else {
                        System.out.printf(
                                "No tasks assigned for employee %s (ID:%s).\n",
                                employees.get(entry.getKey()).getName(),
                                entry.getKey());
                    }
                }
            }
        }
    }

    public void outputEmployeeById(
            Map<Integer, Employee> employees,
            Map<Integer, Task> tasks,
            Integer employeeId) {
        if (VALIDATOR.isIdValid(employees, employeeId)) {
            printLine();
            System.out.printf("Employee found:\n%s: %s\n", employeeId, employees.get(employeeId));
            printLine();
            List<Task> tasksAssigned = EMP_HANDLER.getEmployeeTasks(tasks, employeeId);
            if (!tasksAssigned.isEmpty()) {
                System.out.printf("Tasks (%d) assigned to employee:\n", tasksAssigned.size());
                for (Task task : tasksAssigned) {
                    System.out.println(task.toString());
                }
            } else {
                System.out.printf(
                        "No tasks assigned for employee %s (ID:%d).\n",
                        employees.get(employeeId).getName(),
                        employeeId);
            }
        }
    }

    public void printEmployeeName(Map<Integer, Employee> employees, Integer employeeId) {
        printLine();
        System.out.printf("Current name: %s\n", employees.get(employeeId).getName());
    }

    public void printEmployeeSalary(Map<Integer, Employee> employees, Integer employeeId) {
        printLine();
        System.out.printf("Current salary: %s\n", employees.get(employeeId).getSalary());
    }

    public void printEmployeePosition(Map<Integer, Employee> employees, Integer employeeId) {
        printLine();
        System.out.printf("Current position: %s\n", employees.get(employeeId).getPosition());
    }

    public void printEmployeeDate(Map<Integer, Employee> employees, Integer employeeId) {
        printLine();
        System.out.printf("Current date of birth: %s\n", employees.get(employeeId).getDateOfBirth());
    }

    public void printEmployeeEmail(Map<Integer, Employee> employees, Integer employeeId) {
        printLine();
        System.out.printf("Current email: %s\n", employees.get(employeeId).getEmail());
    }

    public void printEmployees(Map<Integer, Employee> employees) {
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

    public void outputTaskById(Map<Integer, Task> tasks, Integer taskId, Map<Integer, Employee> employees) {
        if (VALIDATOR.isIdValid(tasks, taskId)) {
            printLine();
            System.out.println(tasks.get(taskId).toString());
            printTaskStaff(tasks, employees, taskId);
        }
    }

    public void printTaskName(Map<Integer, Task> tasks, Integer taskId) {
        printLine();
        System.out.printf("Current name: %s\n", tasks.get(taskId).getName());
    }

    public void printTaskPriority(Map<Integer, Task> tasks, Integer taskId) {
        printLine();
        System.out.printf("Current priority: %s\n", tasks.get(taskId).getPriority());
    }

    public void printTaskIsActive(Map<Integer, Task> tasks, Integer taskId) {
        printLine();
        System.out.printf("Currently active: %s\n", tasks.get(taskId).isActive() ? "yes" : "no");
    }

    public void printTaskStaff(Map<Integer, Task> tasks, Map<Integer, Employee> employees, Integer taskId) {
        printLine();
        Map<Integer, Employee> employeesEngaged = TASK_HANDLER.getEmployeesEngaged(employees, tasks, taskId);
        if (!employeesEngaged.isEmpty()) {
            System.out.printf("Employees (%d) engaged in task:\n", employeesEngaged.size());
            printEmployees(employeesEngaged);
        } else {
            System.out.printf(
                    "No employees are engaged in task %s (ID:%d).\n",
                    tasks.get(taskId).getName(),
                    taskId);
        }
    }

    public void printTasksAll(Map<Integer, Task> tasks) {
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

    public void printTasksActive(Map<Integer, Task> tasks) {
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            if (entry.getValue().isActive()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().toString());
            }
        }
    }

    public void printMenuString(String message) {
        System.out.println(message);
        printLine();
    }

    public void printSeparator() {
        System.out.println("===".repeat(WIDTH));
    }

    public void printLine() {
        System.out.println("---".repeat(WIDTH));
    }

}
