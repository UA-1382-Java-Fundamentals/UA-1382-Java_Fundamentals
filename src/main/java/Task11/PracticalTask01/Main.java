package Task11.PracticalTask01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Bogdan");
        employeeMap.put(2, "Ivan");
        employeeMap.put(3, "Petro");
        employeeMap.put(4, "Taras");
        employeeMap.put(5, "Oleksandr");
        employeeMap.put(6, "Borus");
        employeeMap.put(7, "Sudir");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        int number = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Hello.Write a number of Employee from 1 -7 :");
            number = sc.nextInt();
            if (number < 0 || number > 7) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (Exception e) {
            System.out.println("Only NUMBERS from 1 to 7 Please!");
        }


        System.out.println("Employee by number : " + number + " is : " + employeeMap.get(number));
        System.out.println("==".repeat(20));

        String text;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Hello.Write a name of Employee :");
        text = sc1.nextLine();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(text)) {
                System.out.println("The employee " + text + " have a " + entry.getKey() + " number in the list");
            }
            else  {
                System.out.println("The employee not exist");
            }
        }
    }
}
