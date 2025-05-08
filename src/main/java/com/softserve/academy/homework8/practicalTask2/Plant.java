package com.softserve.academy.homework8.practicalTask2;

import java.util.Arrays;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Type type = typeStrToEnum(typeStr);
        Color color = colorStrToEnum(colorStr);
        this.size = size;
        this.type = type;
        this.color = color;
    }

    public static Color colorStrToEnum(String color) throws ColorException {
        for (var colors : Color.values()) {
            if (color.equalsIgnoreCase(colors.name())) {
                return colors;
            }
        }
        throw new ColorException("Input a color from the list: " + Arrays.toString(Color.values()) + color);

    }

    public static Type typeStrToEnum(String type) throws TypeException {
        for (var types : Type.values()) {
            if (type.equalsIgnoreCase(types.name())) {
                return types;
            }
        }
        throw new TypeException("Input type from the list: " + Arrays.toString(Type.values()));

    }

    @Override
    public String toString() {
        return "Plant: {" +
                "type = " + type +
                ", color = " + color +
                ", size = " + size +
                " }";
    }
}
