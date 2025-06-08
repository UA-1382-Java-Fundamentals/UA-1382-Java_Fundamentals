package hweight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            double result = Div.divide(num1, num2);
            System.out.println("Результат ділення: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Помилка: введено не число!");

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        }

        scanner.close();
    }
}