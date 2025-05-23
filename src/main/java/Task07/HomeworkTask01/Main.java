package Task07.HomeworkTask01;

import Task07.Practikal_task2.EmployeeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employeesList = {
                new ContractEmployee("Petrov I.O.", "54326859", 5500),
                new ContractEmployee("Sidorow A.P.", "67584930", 4800),
                new ContractEmployee("Kobzar A.I.", "4758395", 6000),
                new SalariedEmployee("Ivaniv P.R.", "79685734", 160, 35),
                new SalariedEmployee("Sudorenko L.O.", "58694656", 148, 40),
                new SalariedEmployee("Ovcharek O.K.", "46354907", 155, 37)
        };
        System.out.println("<<<BEFORE SORTING>>>");
        for (Employee e : employeesList) {
            System.out.println(e.toString());
        }
        System.out.println("=========================");
        Arrays.sort(employeesList,new EmployeeSort());
        System.out.println("<<<AFTER SORTING>>>");
        for (Employee e : employeesList) {
            System.out.println(e.toString());
        }
    }
}
