package com.softserve.academy.edu1.HW4.Hw5;

public class Faculty {

   private String name;
   private int numberOfStudents;
   public Season season;

    enum Season{
        WINTER("Winter","Exam Session"),
        SPRING("Spring","Second Semester"),
        SUMMER("Summer","Summer Break"),
        AUTUMN("Autumn","First Semester"),;

        private final String season;
        private final String academic_period ;

        Season(String season, String academic_period){
            this.season = season;
            this.academic_period = academic_period;
        }

        public String getAcademic_period() {
            return academic_period;
        }
        public String getSeason() {
            return season;
        }
    }

    public Faculty(String name, int numberOfStudents, String season){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = Season.valueOf(season);
        System.out.println(toString());
    }


    public String toString() {
        return name + " " + numberOfStudents + " " + season.getSeason()+" "+ season.getAcademic_period();
    }
}
