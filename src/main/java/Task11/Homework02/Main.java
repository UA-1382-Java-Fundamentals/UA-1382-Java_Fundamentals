package Task11.Homework02;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Petro");
        personMap.put("Petrov", "Ivan");
        personMap.put("Lusenko", "Mukola");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Berezova", "Natalia");
        personMap.put("Bloshko", "Nadia");
        personMap.put("Severenko", "Ivan");
        personMap.put("Kravchenko", "Muhailo");
        personMap.put("Kovalenko", "Svitlana");
        personMap.put("Antonov", "Ivan");

        int i = 1;
        for (Map.Entry m : personMap.entrySet()) {
            System.out.println(i + " " + m.getKey() + " " + m.getValue());
            i++;
        }

        System.out.println("==".repeat(20));

        i = 1;
        Map<String, String> person = new HashMap<>();
        for (Map.Entry m : personMap.entrySet()) {
            if(!m.getValue().equals("Ivan")) {
                person.put((String) m.getKey(),(String) m.getValue());
                System.out.println( i + " " + m.getKey() + " " + m.getValue());
                i++;
            }
        }

    }
}
