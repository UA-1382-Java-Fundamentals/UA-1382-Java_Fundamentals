package com.softserve.academy.edu1.IO_Streams;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileProcessor {

    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            int lineCount = lines.size();
            String longestLine = "";
            for (String line : lines) {
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }

            List<String> output = new ArrayList<>();
            output.add("Number of lines: " + lineCount);
            output.add("Longest line: " + longestLine);
            output.add("Name: Oleksandr Mozghovyi");
            output.add("Birthdate: 18.12.1994");

            Files.write(Paths.get(outputFile), output);
            System.out.println("file2.txt created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}