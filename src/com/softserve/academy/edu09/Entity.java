package com.softserve.academy.edu09;


public class Entity {
    // Static counter to track the number of Entity instances
    private static int count = 0;

    /**
     * Constructor for Entity.
     * Increments the count each time a new Entity is created.
     */
    public Entity() {
        new Counter().setCount();
    }

    public static int getCount() {
        return count;
    }

    /**
     * Private static inner class used to increment the count.
     * Demonstrates encapsulation of functionality within the outer class.
     */
    private static class Counter {
        /**
         * Increments the count of Entity objects.
         */
        private void setCount() {
            count++;
        }
    }
}
