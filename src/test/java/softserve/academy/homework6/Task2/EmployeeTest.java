package softserve.academy.homework6.Task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest  {
    Employee employee1 = new Employee("Ivan", 35,15000);
    @Test
    void getName() {
        assertEquals("Ivan",employee1.getName());
    }

    @Test
    void getAge() {
        assertEquals(35,employee1.getAge());
    }

    @Test
    void getSalary() {
        assertEquals(15000,employee1.getSalary());
    }

    @Test
    void report() {
        Employee employee = new Employee("Oleg", 30, 30000);
        String expected = "Name: Oleg, Age: 30, Salary: ₴ 30000,00";
        assertEquals(expected,employee.report());
    }
}