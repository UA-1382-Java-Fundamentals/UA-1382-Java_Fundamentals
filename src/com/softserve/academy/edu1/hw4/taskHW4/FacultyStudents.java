package softserve.academy.edu1.hw4.taskHW4;

/**
 * Task was modified.
 * User should input maximum number of students that attend the faculty.
 * After that user should input the season and the program should output the next info:
 * 1) What events took place during this season.
 * 2) How many students attended faculty during that season.
 * In enum we create objects that have season name, event name and a factor that affects a number of attending students.
 */

import java.util.Scanner;

public class FacultyStudents {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int maxStudents;
        while (true) {
            try {
                maxStudents = setMaxStudents("Enter the maximum number of students: ");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Let's see how many students attended classes during a particular season.");

        String seasonInput;
        Seasons season;
        while (true) {
            while (true) {
                try {
                    seasonInput = inputSeason("What season do you have in mind? :");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                season = getSeason(seasonInput);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf(
                "During %s, the %s takes place. %.0f students attended the faculty at that time.",
                season.getName().toLowerCase(),
                season.getEvents().toLowerCase(),
                (maxStudents * season.getAttendanceFactor())
        );
    }

    public static Seasons getSeason(String name) {
        for (Seasons seasonInstance : Seasons.values()) {
            if (seasonInstance.getName().equalsIgnoreCase(name)) {
                return seasonInstance;
            }
        }
        throw new IllegalArgumentException(
                String.format("No season found with name '%s'", name)
        );
    }

    private static String inputSeason(String prompt) {
        System.out.print(prompt);
        String output = SCANNER.nextLine();
        if (output.isEmpty()) {
            throw new IllegalArgumentException("The season cannot be empty!");
        }
        return output;
    }

    private static int setMaxStudents(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int maxStudents = Integer.parseInt(SCANNER.nextLine());
                if (maxStudents <= 0) {
                    throw new IllegalArgumentException("Number of students must be greater than zero!");
                }
                return maxStudents;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter a number!");
            }
        }
    }
}
