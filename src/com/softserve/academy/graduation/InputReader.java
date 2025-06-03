package softserve.academy.graduation;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputReader {
    static final Scanner SCANNER = new Scanner(System.in);
    final static InputValidator VALIDATOR = new InputValidator();

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

    // TODO: change hashSet to LocalDate
    /**
    * Year : dateValues[0],
    * Month : dateValues[1],
    * Day : dateValues[2]
    * */
    public LocalDate readDate(String prompt) {
        while (true) {
            try {
                String dateString = readString(prompt);
                VALIDATOR.checkDateFormat(dateString);
                int[] dateValues = parseDate(dateString);
                VALIDATOR.checkDateValues(dateValues[0], dateValues[1], dateValues[2]);
                return LocalDate.of(dateValues[0], dateValues[1], dateValues[2]);
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

    public String readString(String prompt) {
        while (true) {
            try {
                return readUserInput(prompt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getUserSelection(int minBound, int maxBound) {
        int userSelection = readInteger("Enter your selection: ");
        while (userSelection > maxBound || userSelection < minBound) {
            System.out.println("Value out of range, try again.");
            userSelection = readInteger("Enter your selection: ");
        }
        return userSelection;
    }

    private Integer parseInt(String input) {
//        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid input! Enter an integer!");
            }
//        }
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
        Pattern pattern = Pattern.compile("[^[\\d\\s,]]");
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
                        if (!VALIDATOR.isEmployeePresent(employeeMap, id)) {
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

    public Set<Integer> parseStaffString(String staffString) {
        HashSet<Integer> staffSet = new HashSet<>();
        if (!staffString.equals("0")) {
            String[] staffElements = staffString.split(",");
            for (String staffElement : staffElements) {
                staffElement = staffElement.trim();
                staffSet.add(Integer.parseInt(staffElement));
            }
        }
        return staffSet;
    }

    public String readEmployeeName(String prompt) {
        while (true) {
            try {
                String name = readUserInput(prompt);
                VALIDATOR.checkValidName(name);
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
                VALIDATOR.checkValidEmail(email);
                return email;
            } catch (Exception e) {
                System.out.println(e.getMessage());
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
}
