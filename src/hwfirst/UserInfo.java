package hwfirst;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Where do you live" + " " + name +"?");
        String address = scan.nextLine();
        System.out.println("Name:"+ name +" "+"Address:"+ address);
        scan.close();
    }
}
