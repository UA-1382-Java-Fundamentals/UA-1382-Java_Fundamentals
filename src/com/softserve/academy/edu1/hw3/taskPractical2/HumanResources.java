package softserve.academy.edu1.hw3.taskPractical2;

import softserve.academy.edu1.hw3.taskPractical2.model.Employee;

public class HumanResources {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rob White", 18, 22);
        Employee emp2 = new Employee("Frank Foo", 22, 40);
        Employee emp3 = new Employee("Mike Bar", 28, 31);

        String emp1Report = String.format("Employee %s worked for %d hours with %d rate", emp1.getName(), emp1.getHours(), emp1.getRate());
        System.out.println(emp1Report);
        System.out.println("His salary was " + emp1.getSalary() + " and bonuses were " + emp1.getBonuses());
        System.out.println("He earned " + emp1.getPaycheck() + " this week overall.\n");

        String emp2Report = String.format("Employee %s worked for %d hours with %d rate", emp2.getName(), emp2.getHours(), emp2.getRate());
        System.out.println(emp2Report);
        System.out.println("His salary was " + emp2.getSalary() + " and bonuses were " + emp2.getBonuses());
        System.out.println("He earned " + emp2.getPaycheck() + " this week overall.\n");

        String emp3Report = String.format("Employee %s worked for %d hours with %d rate", emp3.getName(), emp3.getHours(), emp3.getRate());
        System.out.println(emp3Report);
        System.out.println("His salary was " + emp3.getSalary() + " and bonuses were " + emp3.getBonuses());
        System.out.println("He earned " + emp3.getPaycheck() + " this week overall.\n");

        String finalReport = String.format("A total of %d employees got a total paycheck of %.2f", Employee.getTotalEmployees(), Employee.getTotalSum());
        System.out.println(finalReport);
    }
}
