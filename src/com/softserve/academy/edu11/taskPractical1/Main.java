package softserve.academy.edu11.taskPractical1;

//1. In the main() method, initialize a map named employeeMap consisting of pairs
//<Integer, String>.
//• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the
//contents of the map on the screen.
//• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and
//display it. If the ID is not found in the map, notify the user using the containsKey()
//function.
//• Prompt the user to enter a name. Verify that the name exists in the employeeMap and
//display the corresponding ID. If the name is not found in the map, notify the user using
//the containsValue() function

import java.util.HashMap;
import java.util.Map;

public class Main {
    final static EmployeeHandler EH = new EmployeeHandler();

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>(Map.of(
                1, "John Doe",
                2, "Clive Barker",
                3, "Stephen Brown",
                4, "Mike Foo",
                5, "Ellen Bar",
                6, "Helga Deere",
                7, "Frank Best"
        ));
        System.out.println("Initial employees:");
        EH.printEmployeeMap(employeeMap);
        System.out.println("===".repeat(15));

        Integer employeeId = EH.readEmployeeId();
        EH.outputEmlpoyeeById(employeeMap, employeeId);

        String employeeName = EH.readEmployeeName();
        EH.outputEmployeeByName(employeeMap, employeeName);
    }
}
