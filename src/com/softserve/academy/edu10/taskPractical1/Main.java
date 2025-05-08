package softserve.academy.edu10.taskPractical1;

//1. Create a dynamic array containing objects of the HeavyBox class which includes int weight and String contents
//fields. Output its contents using for-each loop.
//• Change the weight of the first box by 1.
//• Remove the last box.
//• Output result to the console. Remove all boxes and output result to the console.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>(List.of(
                new HeavyBox(10, "Tableware"),
                new HeavyBox(2, "Electronics"),
                new HeavyBox(5, "Clothes")
        ));

        System.out.println("=".repeat(50));
        System.out.println("Initial list of boxes: ");
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox.toString());
        }

        HeavyBoxHandler boxHandler = new HeavyBoxHandler();
        boxHandler.setBoxWeight(heavyBoxes, 0, (heavyBoxes.getFirst().getWeight() + 1));
        System.out.println("=".repeat(50));
        System.out.println("List after increasing the weight of the first box: ");
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox.toString());
        }

        boxHandler.removeBox(heavyBoxes, heavyBoxes.size()-1);
        System.out.println("=".repeat(50));
        System.out.println("List after removing the last box: ");
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox.toString());
        }

        boxHandler.clearBoxList(heavyBoxes);
        System.out.println("=".repeat(50));
        System.out.println("List after clearing: ");
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox.toString());
        }
    }
}
