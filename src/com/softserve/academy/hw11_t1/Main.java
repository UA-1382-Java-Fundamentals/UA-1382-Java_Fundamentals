/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
set2), realizing the operations of union and intersection of two sets. Test the operation
of these techniques on two pre-filled sets.

 */

package com.softserve.academy.hw11_t1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Joshua");
        set1.add("Alice");
        set1.add("Alan");

        set2.add("Alice");
        set2.add("Rick");
        set2.add("Alan");
        set2.add("Robert");

        System.out.println(set1 + "\n" + set2);
        System.out.println("Sets union: " + Operations.union(set1, set2));
        System.out.println("Sets intersection: " + Operations.intersect(set1, set2));
    }
}
