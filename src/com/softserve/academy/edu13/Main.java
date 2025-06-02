package com.softserve.academy.edu13;

// Interface with multiple methods (NOT a functional interface)
interface MultiMethod {
    void first();

    void second();
}

public class Main {
    public static void main(String[] args) {

        // ✅ Anonymous class can implement both methods
        MultiMethod anon = new MultiMethod() {
            @Override
            public void first() {
                System.out.println("First method");
            }

            @Override
            public void second() {
                System.out.println("Second method");
            }
        };

        anon.first();
        //  anon.second();

        // ❌ Lambda expression cannot be used here
      //  MultiMethod lambda = () -> System.out.println("This won't compile!");
    }
}
