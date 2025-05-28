package softserve.academy.edu14.HW2;

//2. For given a stream with objects of Employee class, return the optional, containing the most
//popular name. If this stream is empty, Optional.empty should be returned. For example:
//empl1.name = “Bob”, empl2.name = “Din”,
//empl3.name = “Sam”, empl4.name = “Sam”
//“Sam” should be returned.
//• Realize method
//static Optional<String> mostPopularName(Stream< Employee> employees) {
//return null; }

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int limit = 6;
        List<Employee> employees = IntStream
                .rangeClosed(1, limit)
                .mapToObj(o -> Employee.newRandomEmployee())
                .toList();

        employees.forEach(System.out::println);

        System.out.printf("The most popular name is %s\n%n", Employee.mostPopularName(employees).orElse("none"));


    }
}
