package softserve.academy.graduation;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    static final GregorianCalendar GC = new GregorianCalendar();
    Pattern namePattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
    Pattern emailPattern = Pattern.compile("\\w+@\\w+\\.[A-z]{2,}");
    Pattern datePattern = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}");

    public boolean isEmployeePresent(Map<Integer, Employee> employeeMap, Integer employeeId) {
        return employeeMap.containsKey(employeeId);
    }

    public void checkValidName(String name) {
        Matcher matcher = namePattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid first and last name!");
        }
    }

    public void checkValidEmail(String name) {
        Matcher matcher = emailPattern.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid email address!");
        }
    }

    public void checkDateFormat(String dateString) {
        Matcher matcher = datePattern.matcher(dateString);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Please enter a valid date!");
        }
    }

    public void checkDateValues(int year, int month, int day) {
        if (year <= (LocalDate.now().getYear() - 100) || year >= LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Invalid year!");
        } else if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        } else if (day > Month.of(month).length(GC.isLeapYear(year))) {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public boolean isEmailUnique(Map<Integer, Employee> employeeMap, String email) {
        Collection<Employee> employeeSet = employeeMap.values();
        for (Employee employee : employeeSet) {
            if (email.equalsIgnoreCase(employee.getEmail())) {
                System.out.println("Entered email is already in use! Try another one.");
                return false;
            }
        }
        return true;
    }

    public boolean isIdValid(Map map, int targetId) {
        if (!map.containsKey(targetId)) {
            System.out.println("Entity does not exist");
            return false;
        }
        return true;
    }
}
