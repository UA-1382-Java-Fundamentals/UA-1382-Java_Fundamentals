package softserve.academy.edu1.hw7.taskHW1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Payment[] employees = {
                new ContractEmployee("Mark-231", 1500, "584678922"),
                new ContractEmployee("Jane-246", 900, "563421889"),
                new ContractEmployee("Robin-190", 1300, "547962312"),
                new SalariedEmployee("Frank-724", 25, 25, "123578946"),
                new SalariedEmployee("Kate-280", 22, 30, "254869731"),
                new SalariedEmployee("ALice-094", 36, 40, "957486321"),
                new SalariedEmployee("Richard-217", 44, 25, "256987965"),
        };
        System.out.println("========== Raw array ============");
        for (Payment employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("============ Sorted =============");
        Arrays.sort(employees, new WageComparator());
        for (Payment employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
