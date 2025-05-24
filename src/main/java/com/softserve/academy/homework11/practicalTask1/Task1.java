package com.softserve.academy.homework11.practicalTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Alice");
        employeeMap.put(2,"John");
        employeeMap.put(3,"Bob");
        employeeMap.put(4,"Alex");
        employeeMap.put(5,"Jack");
        employeeMap.put(6,"Bob");
        employeeMap.put(7,"Alex");

//        System.out.println(employeeMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ud to find: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (employeeMap.containsKey(id)){
            System.out.println("Employee with id " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("Employee with id " + id + " not found");
        }
        System.out.println("Enter name to find: ");
        String name = scanner.nextLine().trim();
        if (employeeMap.containsValue(name)){
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Employee with name " + name + " is " + entry.getKey());
                }
            }
        } else {
            System.out.println("Employee with name " + name + " not found");
        }

    }
}
