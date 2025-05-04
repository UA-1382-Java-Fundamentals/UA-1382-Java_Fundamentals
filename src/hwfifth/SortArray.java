package hwfifth;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        String [] names = {"Kate", "Mary", "Bob","Alis"};
        Arrays.sort(names);
        System.out.println("Sorted names" + Arrays.toString(names));
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter searching name:");
        String searchingName = scan.nextLine();
        boolean found = false;
        for (String name: names) {
            if (name.equals(searchingName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value" +" "+ searchingName +" "+ "founded");
        } else {
            System.out.println("Value" +" "+ searchingName +" " + "not found");
        }

    }


}
