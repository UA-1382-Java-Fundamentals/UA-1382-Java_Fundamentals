package hwten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(10, "Books"));
        boxes.add(new HeavyBox(15, "Notebooks"));
        boxes.add(new HeavyBox(8, "Toys"));
        boxes.add(new HeavyBox(20, "Pens"));


        System.out.println("=== initial list ===");
        for (HeavyBox b : boxes) {
            System.out.println(b);
        }


        HeavyBox first = boxes.get(0);
        first.setWeight(first.getWeight() + 1);


        boxes.remove(boxes.size() - 1);


        System.out.println("\n=== after update & remove ===");
        for (HeavyBox b : boxes) {
            System.out.println(b);
        }


        boxes.clear();


        System.out.println("\n=== after clear ===");
        System.out.println("boxes size = " + boxes.size());
    }
}
