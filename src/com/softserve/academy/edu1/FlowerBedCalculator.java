import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) throws Exception {

        int radius; 
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt(); 
        scanner.close(); 
        double perimeter = 2 * Math.PI * radius; 
        double area = Math.PI * radius * radius; 
        System.out.println( "Perimeter: " + perimeter);
        System.out.println( "Area: " + area);
    }
}
