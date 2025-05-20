package Task07.Practikal_task2;

import Task07.HomeworkTask01.ContractEmployee;
import Task07.HomeworkTask01.Employee;
import Task07.HomeworkTask01.SalariedEmployee;

import java.util.Comparator;

public class EmployeeSort implements Comparator {

    public int compare(Object o1, Object o2){
    int salary1;
    int salary2;
        if(o1 instanceof ContractEmployee){
            salary1 = (((ContractEmployee) o1).calculatePay());
        }
        else if(o1 instanceof SalariedEmployee){
            salary1 = (((SalariedEmployee) o1).calculatePay());
        }
        else {
            throw new ClassCastException("Type EXCEPTION");
        }
        if(o2 instanceof ContractEmployee){
            salary2 = (((ContractEmployee) o2).calculatePay());
        }
        else if(o2 instanceof SalariedEmployee){
            salary2 = (((SalariedEmployee) o2).calculatePay());
        }
        else {
            throw new ClassCastException("Type EXCEPTION");
        }
        return -Integer.compare(salary1,salary2);
    }
}
