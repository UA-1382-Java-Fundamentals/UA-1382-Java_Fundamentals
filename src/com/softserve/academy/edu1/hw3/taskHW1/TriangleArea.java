package softserve.academy.edu1.hw3.taskHW1;

import softserve.academy.edu1.hw3.taskHW1.model.TriCalculator;

public class TriangleArea {
    public static void main(String[] args) {
        TriCalculator calculator = new TriCalculator();

        int[] sides = new int[3];
        char[] sidesChar = {'a', 'b', 'c'};

        while (true) {
            for (int i = 0; i < sides.length; i++) {
                while (true) {
                    try {
                        sides[i] = calculator.getSide("Type in triangle side " + sidesChar[i] + ": ");
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            try {
                calculator.checkTriangleValidity(sides);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("The longest edge can't be bigger than half perimeter!");
            }
        }

        double area = calculator.getArea(sides[0], sides[1], sides[2]);
        String message = String.format("The area of the triangle is %.2f", area);
        System.out.println(message);

    }
}
