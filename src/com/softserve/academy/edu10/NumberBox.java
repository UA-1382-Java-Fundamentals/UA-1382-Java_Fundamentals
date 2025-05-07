package com.softserve.academy.edu10;

public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }

    public int getIntValue() {
        return number.intValue();
    }

    @Override
    public String toString() {
        return "NumberBox{" +
                "number=" + number +
                '}';
    }
}

class Application {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(10);
        System.out.println("Integer value: " + intBox.getIntValue());
        System.out.println("Double value: " + intBox.getDoubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>(10.5);
        System.out.println("Integer value: " + doubleBox.getIntValue());
        System.out.println("Double value: " + doubleBox.getDoubleValue());

       // NumberBox<Boolean> boolBox = new NumberBox<>(true); // Compile error
    }

}
