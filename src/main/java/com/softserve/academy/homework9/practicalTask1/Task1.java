package com.softserve.academy.homework9.practicalTask1;

public class Task1 {
    public static void main(String[] args) {
        Department departmentOrig = new Department("IT",
                new Department.Address("Lviv", "Chervonoyi Kalyny", 1));
        Department departmentClone = departmentOrig.clone();

        System.out.println("DepartmentOrigin" + departmentOrig);
        System.out.println("DepartmentClone"  + departmentClone);

        departmentClone.address.city = "Kyiv";

        System.out.println("DepartmentOrigin" + departmentOrig);
        System.out.println("DepartmentClone"  + departmentClone);
    }
}

