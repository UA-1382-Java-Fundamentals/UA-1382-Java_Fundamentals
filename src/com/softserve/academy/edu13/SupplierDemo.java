package com.softserve.academy.edu13;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> defString = () -> "Default String";
        System.out.println(defString.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random int: " + intSupplier.getAsInt());
    }
}
