package softserve.academy.edu10.taskPractical3;

import java.util.ArrayList;
import java.util.List;

public class Handler {

    public List<Integer> getIndicesLargerThan(List<Integer> myCollection, int value) {
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > value) {
                newCollection.add(i);
            }
        }
        return newCollection;
    }

    public List<Integer> removeElementsLargerThan(List<Integer> myCollection, int value) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > value) {
                myCollection.remove(i);
            }
        }
        return myCollection;
    }

    public void inputElements(List<Integer> myCollection, int value, int index) {
        myCollection.add(index, value);
    }

    public void printInfo(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("Index: %d | Value: %d\n", i, myCollection.get(i));
        }
    }
}
