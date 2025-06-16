package com.softserve.academy.edu1.Hw5.Hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
     private List<Car> list;

   public Sorting(Car... car) {
       list = new ArrayList<>();
       Collections.addAll(list, car);
   }
   public void sortByYear() {
       Collections.sort(list,( first, second) -> Integer.compare(first.getYearOfProduction(), second.getYearOfProduction()));
   }
//    public void sortByEngineCapacity() {//добавив для інтересу
//        Collections.sort(list, (c1, c2) -> Integer.compare(c1.getEngineCapacity(), c2.getEngineCapacity()));
//    }


    public List<Car> getList() {
        return list;
    }
}
