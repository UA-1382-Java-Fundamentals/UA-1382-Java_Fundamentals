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

enum Seasons {
    SPRING ("Spring", "Second semester", 0.8),
    SUMMER ("Summer", "Vacation", 0.05),
    AUTUMN ("Autumn", "First semester", 0.9),
    WINTER ("Winter", "Exams", 0.95);

    private final String name;
    private final String events;
    private final double attendanceFactor;

    private Seasons (String name, String events, double attendanceFactor) {
        this.name = name;
        this.events = events;
        this.attendanceFactor = attendanceFactor;
    }

    public static Seasons getSeason (String name) {
        for (Seasons seasonInstance : values()) {
            if (seasonInstance.name.equalsIgnoreCase(name)) {
                return seasonInstance;
            }
        }
        return null;
    }

    public String getEvents() {
        return events;
    }

    public String getName() {
        return name;
    }

    public double getAttendanceFactor() {
        return attendanceFactor;
    }
}

public class FacultyStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number of students: ");
        int maxStudents = sc.nextInt();
        while (maxStudents <= 0) {
            System.out.println("Enter a positive number: ");
            maxStudents = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("Let's see how many students attended classes during a particular season. " +
                "\nWhat season do you have in mind?");
        String seasonInput = sc.nextLine();
        Seasons season = Seasons.getSeason(seasonInput);
        while (season == null) {
            System.out.println("Incorrect season, try again");
            seasonInput = sc.nextLine();
            season = Seasons.getSeason(seasonInput);
        }

        String seasonMessage = String.format("It is %s.\nThe time of %s has come.\n%.0f students attended faculty " +
                "during that season.", season.getName(), season.getEvents(), (maxStudents * season.getAttendanceFactor()));
        System.out.println(seasonMessage);
    }
}
