package Task04.Homework;

import java.util.Scanner;

enum Season{

    WINTER("Winter exams Session"),
    SPRING ("Second Semester"),
    SUMMER("Summer Break"),
    AUTUMN("First Semester");

    private final String text;

    Season(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text;
    }
}

public class Faculty {

    private String name;
    private int numberOfStudent;
     Season season;

    public Faculty(String name, int numberOfStudent, Season season) {
        this.name = name;
        this.numberOfStudent = numberOfStudent;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty : " +
                "Name='" + name + '\'' +
                ", Students = " + numberOfStudent +
                ", season= " + season.getMessage() +
                '}';
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The Faculty name is : ");
        String fName = sc.nextLine();

        System.out.println("Chose a season(WINTER,SPRING,SUMMER,AUTUMN) ?: ");
        String valueOfSeason = sc.nextLine();
        Season seasonObject = Season.valueOf(valueOfSeason);

        System.out.println("How many students? : ");
        int students = sc.nextInt();

        sc.close();

        Faculty cult1 = new Faculty(fName,students,seasonObject);
        System.out.println(cult1.toString());
    }
}
