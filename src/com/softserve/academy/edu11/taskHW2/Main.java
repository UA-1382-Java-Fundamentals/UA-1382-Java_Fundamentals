package softserve.academy.edu11.taskHW2;

//2. Create a map called personMap and populate it with ten entries of type <String,
//String>, where each entry corresponds to a person's last name and first name. Display
//the contents of the map on the screen. Are there at least two persons with the same
//first name among these ten people? Remove the person from the map whose first
//name is "Orest" (or any other specified name). Print the resulting map after the
//removal.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>(Map.of(
                "Doe","John",
                "Foo","Mike",
                "Bar","Kate",
                "White","Rob",
                "Moore","Dean",
                "Bloom","Alice",
                "Creed","Jake",
                "Loom","Frank",
                "Tusk","Rob", // duplicate first name
                "Deere","Jane"
        ));

        System.out.println("Initial map:");
        printMap(personMap);
        System.out.println("===".repeat(15));

        System.out.println("Check for duplicate first names:");
        if (areDupicatesPresent(personMap)) {
            System.out.println("Duplicate first names found");
        } else {
            System.out.println("All first names are unique");
        }
        System.out.println("===".repeat(15));

        String target = "Dean";
        System.out.printf("Remove entry with first name: %s\n", target);
        removeTargetValue(personMap, target);

        printMap(personMap);

    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    private static boolean areDupicatesPresent(Map<String, String> personMap) {
        Iterator iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Map<String, String> tempMap = new HashMap<>(personMap);
            tempMap.remove(entry.getKey());
            if (tempMap.containsValue(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    private static void removeTargetValue(Map<String, String> personMap, String target) {
        Iterator iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (target.equals(entry.getValue())) {
                iterator.remove();
            }
        }
    }
}
