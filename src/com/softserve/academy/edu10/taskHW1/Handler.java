package softserve.academy.edu10.taskHW1;

import java.util.ArrayList;
import java.util.List;

public class Handler {

    public void swapMinMax(List<Integer> collection) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < min) {
                min = collection.get(i);
                minIndex = i;
            }
            if (collection.get(i) > max) {
                max = collection.get(i);
                maxIndex = i;
            }
        }
        collection.set(minIndex, max);
        collection.set(maxIndex, min);
    }

    public void insertBeforeFirstNegative (List<Integer> collection, int number) {
        int index = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                index = i;
                break;
            }
        }
        collection.add(index, number);
    }

    public void insertBetweenNeighbors (List<Integer> collection, int number) {
        for (int i = 0; i < collection.size()-1; i++) {
            int productNeighbors = collection.get(i) * collection.get(i+1);
            if (productNeighbors < 0) {
                collection.add(i+1, number);
            }
        }
    }

    public List<Integer> copyListBeforeAfter(int k, List<Integer> myCollection) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size()-1; i >= k; i--) {
            list1.add(myCollection.get(i));
        }
        return list1;
    }

    public void removeLastEven(List<Integer> collection) {
        boolean found = false;
        for (int i = collection.size()-1; i >= 0; i--) {
            if (collection.get(i) % 2 == 0 & collection.get(i) != 0) {
                collection.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No even numbers found!");
        }
    }

    public void removeFollowingMinimum(List<Integer> myCollection) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                index = i;
            }
        }
        if (index != myCollection.size()-1) {
            myCollection.remove(index+1);
        }
    }

}
