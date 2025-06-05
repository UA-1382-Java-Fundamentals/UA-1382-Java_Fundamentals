package com.softserve.academy.edu17.fileio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates different ways to write to files in Java:
 * - Using FileWriter and BufferedWriter (character streams)
 * - Using FileOutputStream (byte streams)
 * - Using PrintWriter
 * - Using Files utility class (Java NIO)
 * - Appending to existing files
 */
public class FileWritingExample {

    public static void main(String[] args) {
        // Create directory if it doesn't exist
        File directory = new File("example_files");
        if (!directory.exists()) {
            directory.mkdir();
        }

        System.out.println("===== WRITING TO FILES USING DIFFERENT METHODS =====\n");

        // Method 1: Using FileWriter
        writeWithFileWriter();

        // Method 2: Using BufferedWriter
        writeWithBufferedWriter();

        // Method 3: Using FileOutputStream
        writeWithFileOutputStream();

        // Method 4: Using PrintWriter
        writeWithPrintWriter();

        // Method 5: Using Files class (Java NIO)
        writeWithFilesNIO();

        // Method 6: Appending to a file
        appendToFile();

        System.out.println("\nAll writing operations completed. Check the example_files directory.");
    }

    /**
     * Method 1: Writing to a file using FileWriter
     */
    private static void writeWithFileWriter() {
        String filePath = "example_files\\filewriter_example.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Line 1: This file was created using FileWriter.\n");
            writer.write("Line 2: FileWriter is a character stream writer.\n");
            writer.write("Line 3: It's good for writing text data.");

            System.out.println("Successfully wrote to file using FileWriter: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with FileWriter: " + e.getMessage());
        }
    }

    /**
     * Method 2: Writing to a file using BufferedWriter
     */
    private static void writeWithBufferedWriter() {
        String filePath = "example_files\\bufferedwriter_example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Line 1: This file was created using BufferedWriter.");
            writer.newLine(); // Add a new line
            writer.write("Line 2: BufferedWriter is more efficient for writing large amounts of text.");
            writer.newLine();
            writer.write("Line 3: It buffers the characters, reducing the number of I/O operations.");

            System.out.println("Successfully wrote to file using BufferedWriter: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with BufferedWriter: " + e.getMessage());
        }
    }

    /**
     * Method 3: Writing to a file using FileOutputStream
     */
    private static void writeWithFileOutputStream() {
        String filePath = "example_files\\fileoutputstream_example.txt";
        String content = "This file was created using FileOutputStream.\n" +
                "FileOutputStream is a byte stream writer.\n" +
                "It's useful for writing binary data or when you need to work with bytes.";

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            // Convert string to bytes and write
            byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
            outputStream.write(bytes);

            System.out.println("Successfully wrote to file using FileOutputStream: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with FileOutputStream: " + e.getMessage());
        }
    }

    /**
     * Method 4: Writing to a file using PrintWriter
     */
    private static void writeWithPrintWriter() {
        String filePath = "example_files\\printwriter_example.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Line 1: This file was created using PrintWriter.");
            writer.println("Line 2: PrintWriter provides convenient methods like println().");
            writer.printf("Line 3: It also supports formatted output like this: %d, %s, %.2f%n", 42, "text", 3.14159);
            writer.println("Line 4: It's often used for text output that needs formatting.");

            System.out.println("Successfully wrote to file using PrintWriter: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with PrintWriter: " + e.getMessage());
        }
    }

    /**
     * Method 5: Writing to a file using Files class (Java NIO)
     */
    private static void writeWithFilesNIO() {
        String filePath = "example_files\\files_nio_example.txt";
        Path path = Paths.get(filePath);

        // Create a list of lines to write
        List<String> lines = Arrays.asList(
                "Line 1: This file was created using Files class from Java NIO.",
                "Line 2: Files.write() is a convenient method for writing text.",
                "Line 3: It handles opening and closing the file automatically.",
                "Line 4: It's part of the modern Java NIO API."
        );

        try {
            // Write all lines at once
            Files.write(path, lines, StandardCharsets.UTF_8);

            System.out.println("Successfully wrote to file using Files.write(): " + filePath);

            // Alternative: write a single string
            String singleFilePath = "example_files\\files_nio_string_example.txt";
            Path singlePath = Paths.get(singleFilePath);
            String content = "This is a single string written using Files.writeString() method.\n" +
                    "This method is available in Java 11 and later.";

            try {
                Files.writeString(singlePath, content, StandardCharsets.UTF_8);
                System.out.println("Successfully wrote to file using Files.writeString(): " + singleFilePath);
            } catch (NoSuchMethodError | UnsupportedOperationException e) {
                // Fallback for Java versions before 11
                Files.write(singlePath, content.getBytes(StandardCharsets.UTF_8));
                System.out.println("Successfully wrote to file using Files.write() (fallback): " + singleFilePath);
            }

        } catch (IOException e) {
            System.err.println("Error writing with Files: " + e.getMessage());
        }
    }

    /**
     * Method 6: Appending to an existing file
     */
    private static void appendToFile() {
        String filePath = "example_files\\append_example.txt";

        // First, create the file with initial content
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Initial content of the file.\n");
            writer.write("This will be here before we append more content.\n\n");
            System.out.println("Created initial file for append demonstration: " + filePath);
        } catch (IOException e) {
            System.err.println("Error creating initial file: " + e.getMessage());
            return;
        }

        // Method 6.1: Append using FileWriter
        try (FileWriter writer = new FileWriter(filePath, true)) { // true = append mode
            writer.write("This content was appended using FileWriter in append mode.\n");
            writer.write("FileWriter can be opened in append mode by passing 'true' as the second parameter.\n\n");
            System.out.println("Appended to file using FileWriter");
        } catch (IOException e) {
            System.err.println("Error appending with FileWriter: " + e.getMessage());
        }

        // Method 6.2: Append using Files.write with StandardOpenOption.APPEND
        Path path = Paths.get(filePath);
        List<String> linesToAppend = Arrays.asList(
                "This content was appended using Files.write with APPEND option.",
                "Files.write can append by specifying StandardOpenOption.APPEND.",
                "This is the modern way to append to files in Java."
        );

        try {
            Files.write(path, linesToAppend, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            System.out.println("Appended to file using Files.write with APPEND option");
        } catch (IOException e) {
            System.err.println("Error appending with Files.write: " + e.getMessage());
        }
    }
}