package softserve.academy.edu1.hw3.taskHW1;

import softserve.academy.edu1.hw3.taskHW1.model.TriCalculator;

public class TriangleArea {
    public static void main(String[] args) {
        TriCalculator calculator = new TriCalculator();

        int side1 = calculator.getSide("Type in triangle side a: ");
        int side2 = calculator.getSide("Type in triangle side b: ");
        int side3 = calculator.getSide("Type in triangle side c: ");

        double area = calculator.getArea(side1, side2, side3);
        String message = String.format("The area of the triangle is %.2f", area);
        System.out.println(message);

    }
}
