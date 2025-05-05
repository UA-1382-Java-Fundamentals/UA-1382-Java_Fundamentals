package com.softserve.academy.edu1.empl;

import java.util.Comparator;

// This comparator compares employees by their tab numbers.
public class TabComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee e1 && o2 instanceof Employee e2) {
            return e1.tabNumber - e2.tabNumber;
        }
        throw new ClassCastException("Both objects must be of type Employee");
    }
}
