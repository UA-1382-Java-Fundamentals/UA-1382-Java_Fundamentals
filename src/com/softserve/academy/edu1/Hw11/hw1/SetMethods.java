package com.softserve.academy.edu1.Hw11.hw1;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static  <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    public static  <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
         return result;
    }
}
