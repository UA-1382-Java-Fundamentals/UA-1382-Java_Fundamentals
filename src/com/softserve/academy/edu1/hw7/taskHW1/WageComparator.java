package softserve.academy.edu1.hw7.taskHW1;

import java.util.Comparator;

public class WageComparator implements Comparator {

    @Override
    public int compare(Object e1, Object e2) {
        return -Integer.compare(((Payment)e1).calculatePay(),((Payment)e2).calculatePay());
    }
}



