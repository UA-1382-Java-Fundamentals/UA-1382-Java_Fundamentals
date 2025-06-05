package com.softserve.academy.edu17.fileio;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * This class demonstrates using try-with-resources for file operations in Java:
 * - Basic try-with-resources usage
 * - Managing multiple resources
 * - Comparison with traditional try-finally blocks
 * - Custom AutoCloseable resources
 * - Handling exceptions during close operations
 */
public class TryWithResourcesExample {

    public static void main(String[] args) {
        System.out.println("===== TRY-WITH-RESOURCES EXAMPLES =====\n");

        // Create directory for our examples
        String dirPath = "example_files\\try_with_resources";
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 1. Basic try-with-resources example
        String basicFilePath = dirPath + "\\basic_example.txt";
        basicTryWithResources(basicFilePath);

        // 2. Multiple resources example
        String multipleResourcesFilePath = dirPath + "\\multiple_resources.txt";
        String compressedFilePath = dirPath + "\\compressed_file.gz";
        multipleResources(multipleResourcesFilePath, compressedFilePath);

        // 3. Comparison with traditional try-finally
        String traditionalFilePath = dirPath + "\\traditional_example.txt";
        comparisonWithTraditional(traditionalFilePath);

        // 4. Custom AutoCloseable resource
        customAutoCloseable();

        // 5. Exception handling in try-with-resources
        String exceptionFilePath = dirPath + "\\exception_example.txt";
        exceptionHandling(exceptionFilePath);

        System.out.println("\nAll try-with-resources examples completed.");
    }

