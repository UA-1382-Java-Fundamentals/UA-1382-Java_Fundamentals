package softserve.academy.edu11.taskPractical2;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EmployeeHandler {
    static final Scanner SCANNER = new Scanner(System.in);
    static final GregorianCalendar GC = new GregorianCalendar();

    public HashMap<String, Integer> readDate(String prompt) {
        while (true) {
            try {
                String dateString = readString(prompt);
                int[] dateValues = parseDate(dateString);
                checkValidDate(dateValues[0], dateValues[1], dateValues[2]);
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

    private void checkValidDate(int year, int month, int day) {
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

    public void addEmployee(
            Map<Integer, Employee> employeeMap,
            String newName,
            int newSalary,
            String newPosition,
            HashMap<String, Integer> newDateOfBirth) {
        Set<Integer> idSet = employeeMap.keySet();
        Integer newId = Collections.max(idSet) + 1;
        employeeMap.put(
                newId,
                new Employee(
                        newName,
                        newSalary,
                        newPosition,
                        newDateOfBirth.get("year"),
                        newDateOfBirth.get("month"),
                        newDateOfBirth.get("day")
                )
        );
    }

    public void editEmployee(
            Map<Integer, Employee> employeeMap,
            Integer targetId,
            String newName,
            int newSalary,
            String newPosition,
            HashMap<String, Integer> newDateOfBirth) {

        Employee employee = employeeMap.get(targetId);
        employee.setName(newName);
        employee.setSalary(newSalary);
        employee.setPosition(newPosition);
        employee.setDateOfBirth(
                newDateOfBirth.get("year"),
                newDateOfBirth.get("month"),
                newDateOfBirth.get("day")
        );

        employeeMap.put(targetId, employee);
    }

    public void sortByName(Map<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<Map.Entry<Integer, Employee>>(employeeMap.entrySet());
        Collections.sort(employeeList, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                return e1.getValue().getName().compareTo(e2.getValue().getName());
            }
        });
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortByPosition(Map<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<Map.Entry<Integer, Employee>>(employeeMap.entrySet());
        Collections.sort(employeeList, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                int result = e1.getValue().getPosition().compareTo(e2.getValue().getPosition());
                if (result == 0) {
                    result = Integer.compare(e1.getValue().getSalary(), e2.getValue().getSalary());
                }
                return result;
            }
        });
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortById(Map<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> employeeList = new ArrayList<Map.Entry<Integer, Employee>>(employeeMap.entrySet());
        Collections.sort(employeeList, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                return Integer.compare(e1.getKey(), e2.getKey());
            }
        });
        employeeMap.clear();
        for (Map.Entry<Integer, Employee> entry : employeeList) {
            employeeMap.put(entry.getKey(), entry.getValue());
        }
    }

    public boolean isIdValid(Map<Integer, Employee> employeeMap, int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            System.out.println("Employee does not exist");
            return false;
        }
        return true;
    }

    public void outputIdByName(Map<Integer, Employee> employeeMap, String employeeName) {
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
                    System.out.printf("Employee found:\n%s: %s\n", entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void outputEmlpoyeeById(Map<Integer, Employee> employeeMap, Integer employeeId) {
        if (isIdValid(employeeMap, employeeId)) {
            System.out.println("Employee found: " + employeeMap.get(employeeId));
        }
    }

    public void printEmployeeMap(Map<Integer, Employee> employeeMap) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

}
