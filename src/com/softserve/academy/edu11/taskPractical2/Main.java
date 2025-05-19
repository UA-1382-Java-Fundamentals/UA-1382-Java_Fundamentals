package softserve.academy.edu11.taskPractical2;

//1. In the main() method, initialize a map named employeeMap consisting of pairs
//<Integer, String>.
//• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the
//contents of the map on the screen.
//• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and
//display it. If the ID is not found in the map, notify the user using the containsKey()
//function.
//• Prompt the user to enter a name. Verify that the name exists in the employeeMap and
//display the corresponding ID. If the name is not found in the map, notify the user using
//the containsValue() function.

//2** If desired, you can make the previous task more challenging by selecting one or more of the
//following options:
//• Before adding ID-name pairs to the map, it is recommended to perform a check for
//duplicate values. If duplicates are found, the user should be notified and the addition of data
//to the map should be halted.
//• In order to provide a more comprehensive record, the user should be prompted to input
//additional information, such as position, salary, and date of birth, in addition to the ID and
//name. This information should then be displayed on the screen when the map is output.
//• To enable the editing of existing data, such as name, position, and salary, the user should be
//prompted to input the ID of the record they wish to modify, as well as the updated data. The
//updated map should then be displayed.
//• For improved usability, the map should be sortable by various criteria, such as ID, name, and
//position. The user should be prompted to enter the desired sorting criterion, and the sorted
//map should then be displayed on the screen.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    final static EmployeeHandler EH = new EmployeeHandler();

    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new LinkedHashMap<>(Map.of(
                1, new Employee("John Doe", 3000, "Senior", 1988, 8, 19),
                3, new Employee("Clive Barker", 1000, "Junior", 2002, 5, 8),
                4, new Employee("Stephen Brown", 1100, "Junior", 2001, 6, 20),
                2, new Employee("Mike Foo", 2200, "Middle", 1996, 10, 16),
                5, new Employee("Ellen Bar", 1900, "Middle", 1992, 9, 13),
                7, new Employee("Helga Deere", 3200, "Senior", 1986, 11, 3),
                6, new Employee("Frank Best", 3400, "Senior", 1985, 12, 20)
        ));

        System.out.println("Initial employees:");
        EH.printEmployeeMap(employeeMap);
        System.out.println("===".repeat(15));

        boolean killSwitch = false;
        while (!killSwitch) {
            System.out.println("""
                    Enter your option:
                    1 - add employee
                    2 - show current employees
                    3 - select and edit employee's data
                    4 - sort list by ID
                    5 - sort list by name
                    6 - sort list by position
                    7 - get employee by ID
                    8 - get employee by name
                    9 - exit program
                    """
            );
            int minBound = 1;
            int maxBound = 9;
            int userSelection = EH.readInteger("Enter your selection: ");
            while (userSelection > maxBound || userSelection < minBound) {
                System.out.println("Value out of range, try again.");
                userSelection = EH.readInteger("Enter your selection: ");
            }
            switch (userSelection) {
                case 1: {
                    // Add employee
                    String newName = EH.readString("Enter name: ");
                    int newSalary = EH.readInteger("Enter salary: ");
                    String newPosition = EH.readString("Enter position: ");
                    HashMap<String, Integer> newDateOfBirth = EH.readDate("Enter date of birth (YYYY-MM-DD): ");
                    EH.addEmployee(
                            employeeMap,
                            newName,
                            newSalary,
                            newPosition,
                            newDateOfBirth
                    );
                    System.out.println("===".repeat(15));
                    break;
                }
                case 2: {
                    // Show current employees
                    EH.printEmployeeMap(employeeMap);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 3: {
                    // Select and edit employee's data
                    int targetId = EH.readInteger("Choose employee's ID from the list above: ");
                    if (EH.isIdValid(employeeMap, targetId)) {
                        String newName = EH.readString("Enter new name: ");
                        int newSalary = EH.readInteger("Enter new salary: ");
                        String newPosition = EH.readString("Enter new position: ");
                        HashMap<String, Integer> newDateOfBirth = EH.readDate(
                                "Enter new date of birth (YYYY-MM-DD): ");
                        EH.editEmployee(employeeMap, targetId, newName, newSalary, newPosition, newDateOfBirth);
                    }
                    System.out.println("===".repeat(15));
                    break;
                }
                case 4: {
                    // Sort map by ID
                    EH.sortById(employeeMap);
                    EH.printEmployeeMap(employeeMap);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 5: {
                    // Sort map by name
                    EH.sortByName(employeeMap);
                    EH.printEmployeeMap(employeeMap);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 6: {
                    // Sort map by position
                    EH.sortByPosition(employeeMap);
                    EH.printEmployeeMap(employeeMap);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 7: {
                    // Get employee by ID
                    Integer employeeId = EH.readInteger("Enter employee's id: ");
                    EH.outputEmployeeById(employeeMap, employeeId);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 8: {
                    // Get employee by name
                    String employeeName = EH.readString("Enter employee's name: ");
                    EH.outputIdByName(employeeMap, employeeName);
                    System.out.println("===".repeat(15));
                    break;
                }
                case 9: {
                    System.out.println("Goodbye!");
                    killSwitch = true;
                    System.out.println("===".repeat(15));
                    break;
                }
            }
        }
    }
}
