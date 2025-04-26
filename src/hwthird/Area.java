package hwthird;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Side1:");
        double side1 = scan.nextDouble();

        System.out.println("Enter Side2:");
        double side2 = scan.nextDouble();


        System.out.println("Enter Side1:");
        double side3 = scan.nextDouble();

        // Обчислення півпериметра
        double s = (side1 + side2 + side3) / 2;

        // Формула Герона для площі
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("Area of a triangle: %.2f\n", area);
        scan.close();
    }
}