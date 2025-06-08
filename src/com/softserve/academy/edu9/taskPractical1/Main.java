package softserve.academy.edu9.taskPractical1;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("Accounting","Syretska","Kyiv",54);
        Department departmentClone = department.clone();

        departmentClone.setName("Marketing");
        departmentClone.setCity("Lviv");
        departmentClone.setStreet("Valova");
        departmentClone.setBuilding(19);

        System.out.println(department.toString());
        System.out.println(departmentClone.toString());

    }
}
