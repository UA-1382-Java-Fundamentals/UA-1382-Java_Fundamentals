package com.softserve.academy.homework10.practicalTask1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>(List.of(
                new HeavyBox(12,"Table"),
                new HeavyBox(6,"Chair"),
                new HeavyBox(2,"Lamp"),
                new HeavyBox(4,"Notebook")
        ));
        printBoxes(boxes);

        boxes.get(0).setWeight(22);

        printBoxes(boxes);

        boxes.removeLast();
        printBoxes(boxes);

        boxes.clear();
        System.out.println(boxes);

    }
    public static void printBoxes(List<HeavyBox> boxes){
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        System.out.println();
    }

}