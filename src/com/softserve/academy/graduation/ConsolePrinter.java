package softserve.academy.graduation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConsolePrinter {
    private final int WIDTH = 20;

    final static EmployeeHandler EMP_HANDLER = new EmployeeHandler();
    final static TaskHandler TASK_HANDLER = new TaskHandler();
    final static InputValidator VALIDATOR = new InputValidator();

    public void outputEmployeeByName(
            Map<Integer, Employee> employeeMap,
            Map<Integer, Task> taskMap,
            String employeeName) {
        HashMap<Integer, String> employeeNames = new HashMap<>();
        int i = 0;
        for (Employee employee : employeeMap.values()) {
            employeeNames.put(i++, employee.getName().toLowerCase());
        }
        if (!employeeNames.containsValue(employeeName.toLowerCase())) {
            System.out.println(employeeName + " not found!");
        } else {
            Iterator<Map.Entry<Integer, Employee>> iterator = employeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Employee> entry = iterator.next();
                if (employeeName.equalsIgnoreCase(((Employee) entry.getValue()).getName())) {
                    printLine();
                    System.out.printf("Employee found:\n%s: %s\n", entry.getKey(), entry.getValue());
                    printLine();
                    List<Task> tasksAssigned = EMP_HANDLER.getEmployeeTasks(taskMap, (Integer) entry.getKey());
                    if (!tasksAssigned.isEmpty()) {
                        System.out.printf("Tasks (%d) assigned to employee:\n", tasksAssigned.size());
                        for (Task task : tasksAssigned) {
                            System.out.println(task.toString());
                        }
                    } else {
                        System.out.printf(
                                "No tasks assigned for employee %s (ID:%s).\n",
                                employeeMap.get(entry.getKey()).getName(),
                                entry.getKey());
                    }

                }
            }
        }
    }

    public void outputEmployeeById(
            Map<Integer, Employee> employeeMap,
            Map<Integer, Task> taskMap,
            Integer employeeId) {
        if (VALIDATOR.isIdValid(employeeMap, employeeId)) {
            printLine();
            System.out.printf("Employee found:\n%s: %s\n", employeeId, employeeMap.get(employeeId));
            printLine();
            List<Task> tasksAssigned = EMP_HANDLER.getEmployeeTasks(taskMap, employeeId);
            if (!tasksAssigned.isEmpty()) {
                System.out.printf("Tasks (%d) assigned to employee:\n", tasksAssigned.size());
                for (Task task : tasksAssigned) {
                    System.out.println(task.toString());
                }
            } else {
                System.out.printf(
                        "No tasks assigned for employee %s (ID:%d).\n",
                        employeeMap.get(employeeId).getName(),
                        employeeId);
            }
        }
    }

    public void printEmployeeName(Map<Integer, Employee> employeeMap, Integer employeeId) {
        printLine();
        System.out.printf("Current name: %s\n", employeeMap.get(employeeId).getName());
    }

    public void printEmployeeSalary(Map<Integer, Employee> employeeMap, Integer employeeId) {
        printLine();
        System.out.printf("Current salary: %s\n", employeeMap.get(employeeId).getSalary());
    }

    public void printEmployeePosition(Map<Integer, Employee> employeeMap, Integer employeeId) {
        printLine();
        System.out.printf("Current position: %s\n", employeeMap.get(employeeId).getPosition());
    }

    public void printEmployeeDate(Map<Integer, Employee> employeeMap, Integer employeeId) {
        printLine();
        System.out.printf("Current date of birth: %s\n", employeeMap.get(employeeId).getDateOfBirth());
    }

    public void printEmployeeEmail(Map<Integer, Employee> employeeMap, Integer employeeId) {
        printLine();
        System.out.printf("Current email: %s\n", employeeMap.get(employeeId).getEmail());
    }

    public void printEmployeeMap(Map<Integer, Employee> employeeMap) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
    public void outputTaskById(Map<Integer, Task> taskMap, Integer taskId, Map<Integer, Employee> employeeMap) {
        if (VALIDATOR.isIdValid(taskMap, taskId)) {
            printLine();
            System.out.println(taskMap.get(taskId).toString());
            printTaskStaff(taskMap, employeeMap, taskId);
        }
    }

    public void printTaskName(Map<Integer, Task> taskMap, Integer taskId) {
        printLine();
        System.out.printf("Current name: %s\n", taskMap.get(taskId).getName());
    }

    public void printTaskPriority(Map<Integer, Task> taskMap, Integer taskId) {
        printLine();
        System.out.printf("Current priority: %s\n", taskMap.get(taskId).getPriority());
    }

    public void printTaskIsActive(Map<Integer, Task> taskMap, Integer taskId) {
        printLine();
        System.out.printf("Currently active: %s\n", taskMap.get(taskId).isActive() ? "yes" : "no");
    }

    public void printTaskStaff(Map<Integer, Task> taskMap, Map<Integer, Employee> employeeMap, Integer taskId) {
        printLine();
        List<Employee> employeesEngaged = TASK_HANDLER.getEmployeesEngaged(employeeMap, taskMap, taskId);
        if (!employeesEngaged.isEmpty()) {
            System.out.printf("Employees (%d) engaged in task:\n", employeesEngaged.size());
            for (Employee employee : employeesEngaged) {
                System.out.println(employee.toString());
            }
        } else {
            System.out.printf(
                    "No employees are engaged in task %s (ID:%d).\n",
                    taskMap.get(taskId).getName(),
                    taskId);
        }
    }

    public void printTasksAll(Map<Integer, Task> taskMap) {
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

    public void printTasksActive(Map<Integer, Task> taskMap) {
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
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
