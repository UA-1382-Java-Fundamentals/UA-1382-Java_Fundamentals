package softserve.academy.edu10.taskPractical2;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Handler {
    static final Scanner SCANNER = new Scanner(System.in);

    public String userInput(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public Set<Integer> parseInput(String prompt) {
        String[] split = prompt.split(",");
        Set<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                list.add(Integer.parseInt(split[i].trim()));
            }
        }
        return list;
    }


}
