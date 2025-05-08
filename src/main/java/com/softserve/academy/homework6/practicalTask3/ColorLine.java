package com.softserve.academy.homework6.practicalTask3;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color = '" + color + '\'' +
                ", " + super.toString().substring(5);
    }
}
