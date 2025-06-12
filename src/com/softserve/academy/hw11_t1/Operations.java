package com.softserve.academy.hw11_t1;

import java.util.HashSet;
import java.util.Set;

public class Operations {
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        return unionSet;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2) {

        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        return intersectSet;
    }
}
