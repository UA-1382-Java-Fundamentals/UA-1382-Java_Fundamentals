package softserve.academy.graduation;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {
    static final Scanner SCANNER = new Scanner(System.in);
    static final GregorianCalendar GC = new GregorianCalendar();
    Pattern namePattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
    Pattern emailPattern = Pattern.compile("\\w+@\\w+\\.[A-z]{2,}");
    Pattern datePattern = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}");

    // ===================================================================
    // Employee handling
    // ===================================================================

    public void addEmployee(
            Map<Integer, Employee> employeeMap,
            String newName,
            int newSalary,
            String newPosition,
            HashMap<String, Integer> newDateOfBirth,
            String newEmail) {
        Set<Integer> idSet = employeeMap.keySet();
        Integer newId = Collections.max(idSet) + 1;
        printLine();
        if (isEmailUnique(employeeMap, newEmail)) {
            employeeMap.put(
                    newId,
                    new Employee(
                            newName,
                            newSalary,
                            newPosition,
                            newDateOfBirth.get("year"),
                            newDateOfBirth.get("month"),
                            newDateOfBirth.get("day"),
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
            HashMap<String, Integer> newDateOfBirth,
            String newEmail) {

        printLine();

        // a little workaround to avoid self-comparing of current email and new one if they are the same;
        String oldEmail = employeeMap.get(targetId).getEmail();
        employeeMap.get(targetId).setEmail("");

        if (isEmailUnique(employeeMap, newEmail)) {
            Employee employee = employeeMap.get(targetId);
            employee.setName(newName);
            employee.setSalary(newSalary);
            employee.setPosition(newPosition);
            employee.setDateOfBirth(
                    newDateOfBirth.get("year"),
                    newDateOfBirth.get("month"),
                    newDateOfBirth.get("day")
            );
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
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<>(employeeMap.entrySet());
//        employeeList.sort((e1, e2) -> e1.getValue().getName().compareTo(e2.getValue().getName()));
        employeeList.sort(Comparator.comparing(e -> e.getValue().getName()));
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
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
            Iterator iterator = employeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (employeeName.equalsIgnoreCase(((Employee) entry.getValue()).getName())) {
                    printLine();
                    System.out.printf("Employee found:\n%s: %s\n", entry.getKey(), entry.getValue());
                    printLine();
                    List<Task> tasksAssigned = getTasksAssigned(taskMap, (Integer) entry.getKey());
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
        if (isIdValid(employeeMap, employeeId)) {
            printLine();
            System.out.printf("Employee found:\n%s: %s\n", employeeId, employeeMap.get(employeeId));
            printLine();
            List<Task> tasksAssigned = getTasksAssigned(taskMap, employeeId);
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

    private List<Task> getTasksAssigned(Map<Integer, Task> taskMap, Integer employeeId) {
        List<Task> tasksAssigned = new ArrayList<>();
        for (Task task : taskMap.values()) {
            if (task.getStaff().contains(employeeId)) {
                tasksAssigned.add(task);
            }
        }
        return tasksAssigned;
    }

    private List<Employee> getEmployeesEngaged(Map<Integer, Employee> employeeMap, Map<Integer, Task> taskMap, Integer taskId) {
        Set<Integer> engagedIds = taskMap.get(taskId).getStaff();
        List<Employee> employeesEngaged = new ArrayList<>();
        for (Integer staffId : engagedIds) {
            if (taskMap.get(taskId).getStaff().contains(staffId)) {
                employeesEngaged.add(employeeMap.get(staffId));
            }
        }
        return employeesEngaged;
    }

    public void printEmployeeMap(Map<Integer, Employee> employeeMap) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

    public void removeEmployeeById(Map<Integer, Employee> employeeMap, Map<Integer, Task> taskMap, int employeeId) {
        if (isIdValid(employeeMap, employeeId)) {
            employeeMap.remove(employeeId);
            System.out.printf("Employee (%d) removed.\n", employeeId);
            for (Task task : taskMap.values()) {
                task.getStaff().remove(employeeId);
            }
        }
    }

    public String readEmployeeName(String prompt) {
        while (true) {
            try {
                String name = readUserInput(prompt);
                checkValidName(name);
                return name;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String readEmployeeEmail(String prompt) {
        while (true) {
            try {
                String email = readUserInput(prompt);
                checkValidEmail(email);
                return email;
            } catch (Exception e) {
                System.out.println(e.getMessage());
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

    // ===================================================================
    // General methods
    // ===================================================================

    private void checkValidName(String name) {
        Matcher matcher = namePattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid first and last name!");
        }
    }

    private void checkValidEmail(String name) {
        Matcher matcher = emailPattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid email address!");
        }
    }

    private void checkValidDate(String dateString) {
        Matcher matcher = datePattern.matcher(dateString);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid date!");
        }
    }

    private boolean isEmailUnique(Map<Integer, Employee> employeeMap, String email) {
        Collection<Employee> employeeSet = employeeMap.values();
        for (Employee employee : employeeSet) {
            if (employee.hashCode() == email.hashCode()) {
                System.out.println("Entered email is already in use! Try another one.");
                return false;
            }
        }
        return true;
    }

    public int getUserSelection(int minBound, int maxBound) {
        int userSelection = readInteger("Enter your selection: ");
        while (userSelection > maxBound || userSelection < minBound) {
            System.out.println("Value out of range, try again.");
            userSelection = readInteger("Enter your selection: ");
        }
        return userSelection;
    }

    public void printMenuString(String message) {
        System.out.println(message);
        printLine();
    }

    public void printSeparator() {
        System.out.println("===".repeat(15));
    }

    public void printLine() {
        System.out.println("---".repeat(15));
    }

    public boolean isIdValid(Map map, int targetId) {
        if (!map.containsKey(targetId)) {
            System.out.println("Entity does not exist");
            return false;
        }
        return true;
    }

    public HashMap<String, Integer> readDate(String prompt) {
        while (true) {
            try {
                String dateString = readString(prompt);
                checkValidDate(dateString);
                int[] dateValues = parseDate(dateString);
                checkDateRange(dateValues[0], dateValues[1], dateValues[2]);
                return new HashMap<>(Map.of(
                        "year", dateValues[0],
                        "month", dateValues[1],
                        "day", dateValues[2]
                ));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String readString(String prompt) {
        while (true) {
            try {
                return readUserInput(prompt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int[] parseDate(String dateString) {
        String[] dateParts = dateString.split("-");
        int[] dateValues = new int[3];
        for (int i = 0; i < dateParts.length; i++) {
            dateValues[i] = parseInt(dateParts[i]);
        }
        return dateValues;
    }

    private Integer parseInt(String input) {
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid input! Enter an integer!");
            }
        }
    }

    private void checkDateRange(int year, int month, int day) {
        if (year <= (LocalDate.now().getYear() - 100) || year >= LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Invalid year!");
        } else if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        } else if (day > Month.of(month).length(GC.isLeapYear(year))) {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public Integer readInteger(String prompt) {
        while (true) {
            try {
                String stringNumber = readUserInput(prompt);
                return parseInt(stringNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String readUserInput(String message) {
        System.out.print(message);
        String out = SCANNER.nextLine();
        if (out.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty!");
        }
        return out;
    }

    // ===================================================================
    // Task handling
    // ===================================================================

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

    private boolean parseTaskStatusString(String statusString) {
        Pattern pattern = Pattern.compile("yes|no", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(statusString);
        if (matcher.find()) {
            return matcher.group(0).equalsIgnoreCase("yes");
        } else {
            throw new IllegalArgumentException("Please enter either YES or NO");
        }
    }

    public boolean readBoolean(String prompt) {
        while (true) {
            try {
                String stringStatus = readUserInput(prompt);
                return parseTaskStatusString(stringStatus);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String readStaffString(Map<Integer, Employee> employeeMap, String prompt) {
        Pattern pattern = Pattern.compile("[^[\\d|\\s]]");
        while (true) {
            try {
                String stringStaff = readUserInput(prompt);
                if (!stringStaff.equalsIgnoreCase("0")) {
                    Matcher matcher = pattern.matcher(stringStaff);
                    if (matcher.find()) {
                        throw new IllegalArgumentException("Incorrect input format!");
                    }
                    HashSet<Integer> staffSet = parseStaffString(stringStaff);
                    for (Integer id : staffSet) {
                        if (!isEmployeePresent(employeeMap, id)) {
                            throw new IllegalArgumentException("Incorrect employee id found!");
                        }
                    }
                }
                return stringStaff;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void addTask(Map<Integer, Task> taskMap,
                        String newName,
                        boolean newStatus,
                        int newPriority,
                        String newStaff) {
        Set<Integer> idSet = taskMap.keySet();
        Integer newId = Collections.max(idSet) + 1;
        taskMap.put(
                newId,
                new Task(
                        newName,
                        newStatus,
                        newPriority,
                        newStaff
                )
        );
        System.out.printf("Task \"%s\" (ID:%d) added successfully!\n", newName, newId);
    }

    protected HashSet<Integer> parseStaffString(String staffString) {
        HashSet<Integer> staffSet = new HashSet<>();
        if (!staffString.equals("0")) {
            String[] staffElements = staffString.split("\\s+");
            for (String staffElement : staffElements) {
                staffSet.add(Integer.parseInt(staffElement));
            }
        }
        return staffSet;
    }

    private boolean isEmployeePresent(Map<Integer, Employee> employeeMap, Integer employeeId) {
        return employeeMap.containsKey(employeeId);
    }

    public void removeTaskById(Map<Integer, Task> taskMap, int taskId) {
        if (isIdValid(taskMap, taskId)) {
            taskMap.remove(taskId);
            System.out.printf("Task (%d) removed.\n", taskId);
        }
    }

    public void sortTasksById(Map<Integer, Task> taskMap) {
        List<Map.Entry<Integer, Task>> taskList = new ArrayList<>(taskMap.entrySet());
        taskList.sort(Comparator.comparingInt(Map.Entry::getKey));
        taskMap.clear();
        for (Map.Entry<Integer, Task> entry : taskList) {
            taskMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortTasksByPriority(Map<Integer, Task> taskMap) {
        List<Map.Entry<Integer, Task>> taskList = new ArrayList<>(taskMap.entrySet());
        taskList.sort(Comparator.comparingInt(t -> t.getValue().getPriority()));
        taskMap.clear();
        for (Map.Entry<Integer, Task> entry : taskList) {
            taskMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void editTask(
            Map<Integer, Task> taskMap,
            Integer targetId,
            String newName,
            boolean newStatus,
            int newPriority,
            String newStaff) {
        Task task = taskMap.get(targetId);
        task.setName(newName);
        task.setActive(newStatus);
        task.setPriority(newPriority);
        task.setStaff(newStaff);
    }

    public void outputTaskById(Map<Integer, Task> taskMap, Integer taskId, Map<Integer, Employee> employeeMap) {
        if (isIdValid(taskMap, taskId)) {
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
        List<Employee> employeesEngaged = getEmployeesEngaged(employeeMap, taskMap, taskId);
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

}