    /**
     * Demonstrates basic usage of try-with-resources
     */
    private static void basicTryWithResources(String filePath) {
        System.out.println("\n--- Basic Try-With-Resources Example ---");

        // Write to a file using try-with-resources
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("This file was created using try-with-resources.\n");
            writer.write("The FileWriter will be automatically closed when the try block exits.\n");
            writer.write("This happens whether the try block exits normally or due to an exception.\n");

            System.out.println("Successfully wrote to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file using try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("\nFile content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        // The resources (FileWriter and BufferedReader) are automatically closed
        // when their respective try blocks exit
    }

    /**
     * Demonstrates using multiple resources in a single try-with-resources statement
     */
    private static void multipleResources(String textFilePath, String compressedFilePath) {
        System.out.println("\n--- Multiple Resources Example ---");

        // Write to a file and compress it in one operation
        try (
                // Create a writer for the text file
                FileWriter writer = new FileWriter(textFilePath);

                // Create a stream for the compressed file
                FileOutputStream fileOut = new FileOutputStream(compressedFilePath);
                GZIPOutputStream gzipOut = new GZIPOutputStream(fileOut);
                OutputStreamWriter gzipWriter = new OutputStreamWriter(gzipOut)
        ) {
            // Write to both files
            String content = "This content is being written to two files simultaneously.\n" +
                    "One is a plain text file, and the other is compressed with GZIP.\n" +
                    "All resources will be automatically closed in reverse order of creation.";

            writer.write(content);
            gzipWriter.write(content);

            System.out.println("Successfully wrote to both files:");
            System.out.println("- Text file: " + textFilePath);
            System.out.println("- Compressed file: " + compressedFilePath);

        } catch (IOException e) {
            System.err.println("Error writing to files: " + e.getMessage());
        }

        // Resources are closed in reverse order:
        // 1. gzipWriter
        // 2. gzipOut
        // 3. fileOut
        // 4. writer
    }

    /**
     * Compares try-with-resources with traditional try-finally blocks
     */
    private static void comparisonWithTraditional(String filePath) {
        System.out.println("\n--- Comparison with Traditional Try-Finally ---");

        // Example 1: Traditional try-finally approach
        FileWriter traditionalWriter = null;
        try {
            traditionalWriter = new FileWriter(filePath);
            traditionalWriter.write("This file was written using the traditional try-finally approach.\n");
            traditionalWriter.write("The writer must be explicitly closed in the finally block.\n");
            traditionalWriter.write("This approach is more verbose and error-prone.\n");

            System.out.println("Successfully wrote to file using traditional approach: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file (traditional): " + e.getMessage());
        } finally {
            // Must explicitly close the resource
            if (traditionalWriter != null) {
                try {
                    traditionalWriter.close();
                } catch (IOException e) {
                    System.err.println("Error closing writer (traditional): " + e.getMessage());
                }
            }
        }

        // Example 2: Try-with-resources approach (for comparison)
        try (FileWriter modernWriter = new FileWriter(filePath + ".modern")) {
            modernWriter.write("This file was written using the try-with-resources approach.\n");
            modernWriter.write("The writer is automatically closed when the try block exits.\n");
            modernWriter.write("This approach is more concise and less error-prone.\n");

            System.out.println("Successfully wrote to file using modern approach: " + filePath + ".modern");
        } catch (IOException e) {
            System.err.println("Error writing to file (modern): " + e.getMessage());
        }

        // Compare the two approaches
        System.out.println("\nComparison:");
        System.out.println("- Traditional: More verbose, requires explicit closing in finally block");
        System.out.println("- Try-with-resources: More concise, automatically closes resources");
        System.out.println("- Try-with-resources handles exceptions during close better");
        System.out.println("- Try-with-resources is the recommended approach since Java 7");
    }

    /**
     * Demonstrates creating and using a custom AutoCloseable resource
     */
    private static void customAutoCloseable() {
        System.out.println("\n--- Custom AutoCloseable Resource ---");

        // Use our custom resource in a try-with-resources block
        try (DatabaseConnection connection = new DatabaseConnection("example_db")) {
            connection.executeQuery("SELECT * FROM example_table");
            // The connection will be automatically closed
        } catch (Exception e) {
            System.err.println("Error with database connection: " + e.getMessage());
        }
    }

    /**
     * Demonstrates exception handling in try-with-resources
     */
    private static void exceptionHandling(String filePath) {
        System.out.println("\n--- Exception Handling in Try-With-Resources ---");

        // Create a problematic file path to demonstrate exception handling
        String nonExistentDir = "non_existent_directory";
        String problematicPath = nonExistentDir + "\\file.txt";

        // Example 1: Exception during the try block
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("This is normal content.\n");

            // Simulate an exception
            if (true) {
                throw new RuntimeException("Simulated exception during try block");
            }

            // This line will not be executed
            writer.write("This line will not be written due to the exception.\n");
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
            // The writer is still closed automatically
        }

        // Example 2: Exception during resource creation
        try (FileWriter writer = new FileWriter(problematicPath)) {
            // This block will not execute if the FileWriter constructor throws an exception
            writer.write("This will not be executed.\n");
        } catch (IOException e) {
            System.err.println("Caught exception during resource creation: " + e.getMessage());
        }

        // Example 3: Exception during close
        try (ProblematicResource resource = new ProblematicResource()) {
            System.out.println("Using problematic resource...");
            // The resource will throw an exception when closed
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }

        // Example 4: Suppressed exceptions
        try (ProblematicResource resource = new ProblematicResource()) {
            System.out.println("Using problematic resource before throwing an exception...");
            throw new RuntimeException("Primary exception");
            // The close() exception will be suppressed
        } catch (Exception e) {
            System.err.println("Caught primary exception: " + e.getMessage());

            // Get and display suppressed exceptions
            Throwable[] suppressed = e.getSuppressed();
            if (suppressed.length > 0) {
                System.err.println("Suppressed exceptions:");
                for (Throwable t : suppressed) {
                    System.err.println("- " + t.getMessage());
                }
            }
        }
    }

    /**
     * A custom class that implements AutoCloseable for use with try-with-resources
     */
    private static class DatabaseConnection implements AutoCloseable {
        private final String dbName;
        private boolean isOpen;

        public DatabaseConnection(String dbName) {
            this.dbName = dbName;
            this.isOpen = true;
            System.out.println("Database connection opened: " + dbName);
        }

        public void executeQuery(String query) {
            if (!isOpen) {
                throw new IllegalStateException("Connection is closed");
            }
            System.out.println("Executing query on " + dbName + ": " + query);
        }

        @Override
        public void close() {
            if (isOpen) {
                isOpen = false;
                System.out.println("Database connection closed: " + dbName);
            }
        }
    }

    /**
     * A resource that throws an exception when closed
     */
    private static class ProblematicResource implements AutoCloseable {
        public ProblematicResource() {
            System.out.println("ProblematicResource created");
        }

        @Override
        public void close() throws Exception {
            System.out.println("ProblematicResource about to throw exception during close()");
            throw new Exception("Exception during close operation");
        }
    }
}