package softserve.academy.graduation;

import java.time.LocalDate;
import java.util.*;

public class Main {
    final static EmployeeHandler EMP_HANDLER = new EmployeeHandler();
    final static TaskHandler TASK_HANDLER = new TaskHandler();
    final static InputReader READER = new InputReader();
    final static InputValidator VALIDATOR = new InputValidator();
    final static ConsolePrinter PRINTER = new ConsolePrinter();

    public static void main(String[] args) {

        Map<Integer, Employee> employees = new LinkedHashMap<>(Map.of(
                1,new Employee(1,"John Doe", 3000, "Senior", LocalDate.of(1988,8,19), "dojo@gmail.com"),
                3,new Employee(3,"Clive Barker", 1000, "Junior", LocalDate.of(2002, 5, 8), "cbark@gmail.com"),
                4,new Employee(4,"Stephen Brown", 1100, "Junior", LocalDate.of(2001, 6, 20), "stbro@gmail.com"),
                2,new Employee(2,"Mike Foo", 2200, "Middle", LocalDate.of(1996, 10, 16), "mikefmike@gmail.com"),
                5,new Employee(5,"Ellen Bar", 1900, "Middle", LocalDate.of(1992, 9, 13), "bar.ellen@gmail.com"),
                7,new Employee(7,"Helga Deere", 3200, "Senior", LocalDate.of(1986, 11, 3), "hedeere@gmail.com"),
                6,new Employee(6,"Frank Best", 3400, "Senior", LocalDate.of(1985,12,20), "bestfbest@gmail.com")
        ));

        Map<Integer, Task> tasks = new LinkedHashMap<>(Map.of(
                1, new Task(1,"Juniors' education", true, 4, new HashSet<>(Set.of(1, 2, 6))),
                2, new Task(2,"Site updates", true, 2, new HashSet<>(Set.of(3, 5, 7))),
                3, new Task(3,"Power plant software engineering", true, 0, new HashSet<>(Set.of(4, 5))),
                4, new Task(4,"Finish unit tests", false, 7, new HashSet<>(Set.of(6, 1, 2))),
                5, new Task(5,"University education management", false, 10, new HashSet<>(Set.of(3, 4, 7))),
                6, new Task(6,"Interview recruits", true, 3, new HashSet<>(Set.of(0)))
        ));

        boolean killSwitch = false;
        int menuLevel;
        PRINTER.printSeparator();

        while (!killSwitch) {
            PRINTER.printMenuString("Main menu");
            System.out.println("""
                    1: Employee section
                    2: Tasks section
                    3: Exit program
                    """);
            int minBound = 1;
            int maxBound = 3;
            int userSelection = READER.getUserSelection(minBound, maxBound);
            PRINTER.printSeparator();
            switch (userSelection) {
                // work with employees
                case 1: {
                    menuLevel = 1;
                    while (menuLevel == 1) {
                        PRINTER.printMenuString("Main menu > Employee");
                        System.out.println("""
                                1: Show current employees
                                2: Add employee
                                3: Remove employee
                                4: Edit employee by ID
                                5: Sort employees
                                6: Get employee info
                                7: Back
                                """
                        );
                        maxBound = 9;
                        userSelection = READER.getUserSelection(minBound, maxBound);
                        PRINTER.printSeparator();
                        switch (userSelection) {
                            // Show current employees
                            case 1: {
                                PRINTER.printMenuString("Main menu > Employee > Show current employees");
                                PRINTER.printEmployees(employees);
                                PRINTER.printSeparator();
                                break;
                            }

                            // Add employee
                            case 2: {
                                PRINTER.printMenuString("Main menu > Employee > Add employee");
                                String newName = READER.readEmployeeName("Enter name: ");
                                int newSalary = READER.readInteger("Enter salary: ");
                                String newPosition = READER.readString("Enter position: ");
                                LocalDate newDateOfBirth = READER.readDate("Enter date of birth (YYYY-MM-DD): ");
                                String newEmail = READER.readEmployeeEmail("Enter email: ");
                                EMP_HANDLER.addEmployee(
                                        employees,
                                        newName,
                                        newSalary,
                                        newPosition,
                                        newDateOfBirth,
                                        newEmail
                                );
                                PRINTER.printSeparator();
                                break;
                            }

                            // Remove employee by ID
                            case 3: {
                                PRINTER.printMenuString("Main menu > Employee > Remove employee");
                                Integer employeeId = READER.readInteger("Enter employee's id: ");
                                EMP_HANDLER.removeEmployeeById(employees, tasks, employeeId);
                                PRINTER.printSeparator();
                                break;
                            }

                            // Edit employee by ID
                            case 4: {
                                PRINTER.printMenuString("Main menu > Employee > Edit employee");
                                int targetId = READER.readInteger("Choose employee's ID from the list above: ");
                                if (VALIDATOR.isIdValid(employees, targetId)) {

                                    PRINTER.printEmployeeName(employees, targetId);
                                    String newName = READER.readEmployeeName("Enter new name: ");

                                    PRINTER.printEmployeeSalary(employees, targetId);
                                    int newSalary = READER.readInteger("Enter new salary: ");

                                    PRINTER.printEmployeePosition(employees, targetId);
                                    String newPosition = READER.readString("Enter new position: ");

                                    PRINTER.printEmployeeDate(employees, targetId);
                                    LocalDate newDateOfBirth = READER.readDate("Enter new date of birth (YYYY-MM-DD): ");

                                    PRINTER.printEmployeeEmail(employees, targetId);
                                    String newEmail = READER.readEmployeeEmail("Enter email: ");
                                    EMP_HANDLER.editEmployee(
                                            employees,
                                            targetId,
                                            newName,
                                            newSalary,
                                            newPosition,
                                            newDateOfBirth,
                                            newEmail
                                    );
                                }
                                PRINTER.printSeparator();
                                break;
                            }

                            // Sort employees submenu
                            case 5: {
                                PRINTER.printMenuString("Main menu > Employee > Sort");
                                menuLevel = 2;
                                while (menuLevel == 2) {
                                    System.out.println("""
                                            1: By ID
                                            2: By name
                                            3: By position
                                            4: Back
                                            """
                                    );
                                    maxBound = 4;
                                    userSelection = READER.getUserSelection(minBound, maxBound);
                                    PRINTER.printSeparator();
                                    switch (userSelection) {
                                        // Sort employees by ID
                                        case 1: {
                                            PRINTER.printMenuString("Main menu > Employee > Sort > By ID");
                                            EMP_HANDLER.sortEmployeesById(employees);
                                            PRINTER.printEmployees(employees);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // Sort employees by name
                                        case 2: {
                                            PRINTER.printMenuString("Main menu > Employee > Sort > By name");
                                            EMP_HANDLER.sortEmployeesByName(employees);
                                            PRINTER.printEmployees(employees);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // Sort employees by position
                                        case 3: {
                                            PRINTER.printMenuString("Main menu > Employee > Sort > By position");
                                            EMP_HANDLER.sortEmployeesByPosition(employees);
                                            PRINTER.printEmployees(employees);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // Back to employee menu
                                        case 4: {
                                            menuLevel = 1;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            // Get employee submenu
                            case 6: {
                                menuLevel = 2;
                                while (menuLevel == 2) {
                                    PRINTER.printMenuString("Main menu > Employee > Get employee");
                                    System.out.println("""
                                        1: By ID
                                        2: By name
                                        3: Back
                                        """);

                                    maxBound = 3;
                                    userSelection = READER.getUserSelection(minBound, maxBound);
                                    PRINTER.printSeparator();
                                    switch (userSelection) {
                                        // Get employee by ID
                                        case 1: {
                                            Integer employeeId = READER.readInteger("Enter employee's id: ");
                                            PRINTER.outputEmployeeById(employees, tasks, employeeId);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // Get employee by name
                                        case 2: {
                                            String employeeName = READER.readString("Enter employee's name: ");
                                            PRINTER.outputEmployeeByName(employees, tasks, employeeName);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // Back to employee menu
                                        case 3: {
                                            menuLevel = 1;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            // Back to main menu
                            case 7: {
                                menuLevel = 0;
                                break;
                            }
                        }
                    }
                    break;
                }

                // work with tasks
                case 2: {
                    menuLevel = 1;
                    while (menuLevel == 1) {
                        PRINTER.printMenuString("Main menu > Tasks");
                        System.out.println("""
                                1: Show active tasks only
                                2: Show full task list
                                3: Show task details
                                4: Add task
                                5: Remove task
                                6: Sort tasks
                                7: Edit task by ID
                                8: Back
                                """
                        );
                        maxBound = 8;
                        userSelection = READER.getUserSelection(minBound, maxBound);
                        PRINTER.printSeparator();
                        switch (userSelection) {
                            // show active tasks only
                            case 1: {
                                PRINTER.printMenuString("Main menu > Task > Show active tasks");
                                PRINTER.printTasksActive(tasks);
                                PRINTER.printSeparator();
                                break;
                            }

                            // show full task list
                            case 2: {
                                PRINTER.printMenuString("Main menu > Task > Show all tasks");
                                PRINTER.printTasksAll(tasks);
                                PRINTER.printSeparator();
                                break;
                            }

                            // show task details by ID
                            case 3: {
                                PRINTER.printMenuString("Main menu > Task > Tasks details");
                                Integer taskId = READER.readInteger("Enter task id: ");
                                PRINTER.outputTaskById(tasks, taskId, employees);
                                PRINTER.printSeparator();
                                break;
                            }

                            // add task
                            case 4: {
                                PRINTER.printMenuString("Main menu > Task > Add task");
                                String newName = READER.readString("Enter name: ");
                                int newPriority = READER.readInteger("Enter priority (0 for critical): ");
                                boolean newStatus = READER.readBoolean("Is task active (yes/no): ");
                                String newStaff = READER.readStaffString(
                                        employees,
                                        "Enter employees' IDs involved in task separated by coma (i.e. 1, 2, 3):\n" +
                                                "(type 0 to leave field empty and fill it later): ");
                                TASK_HANDLER.addTask(
                                        tasks,
                                        newName,
                                        newStatus,
                                        newPriority,
                                        newStaff
                                );
                                PRINTER.printSeparator();
                                break;
                            }

                            // remove task
                            case 5: {
                                PRINTER.printMenuString("Main menu > Task > Remove task");
                                Integer taskId = READER.readInteger("Enter task ID: ");
                                TASK_HANDLER.removeTaskById(tasks, taskId);
                                PRINTER.printSeparator();
                                break;
                            }

                            // sort tasks submenu
                            case 6: {
                                menuLevel = 2;
                                while (menuLevel == 2) {
                                    PRINTER.printMenuString("Main menu > Tasks > Sort");
                                    System.out.println("""
                                            1: By ID
                                            2: By priority
                                            3: Back
                                            """
                                    );
                                    maxBound = 3;
                                    userSelection = READER.getUserSelection(minBound, maxBound);
                                    PRINTER.printSeparator();

                                    switch (userSelection) {
                                        // sort tasks by ID
                                        case 1: {
                                            PRINTER.printMenuString("Main menu > Tasks > Sort > By ID");
                                            TASK_HANDLER.sortTasksById(tasks);
                                            PRINTER.printTasksAll(tasks);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // sort tasks by priority
                                        case 2: {
                                            PRINTER.printMenuString("Main menu > Tasks > Sort > By priority");
                                            TASK_HANDLER.sortTasksByPriority(tasks);
                                            PRINTER.printTasksAll(tasks);
                                            PRINTER.printSeparator();
                                            break;
                                        }

                                        // back
                                        case 3: {
                                            menuLevel = 1;
                                            PRINTER.printSeparator();
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            // edit task by ID
                            case 7: {
                                PRINTER.printMenuString("Main menu > Task > Edit task");
                                int targetId = READER.readInteger("Enter task ID: ");
                                if (VALIDATOR.isIdValid(tasks, targetId)) {

                                    PRINTER.printTaskName(tasks, targetId);
                                    String newName = READER.readString("Enter new name: ");

                                    PRINTER.printTaskPriority(tasks, targetId);
                                    int newPriority = READER.readInteger("Enter new priority (0 for critical): ");

                                    PRINTER.printTaskIsActive(tasks, targetId);
                                    boolean newStatus = READER.readBoolean("Is task active (yes/no): ");

                                    PRINTER.printTaskStaff(tasks, employees, targetId);
                                    String newStaff = READER.readStaffString(
                                            employees,
                                            "Enter employees' IDs involved in task (separated by space):\n" +
                                                    "(type 0 to leave field empty and fill later): ");
                                    TASK_HANDLER.editTask(
                                            tasks,
                                            targetId,
                                            newName,
                                            newStatus,
                                            newPriority,
                                            newStaff
                                    );
                                }
                                PRINTER.printSeparator();
                                break;
                            }

                            // back
                            case 8: {
                                menuLevel = 0;
                                break;
                            }
                        }
                    }
                    break;
                }

                // exit program
                case 3: {
                    System.out.println("Goodbye!");
                    killSwitch = true;
                    PRINTER.printSeparator();
                    break;
                }
            }
        }
    }
}