package com.softserve.academy.homework11.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith","John");
        personMap.put("Johnson","Alice");
        personMap.put("Jolly", "Bob");
        personMap.put("Brown", "Jack");
        personMap.put("Jones", "Kate");
        personMap.put("Pitt", "Peter");
        personMap.put("Sandler", "Paul");
        personMap.put("Williams", "Ringo");
        personMap.put("Black", "George");
        personMap.put("Potter", "John");

        printMap(personMap);
        System.out.println(personMap);

        Map<String,String> duplicateMap = mapDuplicate(personMap);
        printMap(duplicateMap);
        System.out.println("Duplicate map" + duplicateMap);

        var scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person you want to remove");
        String name = scanner.nextLine();

        removePerson(personMap, name);
        printMap(personMap);


    }

    private static void removePerson(Map<String, String> personMap, String name) {
        if(name == null || name.isBlank()){
            System.out.println("Name is empty");
            return;
        }
        Iterator<Map.Entry<String,String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry =  iterator.next();
            if(entry.getValue().equals(name)){
                iterator.remove();
                System.out.println("Person " + name + " was removed");
                break;
            }
        }
    }

    private static Map<String, String> mapDuplicate(Map<String, String> personMap) {
        Map<String,String> duplicateMap = new HashMap<>();

        Iterator<Map.Entry<String,String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry =  iterator.next();
            Map<String, String> temp = new HashMap<>(personMap);
            temp.remove(entry.getKey());
            if(temp.containsValue(entry.getValue())){
                duplicateMap.put( entry.getKey(), entry.getValue());
            }
        }
        return duplicateMap;
    }

//    public static Map<String,String> mapDuplicate(Map<String, String> map){
//        Set<String> set = new HashSet<>();
//        Set<String> duplicateSet = new HashSet<>();
//        Map<String,String>  duplicateMap= new HashMap<>();
//
//        for (String name : map.values()){
//            if (!set.add(name)){
//                duplicateSet.add(name);
//            }
//        }
//
//        for(Map.Entry<String,String> entry: map.entrySet()){
//            if (duplicateSet.contains(entry.getValue())){
//                duplicateMap.put(entry.getKey(), entry.getValue());
//            }
//        }
//        return duplicateMap;
//    }

    private static void printMap(Map<String, String> map){
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
