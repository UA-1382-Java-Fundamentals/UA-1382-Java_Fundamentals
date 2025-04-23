public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Diana");
        student.setLastName("Karalius");
        student.setAge(18);
        student.setBurse(800);
        student.setCurse(4);

        System.out.println(student.getAge());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getBurse());
        System.out.println(student.getCurse());

        Student student1 = new Student();
        student1.setAge(30);

        int totalAge = student.getAge() + student1.getAge();
        System.out.println(totalAge);
    }

}
