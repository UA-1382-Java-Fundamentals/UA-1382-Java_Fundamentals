package softserve.academy.edu3.taskPractical1;

import softserve.academy.edu3.taskPractical1.model.LocalMath;

public class BiCalculator {
    public static void main(String[] args) {
        LocalMath calculator = new LocalMath();

        double oper1 = calculator.getNumber("Type in the first number: ");
        double oper2 = calculator.getNumber("Type in the second number: ");

        String opPromt = "Select the operation.\n'1' - to get total\n'2' - to get average\nYour choice: ";
        int opSelector = (int)Math.round(calculator.getNumber(opPromt));

        switch (opSelector) {
            case 1: {
                double total = calculator.getTotal(oper1, oper2);
                String message = String.format("The sum of %.2f and %.2f is %.2f", oper1, oper2, total);
                System.out.println(message);
                break;
            }
            case 2: {
                double average = calculator.getAverage(oper1, oper2);
                String message = String.format("The average of %.2f and %.2f is %.2f", oper1, oper2, average);
                System.out.println(message);
                break;
            }
        }
    }
}
