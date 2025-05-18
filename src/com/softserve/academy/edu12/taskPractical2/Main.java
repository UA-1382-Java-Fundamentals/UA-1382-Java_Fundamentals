package softserve.academy.edu12.taskPractical2;

//2. Input the last name, first name, and middle name as String variables on the console. The
//following outputs will be displayed on the console:
//• Last name and initials
//• First name
//• First name, middle name, and last name.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "john fitzgerald kennedy";
        String[] parts = name.split(" ");

        Map<String,String> nameModular = new HashMap<>();
        nameModular.put("firstName",parts[0]);
        nameModular.put("middleName",parts[1]);
        nameModular.put("lastName",parts[2]);

        System.out.printf("%s %s. %s.\n",
                (Character.toUpperCase(nameModular.get("lastName").charAt(0)) + nameModular.get("lastName").substring(1)),
                Character.toUpperCase(nameModular.get("firstName").charAt(0)),
                Character.toUpperCase(nameModular.get("middleName").charAt(0))
        );

        System.out.printf("%s\n",
                (Character.toUpperCase(nameModular.get("firstName").charAt(0)) + nameModular.get("firstName").substring(1))
        );

        System.out.printf("%s %s %s\n",
                (Character.toUpperCase(nameModular.get("firstName").charAt(0)) + nameModular.get("firstName").substring(1)),
                (Character.toUpperCase(nameModular.get("middleName").charAt(0)) + nameModular.get("middleName").substring(1)),
                (Character.toUpperCase(nameModular.get("lastName").charAt(0)) + nameModular.get("lastName").substring(1))
        );
    }
}
