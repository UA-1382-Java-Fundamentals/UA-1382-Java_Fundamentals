package com.softserve.academy.edu1.emp;


import java.util.Comparator;

public class Employee {
    private int tabNumber;
    private String name;

    public Employee(String name, int tabNumber) {
        this.name = name;
        this.tabNumber = tabNumber;
    }

    public String getName() {
        return name;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    @Override
    public String toString() {
        return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
    }

    // Static comparators (best practice: reusable and independent of instance)
    private static final Comparator nameComparator = new NameComparator();
    private static final Comparator tabComparator = new TabComparator();

    public static Comparator getNameComparator() {
        return nameComparator;
    }

    public static Comparator getTabComparator() {
        return tabComparator;
    }

}
