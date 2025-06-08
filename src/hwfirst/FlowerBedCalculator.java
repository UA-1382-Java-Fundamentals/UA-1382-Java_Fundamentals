package hwfirst;
import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius = scan.nextInt();
        var perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
        scan.close();
    }

}
