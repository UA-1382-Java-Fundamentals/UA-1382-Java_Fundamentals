package hwseven;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Payment> employees = new ArrayList<>();


        employees.add(new SalariedEmployee("SE001", "Іван", 5000.00, "SSN123"));
        employees.add(new ContractEmployee("CE001", "Марія", 25.00, 160, "FTID456"));
        employees.add(new SalariedEmployee("SE002", "Олег", 6000.00, "SSN789"));
        employees.add(new ContractEmployee("CE002", "Андрій", 30.00, 120, "FTID999"));

        employees.sort((e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));


        System.out.println("Список працівників за спаданням зарплати:");
        for (Payment p : employees) {
            if (p instanceof Employee) {
                Employee emp = (Employee) p;
                System.out.printf("ID: %s | Ім'я: %s | Зарплата: %.2f\n", emp.getEmployeeId(), emp.getName(), p.calculatePay());
            }
        }
    }
}