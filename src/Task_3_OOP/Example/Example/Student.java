package Task_3_OOP.Example.Example;

public class Student {

    private  String name;
    private double rating;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Student(){
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double avgRating(double rate1, double rate2, double rate3){
        double avgRating = (rate1 + rate2 + rate3)/3;
        return avgRating;
    }

    public boolean isbeterStudent(Student s1, Student s2) {
        if (s1.getRating() > s2.getRating()) {
            return true;
        }
    return false;
    }

    //public String toString(){
     // return "Student: " + name + ", Rating: " + rating ;
   // }


    @Override
    public String toString() {
        return "Student{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
               '}';
    }

    public static void main (String[] args){
        Student student1 = new Student("Petro", 3.8);
        Student student2 = new Student("Ivan", 4.2);
        Student student3 = new Student("Pavlo", 3.9);
        double rate1 = student1.getRating();
        double rate2 = student2.getRating();
        double rate3 = student3.getRating();

       System.out.println("Average rating is : " + Student.avgRating(rate1,rate2,rate3));
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
   }
}


