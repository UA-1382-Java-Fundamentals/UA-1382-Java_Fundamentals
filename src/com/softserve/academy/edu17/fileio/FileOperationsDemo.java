package com.softserve.academy.edu17.fileio;

import java.util.Scanner;

/**
 * Main demo class that provides a menu-driven interface to run all the file operation examples.
 * This class serves as an entry point for demonstrating various file operations in Java.
 */
public class FileOperationsDemo {

    public static void main(String[] args) {
        System.out.println("===== JAVA FILE OPERATIONS DEMONSTRATION =====");
        System.out.println("This program demonstrates various file operations in Java.");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("\nEnter your choice (1-8, 0 to exit): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        System.out.println("\nRunning Basic File Operations Example...\n");
                        FileBasicOperationsExample.main(new String[0]);
                        break;
                    case 2:
                        System.out.println("\nRunning File Reading Example...\n");
                        FileReadingExample.main(new String[0]);
                        break;
                    case 3:
                        System.out.println("\nRunning File Writing Example...\n");
                        FileWritingExample.main(new String[0]);
                        break;
                    case 4:
                        System.out.println("\nRunning Path and Directory Example...\n");
                        PathAndDirectoryExample.main(new String[0]);
                        break;
                    case 5:
                        System.out.println("\nRunning File Attributes Example...\n");
                        FileAttributesExample.main(new String[0]);
                        break;
                    case 6:
                        System.out.println("\nRunning Binary File Example...\n");
                        BinaryFileExample.main(new String[0]);
                        break;
                    case 7:
                        System.out.println("\nRunning Character Stream Example...\n");
                        CharacterStreamExample.main(new String[0]);
                        break;
                    case 8:
                        System.out.println("\nRunning Try-With-Resources Example...\n");
                        TryWithResourcesExample.main(new String[0]);
                        break;
                    case 0:
                        exit = true;
                        System.out.println("\nExiting the program. Thank you for exploring Java file operations!");
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please enter a number between 0 and 8.");
                }

                if (!exit) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a number.");
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    /**
     * Displays the main menu of available examples
     */
    private static void displayMenu() {
        System.out.println("\n===== AVAILABLE EXAMPLES =====");
        System.out.println("1. Basic File Operations");
        System.out.println("   - Creating files and directories");
        System.out.println("   - Getting file information");
        System.out.println("   - Listing directory contents");

        System.out.println("\n2. File Reading Operations");
        System.out.println("   - Reading files using different methods");
        System.out.println("   - FileReader, BufferedReader, Scanner, etc.");

        System.out.println("\n3. File Writing Operations");
        System.out.println("   - Writing files using different methods");
        System.out.println("   - FileWriter, BufferedWriter, PrintWriter, etc.");

        System.out.println("\n4. Path and Directory Operations");
        System.out.println("   - Working with Path objects");
        System.out.println("   - Creating and navigating directories");
        System.out.println("   - Walking directory trees");

        System.out.println("\n5. File Attributes and Metadata");
        System.out.println("   - Reading and modifying file attributes");
        System.out.println("   - Working with timestamps, permissions, etc.");

        System.out.println("\n6. Binary File Operations");
        System.out.println("   - Reading and writing binary data");
        System.out.println("   - Working with data types and byte arrays");
        System.out.println("   - Compressing data and calculating checksums");

        System.out.println("\n7. Character Stream Operations");
        System.out.println("   - Working with character streams");
        System.out.println("   - Handling different character encodings");
        System.out.println("   - Line-oriented text operations");

        System.out.println("\n8. Try-With-Resources Examples");
        System.out.println("   - Proper resource management");
        System.out.println("   - Comparison with traditional try-finally");
        System.out.println("   - Exception handling in resource management");

        System.out.println("\n0. Exit");
    }
}