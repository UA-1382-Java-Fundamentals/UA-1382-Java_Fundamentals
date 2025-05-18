package hweight;

public class Div {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль заборонене!");
        }
        return a / b;
    }

}
