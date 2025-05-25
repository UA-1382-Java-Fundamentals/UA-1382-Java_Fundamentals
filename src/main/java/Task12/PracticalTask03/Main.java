package Task12.PracticalTask03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Asmodei_53");
        stringList.add("chaos650");
        stringList.add("ValEnS0_45");
        stringList.add("*Amigo*");
        stringList.add("Silvester-Stalone");

        Pattern pattern = Pattern.compile("^\\w{3,15}$");

        for (int i = 0; i <= stringList.size() - 1; i++) {
            Matcher m = pattern.matcher(stringList.get(i));
            if (m.find()) {
                System.out.println("Approved : " + stringList.get(i));
            } else {
                System.out.println("Rejected : " + stringList.get(i));
            }
        }
    }
}
