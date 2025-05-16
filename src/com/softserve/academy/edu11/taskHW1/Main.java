package softserve.academy.edu11.taskHW1;

//1. Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
//set2), realizing the operations of union and intersection of two sets. Test the operation
//of these techniques on two pre-filled sets.

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(
                1,2,3,4,5,6,7,8,9
        ));
        Set<Integer> set2 = new HashSet<>(Set.of(
                5,6,7,8,9,10,11,12,13,14,15
        ));


        Set<Integer> union = union(set1, set2);
        System.out.println(union);

        Set<Integer> intersection = intersect(set1, set2);
        System.out.println(intersection);
    }

    public static Set<Integer> union(Set<Integer> setFirst, Set<Integer> setSecond) {
        Set<Integer> union = new HashSet<>(setFirst);
        union.addAll(setSecond);
        return union;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer i : set1) {
            if (set2.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }
}
