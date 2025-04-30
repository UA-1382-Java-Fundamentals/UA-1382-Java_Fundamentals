package softserve.academy.edu1.hw7.taskHW1;

import java.util.Comparator;

public class WageComparator implements Comparator {

    @Override
    public int compare(Object e1, Object e2) {
        int value1;
        int value2;
        if (e1 instanceof ContractEmployee) {
            value1 = ((ContractEmployee) e1).calculatePay();
        }
        else if (e1 instanceof SalariedEmployee) {
            value1 = ((SalariedEmployee) e1).calculatePay();
        }
        else {
            throw new ClassCastException("Both objects must be of type Employee");
        }
        if (e2 instanceof ContractEmployee) {
            value2 = ((ContractEmployee) e2).calculatePay();
        }
        else if (e2 instanceof SalariedEmployee) {
            value2 = ((SalariedEmployee) e2).calculatePay();
        }
        else {
            throw new ClassCastException("Both objects must be of type Employee");
        }
        return -Integer.compare(value1,value2);
    }
}



