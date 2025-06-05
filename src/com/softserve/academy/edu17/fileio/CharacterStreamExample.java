package com.softserve.academy.edu17.fileio;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates working with character streams in Java:
 * - Using Reader and Writer classes
 * - Working with different character encodings
 * - Comparing character streams vs byte streams for text
 * - Using specialized character stream classes
 * - Handling line-oriented text
 */
public class CharacterStreamExample {

    public static void main(String[] args) {
        System.out.println("===== CHARACTER STREAM OPERATIONS =====\n");

        // Create directory for our examples
        String dirPath = "example_files\\character_examples";
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 1. Basic character stream operations
        String basicFilePath = dirPath + "\\basic_text.txt";
        writeWithFileWriter(basicFilePath);
        readWithFileReader(basicFilePath);

        // 2. Buffered character streams
        String bufferedFilePath = dirPath + "\\buffered_text.txt";
        writeWithBufferedWriter(bufferedFilePath);
        readWithBufferedReader(bufferedFilePath);

        // 3. Working with different character encodings
        String encodingFilePath = dirPath + "\\encoding_example.txt";
        workWithEncodings(encodingFilePath);

        // 4. Character streams vs byte streams for text
        String comparisonFilePath = dirPath + "\\stream_comparison.txt";
        compareCharacterAndByteStreams(comparisonFilePath);

        // 5. Using PrintWriter for formatted output
        String printWriterFilePath = dirPath + "\\print_writer.txt";
        useWithPrintWriter(printWriterFilePath);

        // 6. Using StringReader and StringWriter
        useStringReaderWriter();

        // 7. Line-oriented operations
        String lineFilePath = dirPath + "\\line_oriented.txt";
        lineOrientedOperations(lineFilePath);

        System.out.println("\nAll character stream operations completed.");
    }

