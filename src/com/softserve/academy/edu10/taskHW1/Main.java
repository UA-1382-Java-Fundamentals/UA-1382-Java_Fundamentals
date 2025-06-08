package softserve.academy.edu10.taskHW1;

//1. Declare collection myCollection of 10 integers and fill it (from the console or random).
//• Swap the maximum and minimum elements in the list.
//• Insert a random three-digit number before the first negative element of the list
//• Insert a zero between all neighboring elements collection myCollection with different signs
//• Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in
//reverse order.
//• In a list myCollection remove the last even element (if there are even elements in the list). If there is no
//such element, display a message.
//• Remove from the list myCollection the element following the first minimum. If the minimum element is
//the last one, nothing needs to be removed.
//Use one or more of the next: List, ArrayList, LinkedList

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(List.of(-2,-6,10,-7,2,1,-13,3,-5,9));
        Handler handler = new Handler();

        System.out.println("Initial collection: ");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        handler.swapMinMax(myCollection);
        System.out.print("Collection with swapped MIN and MAX elements: \n");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        int randomNumber = RANDOM.nextInt(100,999);
        handler.insertBeforeFirstNegative(myCollection, randomNumber);
        System.out.print("Collection with swapped MIN and MAX elements: \n");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        handler.insertBetweenNeighbors(myCollection, 0);
        System.out.print("Collection with zeroes between +/- neighbors: \n");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        int k = 5;
        final List<Integer> list1 = handler.copyListBeforeAfter(k, myCollection);
        System.out.printf("New list with first %d elements in direct order, and the rest in inverse: \n", k);
        System.out.println(list1);
        System.out.println("=".repeat(50));

        handler.removeLastEven(myCollection);
        System.out.print("Trying to remove the last even number: \n");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

        handler.removeFollowingMinimum(myCollection);
        System.out.print("Removed the element following the first minimum: \n");
        System.out.println(myCollection);
        System.out.println("=".repeat(50));

    }

}
