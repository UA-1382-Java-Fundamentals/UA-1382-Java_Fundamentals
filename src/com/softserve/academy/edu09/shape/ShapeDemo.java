package com.softserve.academy.edu09.shape;

public class ShapeDemo {

    public static void main(String[] args) {
        // Create a Coordinate object directly without needing a Shape instance
        // This is possible because Coordinate is a static inner class
        Shape.Coordinate coordinate = new Shape.Coordinate(5, 10);

        System.out.println("Coordinates: " + coordinate);
    }
}
