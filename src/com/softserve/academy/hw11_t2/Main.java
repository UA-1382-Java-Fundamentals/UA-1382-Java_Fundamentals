/*
Create a map called personMap and populate it with ten entries of type <String,
String>, where each entry corresponds to a person's last name and first name. Display
the contents of the map on the screen. Are there at least two persons with the same
first name among these ten people? Remove the person from the map whose first
name is "Orest" (or any other specified name). Print the resulting map after the
removal.
 */

package com.softserve.academy.hw11_t2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("FirstName1", "LastName1");
        personMap.put("FirstName2", "LastName2");
        personMap.put("Orest", "LastName3");
        personMap.put("FirstName4", "LastName4");
        personMap.put("FirstName5", "LastName5");
        personMap.put("FirstName6", "LastName6");
        personMap.put("FirstName7", "LastName7");
        personMap.put("FirstName8", "LastName8");
        personMap.put("FirstName9", "LastName9");
        personMap.put("FirstName10", "LastName10");

        System.out.println("The original map:");
        for (Map.Entry<String, String> map : personMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

        personMap.remove("Orest");

        System.out.println("\nThe map after removing of Orest:");
        for (Map.Entry<String, String> map : personMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

    }
}
