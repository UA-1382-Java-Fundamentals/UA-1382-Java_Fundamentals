package com.softserve.academy.edu17.fileio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * This class demonstrates different ways to read from files in Java:
 * - Using FileReader and BufferedReader (character streams)
 * - Using FileInputStream (byte streams)
 * - Using Scanner
 * - Using Files utility class (Java NIO)
 */
public class FileReadingExample {

    public static void main(String[] args) {
        // Define file path
        String filePath = "example_files\\sample_text.txt";
        File file = new File(filePath);

        // Create directory and sample file if they don't exist
        createSampleFile(file);

        System.out.println("===== READING FILE USING DIFFERENT METHODS =====\n");

        // Method 1: Using FileReader (character by character)
        readWithFileReader(file);

        // Method 2: Using BufferedReader (line by line)
        readWithBufferedReader(file);

        // Method 3: Using FileInputStream (byte by byte)
        readWithFileInputStream(file);

        // Method 4: Using Scanner
        readWithScanner(file);

        // Method 5: Using Files class (Java NIO)
        readWithFilesNIO(filePath);

        // Method 6: Reading entire file at once with Files
        readAllWithFilesNIO(filePath);
    }

    /**
     * Creates a sample text file for demonstration
     */
    private static void createSampleFile(File file) {
        try {
            // Create directory if it doesn't exist
            File directory = file.getParentFile();
            if (!directory.exists()) {
                directory.mkdir();
            }

            // Create and write to the file
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Line 1: This is a sample text file.\n");
                    writer.write("Line 2: It contains multiple lines of text.\n");
                    writer.write("Line 3: Used for demonstrating file reading methods.\n");
                    writer.write("Line 4: Each method reads this same content.\n");
                    writer.write("Line 5: End of the sample file.");
                }
                System.out.println("Sample file created at: " + file.getAbsolutePath() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error creating sample file: " + e.getMessage());
        }
    }

    /**
     * Method 1: Reading a file character by character using FileReader
     */
    private static void readWithFileReader(File file) {
        System.out.println("Method 1: Reading with FileReader (character by character)");
        try (FileReader reader = new FileReader(file)) {
            int character;
            StringBuilder content = new StringBuilder();

            // Read character by character
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            System.out.println(content.toString());
        } catch (IOException e) {
            System.err.println("Error reading with FileReader: " + e.getMessage());
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Method 2: Reading a file line by line using BufferedReader
     */
    private static void readWithBufferedReader(File file) {
        System.out.println("Method 2: Reading with BufferedReader (line by line)");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            // Read line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading with BufferedReader: " + e.getMessage());
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Method 3: Reading a file byte by byte using FileInputStream
     */
    private static void readWithFileInputStream(File file) {
        System.out.println("Method 3: Reading with FileInputStream (byte by byte)");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            int byteData;
            StringBuilder content = new StringBuilder();

            // Read byte by byte
            while ((byteData = inputStream.read()) != -1) {
                content.append((char) byteData);
            }

            System.out.println(content.toString());
        } catch (IOException e) {
            System.err.println("Error reading with FileInputStream: " + e.getMessage());
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Method 4: Reading a file using Scanner
     */
    private static void readWithScanner(File file) {
        System.out.println("Method 4: Reading with Scanner");
        try (Scanner scanner = new Scanner(file)) {
            // Read line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading with Scanner: " + e.getMessage());
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Method 5: Reading a file using Files class from Java NIO
     */
    private static void readWithFilesNIO(String filePath) {
        System.out.println("Method 5: Reading with Files class (Java NIO)");
        Path path = Paths.get(filePath);
        try {
            // Read all lines
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading with Files: " + e.getMessage());
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Method 6: Reading entire file at once with Files.readString (Java 11+)
     */
    private static void readAllWithFilesNIO(String filePath) {
        System.out.println("Method 6: Reading entire file at once with Files.readString");
        Path path = Paths.get(filePath);
        try {
            // Read entire file as a string
            String content = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error reading with Files.readString: " + e.getMessage());

            // Alternative for Java 8
            try {
                byte[] bytes = Files.readAllBytes(path);
                String content = new String(bytes, StandardCharsets.UTF_8);
                System.out.println("Alternative for Java 8:");
                System.out.println(content);
            } catch (IOException ex) {
                System.err.println("Error reading with Files.readAllBytes: " + ex.getMessage());
            }
        }
        System.out.println("----------------------------------------");
    }
}