package com.softserve.academy.edu17.fileio;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class demonstrates basic file operations:
 * - Creating files and directories
 * - Checking if files exist
 * - Getting file information (size, last modified, etc.)
 * - Listing directory contents
 * - Deleting files
 */
public class FileBasicOperationsExample {

    public static void main(String[] args) {
        // Define file paths
        String directoryPath = "example_files";
        String filePath = directoryPath + "\\test_file.txt";

        // Create File objects
        File directory = new File(directoryPath);
        File file = new File(filePath);

        try {
            // Create directory if it doesn't exist
            if (!directory.exists()) {
                boolean created = directory.mkdir();
                System.out.println("Directory created: " + created);
            } else {
                System.out.println("Directory already exists");
            }

            // Create a new file
            if (!file.exists()) {
                boolean created = file.createNewFile();
                System.out.println("File created: " + created);
            } else {
                System.out.println("File already exists");
            }

            // Get file information
            System.out.println("\nFile Information:");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Name: " + file.getName());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can execute: " + file.canExecute());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is hidden: " + file.isHidden());

            // Format last modified date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Last modified: " + sdf.format(new Date(file.lastModified())));

            // List directory contents
            System.out.println("\nDirectory contents:");
            File[] files = directory.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName() + (f.isDirectory() ? " (dir)" : " (file)"));
                }
            }

            // Rename file
            File renamedFile = new File(directoryPath + "\\renamed_file.txt");
            boolean renamed = file.renameTo(renamedFile);
            System.out.println("\nFile renamed: " + renamed);

            // Delete files (commented out to preserve examples)
            // boolean deleted = renamedFile.delete();
            // System.out.println("File deleted: " + deleted);
            // boolean dirDeleted = directory.delete(); // Only works if directory is empty
            // System.out.println("Directory deleted: " + dirDeleted);

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}