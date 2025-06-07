package softserve.academy.edu16.HW1;

//1. Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//1) number of lines in file1.txt.
//2) the longest line in file1.txt.
//3) your name and birthday date.

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inFilePath = "src/com/softserve/academy/edu16/HW1/cv.txt";
        String outFilePath = "src/com/softserve/academy/edu16/HW1/cv-out.txt";

        System.out.println("---".repeat(30));

        String readLine;
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inFilePath))) {
            while ((readLine = br.readLine()) != null) {
                lines.add(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = lines.size();

        Optional<String> longestLine = lines.stream()
                .max(Comparator.comparing(String::length));

        Pattern namePattern = Pattern.compile("^[A-Z][a-z]+\\s[A-Z][a-z]+$");
        Optional<String> nameLine = lines.stream()
                .filter(line -> namePattern.matcher(line).matches())
                .findFirst();

        Pattern birthPattern = Pattern.compile("^\\d{1,2}\\s[a-zA-z]+\\s\\d{4}");
        Optional<String> birthLine = lines.stream()
                .filter(line -> birthPattern.matcher(line).matches())
                .findFirst();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {
            bw.write("There are " + count + " lines in the initial file\n");
            bw.write("---".repeat(30) + "\n");
            bw.write("The longest line is:\n" + longestLine.orElse("None") + "\n");
            bw.write("---".repeat(30) + "\n");
            bw.write("The name is:\n" + nameLine.orElse("None") + "\n");
            bw.write("---".repeat(30) + "\n");
            bw.write("The date of birth is:\n" + birthLine.orElse("None") + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
