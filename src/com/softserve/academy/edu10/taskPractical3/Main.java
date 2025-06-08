package softserve.academy.edu10.taskPractical3;

//3. In main() method declare a collection myCollection of 10 integers and fill it (from the console or random):
//• Find and save in list newCollection all positions of element more than 5 in the collection. Output
//newCollection to the console;
//• Remove from collection myCollection elements, which are greater then 20. Output the result
//• Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position – xxx, value of element
//– xxx”
//• Sort and print collection.
//• Use one or more of the next: List, ArrayList, LinkedList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(List.of(8,13,24,10,1,12,28,3,4,16));
        Handler handler = new Handler();

        System.out.println("Initial collection: ");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        int value = 5;
        System.out.printf("Indices of elements larger than %d: \n", value);
        List<Integer> newCollection = handler.getIndicesLargerThan(myCollection, value);
        System.out.println(newCollection.toString());
        System.out.println("=".repeat(50));

        value = 20;
        System.out.printf("Collection after removing elements larger than %d: \n", value);
        myCollection = handler.removeElementsLargerThan(myCollection, value);
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        System.out.print("Collection after changing several elements: \n");
        handler.inputElements(myCollection, 1, 2);
        handler.inputElements(myCollection, -3, 8);
        handler.inputElements(myCollection, -4, 5);
        handler.printInfo(myCollection);
        System.out.println("=".repeat(50));

        System.out.print("Collection after sorting: \n");
        Collections.sort(myCollection);
        handler.printInfo(myCollection);
        System.out.println("=".repeat(50));
    }
}
