package com.softserve.academy.edu09.shape;

public class Shape {

    String type;
    Coordinate[] coordinates;

    /**
     * Static inner class representing a coordinate in 2D space.
     * Being static means it doesn't need an instance of the outer class to be created.
     */
    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x = " + x + " y = " + y;
        }
    }
}
