package softserve.academy.edu16.taskPractical1;

//1. Prepare txt file with a lot of text inside.
//Read context from file into array of strings.
//Each array item contains one line from file.
//Complete next tasks:
//1) count and write the number of symbols in every line.
//      find average number of symbols between non-empty lines
//2) find the longest and the shortest line.
//3) find and write only that lines, which consist of word «var»

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/com/softserve/academy/edu16/taskPractical1/pg345.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("---".repeat(30));
            System.out.println("Read data from file: " + fileName);
            List<String> rowList = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                rowList.add(line);
            }
            if (!rowList.isEmpty()) {
                int count = rowList.size();
                int average = rowList.stream()
                        .map(String::length)
                        .filter(i -> i > 0)
                        .reduce(0, Integer::sum)
                        / count;

                List<String> sortedRowList = rowList.stream()
                        .sorted(Comparator.comparing(String::length))
                        .filter(s -> !s.isBlank())
                        .toList();

                String target = "section";
                List<String> resultList = rowList.stream()
                        .filter(s -> s.contains(target))
                        .toList();

                System.out.printf("There are %d lines in the file with average of %d symbols in non-empty lines\n", count, average);
                System.out.println("---".repeat(30));

                System.out.printf("The shortest line (%d) is:\n%s\n", sortedRowList.getFirst().length(), sortedRowList.getFirst());
                System.out.println("---".repeat(30));

                System.out.printf("The longest line (%d) is:\n%s\n", sortedRowList.getLast().length(), sortedRowList.getLast());
                System.out.println("---".repeat(30));

                System.out.printf("Searching for target: \"%s\"\n", target);
                if (!resultList.isEmpty()) {
                    resultList.forEach(System.out::println);
                } else {
                    System.out.println("None found.");
                }
            } else {
                System.out.println("The file is empty");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
