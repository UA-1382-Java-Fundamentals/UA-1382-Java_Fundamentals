package softserve.academy.edu6.taskHW2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 32, 34850.50),
                new Developer("Mark Foo", 25, 36900.40, "Junior Developer"),
                new Employee("Frank Bar", 27, 45100.50),
                new Employee("Jane White", 24, 53300.50),
                new Developer("Ann Black", 31, 61500.70, "Middle Developer"),
                new Developer("Max Lee", 33, 57400.90, "Middle Developer"),
                new Developer("Mary Moore", 26, 110700.40, "Senior Developer"),
                new Employee("Peter Hook", 41, 51250.10)
        };
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
