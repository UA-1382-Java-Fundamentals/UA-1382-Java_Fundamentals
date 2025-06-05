package com.softserve.academy.edu17.fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * This class demonstrates working with paths and directories in Java:
 * - Creating and manipulating Path objects
 * - Working with directories
 * - Copying, moving, and deleting files
 * - Walking directory trees
 * - Using the modern Java NIO.2 API
 */
public class PathAndDirectoryExample {

    public static void main(String[] args) {
        System.out.println("===== PATH AND DIRECTORY OPERATIONS =====\n");

        // Create a base directory for our examples
        String baseDirPath = "example_files\\path_examples";
        createBaseDirectory(baseDirPath);

        // 1. Working with Path objects
        workingWithPaths(baseDirPath);

        // 2. Creating and navigating directories
        workingWithDirectories(baseDirPath);

        // 3. Copying, moving, and deleting files
        fileOperations(baseDirPath);

        // 4. Walking directory trees
        walkDirectoryTree(baseDirPath);

        System.out.println("\nAll path and directory operations completed.");
    }

    /**
     * Creates the base directory for our examples
     */
    private static void createBaseDirectory(String baseDirPath) {
        try {
            Path baseDir = Paths.get(baseDirPath);

            // Create the directory if it doesn't exist
            if (Files.notExists(baseDir)) {
                Files.createDirectories(baseDir);
                System.out.println("Created base directory: " + baseDir.toAbsolutePath());
            } else {
                System.out.println("Base directory already exists: " + baseDir.toAbsolutePath());
            }

            // Create a sample file in the base directory
            Path sampleFile = baseDir.resolve("sample.txt");
            if (Files.notExists(sampleFile)) {
                Files.writeString(sampleFile, "This is a sample file for path operations.");
                System.out.println("Created sample file: " + sampleFile.toAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error creating base directory: " + e.getMessage());
        }
    }

    /**
     * Demonstrates working with Path objects
     */
    private static void workingWithPaths(String baseDirPath) {
        System.out.println("\n--- Working with Path Objects ---");

        // Create a path
        Path path = Paths.get(baseDirPath, "subdir", "file.txt");

        // Get information about the path
        System.out.println("Path: " + path);
        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("Parent: " + path.getParent());
        System.out.println("File name: " + path.getFileName());
        System.out.println("Root: " + path.getRoot());

        // Normalize a path (resolve . and ..)
        Path complexPath = Paths.get(baseDirPath, "subdir", "..", "another", ".");
        System.out.println("Complex path: " + complexPath);
        System.out.println("Normalized path: " + complexPath.normalize());

        // Resolve paths
        Path basePath = Paths.get(baseDirPath);
        Path resolvedPath = basePath.resolve("subdir/file.txt");
        System.out.println("Resolved path: " + resolvedPath);

        // Relativize paths (find relative path between two paths)
        Path pathA = Paths.get(baseDirPath, "a/b/c");
        Path pathB = Paths.get(baseDirPath, "a/d");
        Path relative = pathA.relativize(pathB);
        System.out.println("Relative path from " + pathA + " to " + pathB + ": " + relative);
    }

    /**
     * Demonstrates creating and navigating directories
     */
    private static void workingWithDirectories(String baseDirPath) {
        System.out.println("\n--- Working with Directories ---");

        try {
            Path baseDir = Paths.get(baseDirPath);

            // Create nested directories
            Path nestedDirs = baseDir.resolve("level1/level2/level3");
            Files.createDirectories(nestedDirs);
            System.out.println("Created nested directories: " + nestedDirs);

            // Create some files in different directories
            Files.writeString(baseDir.resolve("level1/file1.txt"), "Content of file1");
            Files.writeString(baseDir.resolve("level1/level2/file2.txt"), "Content of file2");
            Files.writeString(nestedDirs.resolve("file3.txt"), "Content of file3");

            // List contents of a directory
            System.out.println("\nListing directory contents:");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(baseDir.resolve("level1"))) {
                for (Path entry : stream) {
                    System.out.println(entry.getFileName() +
                            (Files.isDirectory(entry) ? " (dir)" : " (file)"));
                }
            }

            // Filter directory contents (only .txt files)
            System.out.println("\nListing only .txt files:");
            try (DirectoryStream<Path> stream =
                         Files.newDirectoryStream(baseDir, "*.txt")) {
                for (Path entry : stream) {
                    System.out.println(entry.getFileName());
                }
            }

            // Check if a directory is empty
            Path emptyDir = baseDir.resolve("empty_dir");
            Files.createDirectories(emptyDir);
            boolean isEmpty = !Files.list(emptyDir).findAny().isPresent();
            System.out.println("\nIs " + emptyDir.getFileName() + " empty? " + isEmpty);

        } catch (IOException e) {
            System.err.println("Error working with directories: " + e.getMessage());
        }
    }

    /**
     * Demonstrates copying, moving, and deleting files
     */
    private static void fileOperations(String baseDirPath) {
        System.out.println("\n--- File Operations (Copy, Move, Delete) ---");

        try {
            Path baseDir = Paths.get(baseDirPath);
            Path sourceFile = baseDir.resolve("source.txt");
            Path targetFile = baseDir.resolve("target.txt");
            Path movedFile = baseDir.resolve("moved.txt");

            // Create a source file
            Files.writeString(sourceFile, "This is the source file content.");
            System.out.println("Created source file: " + sourceFile);

            // Copy the file
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied to: " + targetFile);

            // Move/rename the file
            Files.move(targetFile, movedFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved to: " + movedFile);

            // Delete a file
            Files.delete(movedFile);
            System.out.println("Deleted: " + movedFile);

            // Create a temporary file
            Path tempFile = Files.createTempFile(baseDir, "temp_", ".tmp");
            Files.writeString(tempFile, "This is a temporary file.");
            System.out.println("Created temporary file: " + tempFile);

            // Delete on exit (using old File API as an example)
            File tempFileOldApi = tempFile.toFile();
            tempFileOldApi.deleteOnExit();
            System.out.println("Temporary file will be deleted on JVM exit");

        } catch (IOException e) {
            System.err.println("Error during file operations: " + e.getMessage());
        }
    }

    /**
     * Demonstrates walking a directory tree
     */
    private static void walkDirectoryTree(String baseDirPath) {
        System.out.println("\n--- Walking Directory Tree ---");

        try {
            Path baseDir = Paths.get(baseDirPath);

            // Method 1: Using Files.walk
            System.out.println("\nWalking directory tree using Files.walk:");
            try (Stream<Path> paths = Files.walk(baseDir, 3)) { // Max depth of 3
                paths.forEach(path -> {
                    String type = Files.isDirectory(path) ? "Directory" : "File";
                    System.out.println(type + ": " + baseDir.relativize(path));
                });
            }

            // Method 2: Using FileVisitor
            System.out.println("\nWalking directory tree using FileVisitor:");
            Files.walkFileTree(baseDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    System.out.println("Directory: " + baseDir.relativize(dir));
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    System.out.println("File: " + baseDir.relativize(file));
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    System.err.println("Failed to access: " + file);
                    return FileVisitResult.CONTINUE;
                }
            });

            // Method 3: Find all .txt files
            System.out.println("\nFinding all .txt files:");
            try (Stream<Path> paths = Files.find(baseDir, Integer.MAX_VALUE,
                    (path, attrs) -> path.toString().endsWith(".txt"))) {
                paths.forEach(path -> System.out.println("Found: " + baseDir.relativize(path)));
            }

        } catch (IOException e) {
            System.err.println("Error walking directory tree: " + e.getMessage());
        }
    }
}