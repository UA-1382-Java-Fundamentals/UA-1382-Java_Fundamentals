package com.softserve.academy.homework13.practicalTask4;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("There are" + count(nums, x -> x % 2 == 0) + " even numbers" );
        System.out.println("There are" + count(nums, x -> x > 6) + " greater than 6" );
    }
    static int count(Integer[] nums, Predicate<Integer>condition){
        int res = 0;
        for (var el : nums){
            if(condition.test(el)){
                 res++;
            }
        }
        return res;
    }
}
