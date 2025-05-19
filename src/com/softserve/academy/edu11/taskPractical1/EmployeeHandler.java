package softserve.academy.edu11.taskPractical1;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHandler {
    static final Scanner SCANNER = new Scanner(System.in);

    public Integer readEmployeeId() {
        while (true) {
            try {
                String stringId = readUserInput("Enter employee id: ");
                return parseInt(stringId);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String readEmployeeName() {
        while (true) {
            try {
                return readUserInput("Enter employee name: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void outputEmployeeByName(Map<Integer, String> employeeMap, String employeeName) {
        if (!employeeMap.containsValue(employeeName)) {
            System.out.println(employeeName + " not found!");
        } else {
            Iterator iterator = employeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (employeeName.equals(entry.getValue())) {
                    System.out.println(employeeName + " has ID: " + entry.getKey());
                }
            }
        }
    }

    public void outputEmlpoyeeById(Map<Integer, String> employeeMap, Integer employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            System.out.println("Employee does not exist");
        } else {
            System.out.println("Employee found: " + employeeMap.get(employeeId));
        }
    }

    private static Integer parseInt(String input) {
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid input! Enter an integer!");
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

    public void printEmployeeMap(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