    /**
     * Writes text using FileWriter
     */
    private static void writeWithFileWriter(String filePath) {
        System.out.println("\n--- Writing with FileWriter ---");

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("This is a simple text file.\n");
            writer.write("FileWriter is a character stream class for writing text.\n");
            writer.write("It uses the default character encoding of the system.\n");

            System.out.println("Successfully wrote text using FileWriter to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with FileWriter: " + e.getMessage());
        }
    }

    /**
     * Reads text using FileReader
     */
    private static void readWithFileReader(String filePath) {
        System.out.println("\n--- Reading with FileReader ---");

        try (FileReader reader = new FileReader(filePath)) {
            char[] buffer = new char[100];
            int charsRead;
            StringBuilder content = new StringBuilder();

            while ((charsRead = reader.read(buffer)) != -1) {
                content.append(buffer, 0, charsRead);
            }

            System.out.println("Content read with FileReader:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.err.println("Error reading with FileReader: " + e.getMessage());
        }
    }

    /**
     * Writes text using BufferedWriter
     */
    private static void writeWithBufferedWriter(String filePath) {
        System.out.println("\n--- Writing with BufferedWriter ---");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This file was written using BufferedWriter.");
            writer.newLine();
            writer.write("BufferedWriter is more efficient for writing large amounts of text.");
            writer.newLine();
            writer.write("It buffers the characters, reducing the number of I/O operations.");
            writer.newLine();
            writer.write("It also provides the convenient newLine() method.");

            System.out.println("Successfully wrote text using BufferedWriter to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing with BufferedWriter: " + e.getMessage());
        }
    }

    /**
     * Reads text using BufferedReader
     */
    private static void readWithBufferedReader(String filePath) {
        System.out.println("\n--- Reading with BufferedReader ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Content read with BufferedReader (line by line):");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading with BufferedReader: " + e.getMessage());
        }
    }

    /**
     * Demonstrates working with different character encodings
     */
    private static void workWithEncodings(String filePath) {
        System.out.println("\n--- Working with Character Encodings ---");

        // Text with non-ASCII characters
        String text = "Hello, World! Special characters: äöüßÄÖÜ€";

        // List of encodings to demonstrate
        List<Charset> encodings = Arrays.asList(
                StandardCharsets.UTF_8,
                StandardCharsets.UTF_16,
                StandardCharsets.ISO_8859_1,
                StandardCharsets.US_ASCII);

        for (Charset charset : encodings) {
            String encodedFilePath = filePath + "." + charset.name();

            // Write using specific encoding
            try (Writer writer = new OutputStreamWriter(
                    new FileOutputStream(encodedFilePath), charset)) {

                writer.write(text);
                System.out.println("Wrote text using " + charset.name() + " encoding");

                // Get file size
                File file = new File(encodedFilePath);
                System.out.println("File size: " + file.length() + " bytes");

            } catch (IOException e) {
                System.err.println("Error writing with " + charset.name() + ": " + e.getMessage());
                continue;
            }

            // Read using the same encoding
            try (Reader reader = new InputStreamReader(
                    new FileInputStream(encodedFilePath), charset)) {

                char[] buffer = new char[100];
                int charsRead = reader.read(buffer);
                String readText = new String(buffer, 0, charsRead);

                System.out.println("Read text using " + charset.name() + ": " + readText);
                System.out.println("Text matches original: " + text.equals(readText));

            } catch (IOException e) {
                System.err.println("Error reading with " + charset.name() + ": " + e.getMessage());
            }

            // Read using a different encoding (to show encoding mismatch)
            if (!charset.equals(StandardCharsets.UTF_8)) {
                try (Reader reader = new InputStreamReader(
                        new FileInputStream(encodedFilePath), StandardCharsets.UTF_8)) {

                    char[] buffer = new char[100];
                    int charsRead = reader.read(buffer);
                    String readText = new String(buffer, 0, charsRead);

                    System.out.println("Read with encoding mismatch (UTF-8): " + readText);
                    System.out.println("Text matches original: " + text.equals(readText));

                } catch (IOException e) {
                    System.err.println("Error reading with encoding mismatch: " + e.getMessage());
                }
            }

            System.out.println();
        }
    }

    /**
     * Compares character streams and byte streams for text handling
     */
    private static void compareCharacterAndByteStreams(String filePath) {
        System.out.println("\n--- Character Streams vs Byte Streams for Text ---");

        // Text with non-ASCII characters
        String text = "Hello, World! Special characters: äöüßÄÖÜ€";

        // Write using character stream (FileWriter)
        try (FileWriter writer = new FileWriter(filePath + ".char")) {
            writer.write(text);
            System.out.println("Wrote text using character stream (FileWriter)");
        } catch (IOException e) {
            System.err.println("Error writing with character stream: " + e.getMessage());
        }

        // Write using byte stream (FileOutputStream)
        try (FileOutputStream out = new FileOutputStream(filePath + ".byte")) {
            // Convert string to bytes using default encoding
            byte[] bytes = text.getBytes();
            out.write(bytes);
            System.out.println("Wrote text using byte stream (FileOutputStream)");
        } catch (IOException e) {
            System.err.println("Error writing with byte stream: " + e.getMessage());
        }

        // Read using character stream (FileReader)
        try (FileReader reader = new FileReader(filePath + ".char")) {
            char[] buffer = new char[100];
            int charsRead = reader.read(buffer);
            String readText = new String(buffer, 0, charsRead);

            System.out.println("Read with character stream: " + readText);
            System.out.println("Text matches original: " + text.equals(readText));
        } catch (IOException e) {
            System.err.println("Error reading with character stream: " + e.getMessage());
        }

        // Read using byte stream (FileInputStream)
        try (FileInputStream in = new FileInputStream(filePath + ".byte")) {
            byte[] buffer = new byte[100];
            int bytesRead = in.read(buffer);
            String readText = new String(buffer, 0, bytesRead);

            System.out.println("Read with byte stream: " + readText);
            System.out.println("Text matches original: " + text.equals(readText));
        } catch (IOException e) {
            System.err.println("Error reading with byte stream: " + e.getMessage());
        }
    }

    /**
     * Demonstrates using PrintWriter for formatted output
     */
    private static void useWithPrintWriter(String filePath) {
        System.out.println("\n--- Using PrintWriter ---");

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("This is a line written with println().");
            writer.print("This is text written with print(). ");
            writer.print("It continues on the same line.");
            writer.println();

            // Formatted output
            writer.printf("Formatted output: %d, %s, %.2f%n", 42, "text", 3.14159);

            // Write an array of values
            int[] numbers = {1, 2, 3, 4, 5};
            writer.println("Array values:");
            for (int num : numbers) {
                writer.println(num);
            }

            System.out.println("Successfully wrote text using PrintWriter to: " + filePath);

            // Read and display the content
            readAndDisplayFile(filePath);
        } catch (IOException e) {
            System.err.println("Error using PrintWriter: " + e.getMessage());
        }
    }

    /**
     * Demonstrates using StringReader and StringWriter
     */
    private static void useStringReaderWriter() {
        System.out.println("\n--- Using StringReader and StringWriter ---");

        // Create a StringWriter
        StringWriter stringWriter = new StringWriter();

        // Write to the StringWriter
        try (PrintWriter writer = new PrintWriter(stringWriter)) {
            writer.println("This text is written to a StringWriter.");
            writer.println("StringWriter writes to an internal string buffer.");
            writer.println("It's useful for generating string content programmatically.");
        }

        // Get the resulting string
        String result = stringWriter.toString();
        System.out.println("Content from StringWriter:");
        System.out.println(result);

        // Create a StringReader from the result
        try (StringReader reader = new StringReader(result);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            System.out.println("\nReading from StringReader:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error using StringReader: " + e.getMessage());
        }
    }

    /**
     * Demonstrates line-oriented text operations
     */
    private static void lineOrientedOperations(String filePath) {
        System.out.println("\n--- Line-Oriented Text Operations ---");

        // Create a list of lines
        List<String> lines = Arrays.asList(
                "Line 1: This is the first line.",
                "Line 2: This is the second line.",
                "Line 3: This is the third line.",
                "Line 4: This is the fourth line.",
                "Line 5: This is the fifth line."
        );

        // Write lines using Files.write
        try {
            Path path = Paths.get(filePath);
            Files.write(path, lines, StandardCharsets.UTF_8);
            System.out.println("Wrote lines to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing lines: " + e.getMessage());
            return;
        }

        // Read all lines at once using Files.readAllLines
        try {
            Path path = Paths.get(filePath);
            List<String> readLines = Files.readAllLines(path, StandardCharsets.UTF_8);

            System.out.println("\nRead all lines at once:");
            for (int i = 0; i < readLines.size(); i++) {
                System.out.println("Line " + (i + 1) + ": " + readLines.get(i));
            }
        } catch (IOException e) {
            System.err.println("Error reading all lines: " + e.getMessage());
        }

        // Process lines one by one using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("\nProcessing lines one by one:");
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                // Example processing: count words in each line
                String[] words = line.split("\\s+");
                System.out.println("Line " + lineCount + " has " + words.length + " words");
            }

            System.out.println("Total lines processed: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error processing lines: " + e.getMessage());
        }
    }

    /**
     * Helper method to read and display file content
     */
    private static void readAndDisplayFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("\nFile content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}