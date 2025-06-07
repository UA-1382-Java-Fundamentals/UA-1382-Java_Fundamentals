package com.softserve.academy.edu1.IO_Streams;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ModifierReplacer {

    public static void main(String[] args) {
        String inputFile = "src/com/softserve/academy/edu1/IO_Streams/JavaCodeInput.java";
        String outputFile = "JavaCodeModified.java";

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));
            List<String> modified = new ArrayList<>();

            for (String line : lines) {

                if (line.trim().startsWith("public ")) {
                    modified.add(line.replaceFirst("public", "private"));
                } else {
                    modified.add(line);
                }
            }

            Files.write(Paths.get(outputFile), modified);
            System.out.println("JavaCodeModified.java saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}