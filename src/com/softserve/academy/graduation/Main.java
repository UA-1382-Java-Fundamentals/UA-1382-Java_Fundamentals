package softserve.academy.graduation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    final static Handler HANDLER = new Handler();

    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new LinkedHashMap<>(Map.of(
                1, new Employee("John Doe", 3000, "Senior", 1988, 8, 19, "dojo@gmail.com"),
                3, new Employee("Clive Barker", 1000, "Junior", 2002, 5, 8, "cbark@gmail.com"),
                4, new Employee("Stephen Brown", 1100, "Junior", 2001, 6, 20, "stbro@gmail.com"),
                2, new Employee("Mike Foo", 2200, "Middle", 1996, 10, 16, "mikefmike@gmail.com"),
                5, new Employee("Ellen Bar", 1900, "Middle", 1992, 9, 13, "bar.ellen@gmail.com"),
                7, new Employee("Helga Deere", 3200, "Senior", 1986, 11, 3, "hedeere@gmail.com"),
                6, new Employee("Frank Best", 3400, "Senior", 1985, 12, 20, "bestfbest@gmail.com")
        ));

        Map<Integer, Task> taskMap = new LinkedHashMap<>(Map.of(
                1, new Task("Juniors' education", true, 4, "1 2 6"),
                2, new Task("Site updates", true, 2, "3 5 7"),
                3, new Task("Power plant software engineering", true, 0, "4 5"),
                4, new Task("Finish unit tests", false, 7, "6 1 2"),
                5, new Task("University education management", false, 10, "3 4 7"),
                6, new Task("Interview recruits", true, 3, "0")
        ));

        boolean killSwitch = false;
        int menuLevel;
        HANDLER.printSeparator();

        while (!killSwitch) {
            HANDLER.printMenuString("Main menu");
            System.out.println("""
                    1: Employee section
                    2: Tasks section
                    3: Exit program
                    """);
            int minBound = 1;
            int maxBound = 3;
            int userSelection = HANDLER.getUserSelection(minBound, maxBound);
            HANDLER.printSeparator();
            switch (userSelection) {
                // work with employees
                case 1: {
                    menuLevel = 1;
                    while (menuLevel == 1) {
                        HANDLER.printMenuString("Main menu > Employee");
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
                        userSelection = HANDLER.getUserSelection(minBound, maxBound);
                        HANDLER.printSeparator();
                        switch (userSelection) {
                            // Show current employees
                            case 1: {
                                HANDLER.printMenuString("Main menu > Employee > Show current employees");
                                HANDLER.printEmployeeMap(employeeMap);
                                HANDLER.printSeparator();
                                break;
                            }

                            // Add employee
                            case 2: {
                                HANDLER.printMenuString("Main menu > Employee > Add employee");
                                String newName = HANDLER.readEmployeeName("Enter name: ");
                                int newSalary = HANDLER.readInteger("Enter salary: ");
                                String newPosition = HANDLER.readString("Enter position: ");
                                HashMap<String, Integer> newDateOfBirth = HANDLER.readDate("Enter date of birth (YYYY-MM-DD): ");
                                String newEmail = HANDLER.readEmployeeEmail("Enter email: ");
                                HANDLER.addEmployee(
                                        employeeMap,
                                        newName,
                                        newSalary,
                                        newPosition,
                                        newDateOfBirth,
                                        newEmail
                                );
                                HANDLER.printSeparator();
                                break;
                            }

                            // Remove employee by ID
                            case 3: {
                                HANDLER.printMenuString("Main menu > Employee > Remove employee");
                                Integer employeeId = HANDLER.readInteger("Enter employee's id: ");
                                HANDLER.removeEmployeeById(employeeMap, taskMap, employeeId);
                                HANDLER.printSeparator();
                                break;
                            }

                            // Edit employee by ID
                            case 4: {
                                HANDLER.printMenuString("Main menu > Employee > Edit employee");
                                int targetId = HANDLER.readInteger("Choose employee's ID from the list above: ");
                                if (HANDLER.isIdValid(employeeMap, targetId)) {

                                    HANDLER.printEmployeeName(employeeMap, targetId);
                                    String newName = HANDLER.readEmployeeName("Enter new name: ");

                                    HANDLER.printEmployeeSalary(employeeMap, targetId);
                                    int newSalary = HANDLER.readInteger("Enter new salary: ");

                                    HANDLER.printEmployeePosition(employeeMap, targetId);
                                    String newPosition = HANDLER.readString("Enter new position: ");

                                    HANDLER.printEmployeeDate(employeeMap, targetId);
                                    HashMap<String, Integer> newDateOfBirth = HANDLER.readDate(
                                            "Enter new date of birth (YYYY-MM-DD): ");

                                    HANDLER.printEmployeeEmail(employeeMap, targetId);
                                    String newEmail = HANDLER.readEmployeeEmail("Enter email: ");
                                    HANDLER.editEmployee(
                                            employeeMap,
                                            targetId,
                                            newName,
                                            newSalary,
                                            newPosition,
                                            newDateOfBirth,
                                            newEmail
                                    );
                                }
                                HANDLER.printSeparator();
                                break;
                            }

                            // Sort employees submenu
                            case 5: {
                                HANDLER.printMenuString("Main menu > Employee > Sort");
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
                                    userSelection = HANDLER.getUserSelection(minBound, maxBound);
                                    HANDLER.printSeparator();
                                    switch (userSelection) {
                                        // Sort employees by ID
                                        case 1: {
                                            HANDLER.printMenuString("Main menu > Employee > Sort > By ID");
                                            HANDLER.sortEmployeesById(employeeMap);
                                            HANDLER.printEmployeeMap(employeeMap);
                                            HANDLER.printSeparator();
                                            break;
                                        }

                                        // Sort employees by name
                                        case 2: {
                                            HANDLER.printMenuString("Main menu > Employee > Sort > By name");
                                            HANDLER.sortEmployeesByName(employeeMap);
                                            HANDLER.printEmployeeMap(employeeMap);
                                            HANDLER.printSeparator();
                                            break;
                                        }

                                        // Sort employees by position
                                        case 3: {
                                            HANDLER.printMenuString("Main menu > Employee > Sort > By position");
                                            HANDLER.sortEmployeesByPosition(employeeMap);
                                            HANDLER.printEmployeeMap(employeeMap);
                                            HANDLER.printSeparator();
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
                                    HANDLER.printMenuString("Main menu > Employee > Get employee");
                                    System.out.println("""
                                        1: By ID
                                        2: By name
                                        3: Back
                                        """);

                                    maxBound = 3;
                                    userSelection = HANDLER.getUserSelection(minBound, maxBound);
                                    HANDLER.printSeparator();
                                    switch (userSelection) {
                                        // Get employee by ID
                                        case 1: {
                                            Integer employeeId = HANDLER.readInteger("Enter employee's id: ");
                                            HANDLER.outputEmployeeById(employeeMap, taskMap, employeeId);
                                            HANDLER.printSeparator();
                                            break;
                                        }

                                        // Get employee by name
                                        case 2: {
                                            String employeeName = HANDLER.readString("Enter employee's name: ");
                                            HANDLER.outputEmployeeByName(employeeMap, taskMap, employeeName);
                                            HANDLER.printSeparator();
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
                        HANDLER.printMenuString("Main menu > Tasks");
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
                        userSelection = HANDLER.getUserSelection(minBound, maxBound);
                        HANDLER.printSeparator();
                        switch (userSelection) {
                            // show active tasks only
                            case 1: {
                                HANDLER.printMenuString("Main menu > Task > Show active tasks");
                                HANDLER.printTasksActive(taskMap);
                                HANDLER.printSeparator();
                                break;
                            }

                            // show full task list
                            case 2: {
                                HANDLER.printMenuString("Main menu > Task > Show all tasks");
                                HANDLER.printTasksAll(taskMap);
                                HANDLER.printSeparator();
                                break;
                            }

                            // show task details by ID
                            case 3: {
                                HANDLER.printMenuString("Main menu > Task > Tasks details");
                                Integer taskId = HANDLER.readInteger("Enter task id: ");
                                HANDLER.outputTaskById(taskMap, taskId, employeeMap);
                                HANDLER.printSeparator();
                                break;
                            }

                            // add task
                            case 4: {
                                HANDLER.printMenuString("Main menu > Task > Add task");
                                String newName = HANDLER.readString("Enter name: ");
                                int newPriority = HANDLER.readInteger("Enter priority (0 for critical): ");
                                boolean newStatus = HANDLER.readBoolean("Is task active (yes/no): ");
                                String newStaff = HANDLER.readStaffString(
                                        employeeMap,
                                        "Enter employees' IDs involved in task (separated by space):\n" +
                                                "(type 0 to leave field empty and fill later): ");
                                HANDLER.addTask(
                                        taskMap,
                                        newName,
                                        newStatus,
                                        newPriority,
                                        newStaff
                                );
                                HANDLER.printSeparator();
                                break;
                            }

                            // remove task
                            case 5: {
                                HANDLER.printMenuString("Main menu > Task > Remove task");
                                Integer taskId = HANDLER.readInteger("Enter task ID: ");
                                HANDLER.removeTaskById(taskMap, taskId);
                                HANDLER.printSeparator();
                                break;
                            }

                            // sort tasks submenu
                            case 6: {
                                menuLevel = 2;
                                while (menuLevel == 2) {
                                    HANDLER.printMenuString("Main menu > Tasks > Sort");
                                    System.out.println("""
                                            1: By ID
                                            2: By priority
                                            3: Back
                                            """
                                    );
                                    maxBound = 3;
                                    userSelection = HANDLER.getUserSelection(minBound, maxBound);
                                    HANDLER.printSeparator();

                                    switch (userSelection) {
                                        // sort tasks by ID
                                        case 1: {
                                            HANDLER.printMenuString("Main menu > Tasks > Sort > By ID");
                                            HANDLER.sortTasksById(taskMap);
                                            HANDLER.printTasksAll(taskMap);
                                            HANDLER.printSeparator();
                                            break;
                                        }

                                        // sort tasks by priority
                                        case 2: {
                                            HANDLER.printMenuString("Main menu > Tasks > Sort > By priority");
                                            HANDLER.sortTasksByPriority(taskMap);
                                            HANDLER.printTasksAll(taskMap);
                                            HANDLER.printSeparator();
                                            break;
                                        }

                                        // back
                                        case 3: {
                                            menuLevel = 1;
                                            HANDLER.printSeparator();
                                            break;
                                        }
                                    }
                                }
                                break;
                            }

                            // edit task by ID
                            case 7: {
                                HANDLER.printMenuString("Main menu > Task > Edit task");
                                int targetId = HANDLER.readInteger("Enter task ID: ");
                                if (HANDLER.isIdValid(taskMap, targetId)) {

                                    HANDLER.printTaskName(taskMap, targetId);
                                    String newName = HANDLER.readString("Enter new name: ");

                                    HANDLER.printTaskPriority(taskMap, targetId);
                                    int newPriority = HANDLER.readInteger("Enter new priority (0 for critical): ");

                                    HANDLER.printTaskIsActive(taskMap, targetId);
                                    boolean newStatus = HANDLER.readBoolean("Is task active (yes/no): ");

                                    HANDLER.printTaskStaff(taskMap, employeeMap, targetId);
                                    String newStaff = HANDLER.readStaffString(
                                            employeeMap,
                                            "Enter employees' IDs involved in task (separated by space):\n" +
                                                    "(type 0 to leave field empty and fill later): ");
                                    HANDLER.editTask(
                                            taskMap,
                                            targetId,
                                            newName,
                                            newStatus,
                                            newPriority,
                                            newStaff
                                    );
                                }
                                HANDLER.printSeparator();
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
                    HANDLER.printSeparator();
                    break;
                }
            }
        }
    }
}