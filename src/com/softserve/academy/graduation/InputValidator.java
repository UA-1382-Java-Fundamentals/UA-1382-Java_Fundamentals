package softserve.academy.graduation;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    Pattern namePattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
    Pattern emailPattern = Pattern.compile("\\w+@\\w+\\.[A-z]{2,}");
    Pattern datePattern = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}");

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
        } else if (day > Month.of(month).length(LocalDate.of(year, month, 1).isLeapYear())) {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public boolean isEmployeePresent(Map<Integer, Employee> employees, Integer employeeId) {
        return employees.containsKey(employeeId);
    }

    public boolean isEmailUnique(Map<Integer,Employee> employees, String email) {
        List<Employee> duplicates = employees.values().stream()
                .filter(e -> e.getEmail().equalsIgnoreCase(email))
                .toList();
        if (!duplicates.isEmpty()) {
            System.out.println("Entered email is already in use! Try another one.");
            return false;
        }
        return true;
    }

    public boolean isIdValid(Map<Integer, ?> map, int targetId) {
        if (!map.containsKey(targetId)) {
            System.out.println("Entity does not exist");
            return false;
        }
        return true;
    }
}
