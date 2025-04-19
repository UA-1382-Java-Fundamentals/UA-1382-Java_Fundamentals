package homework4.Faculty;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FacultyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the faculty name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter the current season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.next().toUpperCase();
        Season season = switch (seasonInput) {
            case "WINTER" -> Season.WINTER;
            case "SPRING" -> Season.SPRING;
            case "SUMMER" -> Season.SUMMER;
            case "AUTUMN" -> Season.AUTUMN;
            default -> {
                System.out.println("Enter WINTER, SPRING, SUMMER, or AUTUMN. Try again.");
                yield null;
            }
        };
        if (season != null) {
            Faculty faculty = new Faculty(facultyName, numberOfStudents, season);
            System.out.println(faculty);
        }

    }

}
