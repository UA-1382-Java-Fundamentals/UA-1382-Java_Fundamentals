package softserve.academy.edu16.HW2;

//2. A file with java code is given. Read program text from file and all words public in the
//declaration of class attributes and methods should be replaced with the word private.
//Save the result to another previously created file.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inFilePath = "src/com/softserve/academy/edu16/HW2/classPublic.java";
        String outFilePath = "src/com/softserve/academy/edu16/HW2/classPrivate.java";

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String targetSearch = "public";
        String targetReplace = "private";

        // class and constructor declarations to avoid errors
        String declareOld = "private class classPublic {";
        String declareNew = "public class classPrivate {";

        String constructorOld = "private classPublic";
        String constructorNew = "public classPrivate";

        List<String> dataOutput = lines.stream()
                .map(line -> line.replaceAll(targetSearch, targetReplace))
                .map(line -> line.replace(declareOld, declareNew))
                .map(line -> line.replace(constructorOld, constructorNew))
                .toList();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {
            dataOutput.forEach(line -> {
                try {
                    bw.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("New access modifier applied");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
