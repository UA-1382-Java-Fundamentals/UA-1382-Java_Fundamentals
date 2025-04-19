import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "? ");
        String address = scanner.nextLine();
        System.out.println("Name: " + name + ", Address: " + address);
        scanner.close();
    }
}
