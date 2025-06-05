package com.softserve.academy.edu17.fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * This class demonstrates working with file attributes and metadata in Java:
 * - Reading basic file attributes (size, timestamps, etc.)
 * - Setting file timestamps
 * - Working with file permissions
 * - Getting file owner information
 * - Using the Java NIO.2 API for file attributes
 */
public class FileAttributesExample {

    public static void main(String[] args) {
        System.out.println("===== FILE ATTRIBUTES AND METADATA =====\n");

        // Create a directory for our examples
        String dirPath = "example_files\\attribute_examples";
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Create a test file
        String filePath = dirPath + "\\test_file.txt";
        Path path = Paths.get(filePath);

        try {
            // Create or overwrite the file
            Files.writeString(path, "This is a test file for demonstrating file attributes.");
            System.out.println("Created test file: " + path.toAbsolutePath());

            // 1. Basic file attributes using File class (legacy API)
            basicFileAttributes(filePath);

            // 2. Basic file attributes using NIO.2 API
            basicFileAttributesNIO(path);

            // 3. Setting file timestamps
            setFileTimestamps(path);

            // 4. File permissions
            filePermissions(path);

            // 5. File owner information
            fileOwnerInfo(path);

            // 6. DOS attributes (Windows-specific)
            dosAttributes(path);

            // 7. POSIX attributes (Unix/Linux-specific) - will only work on those systems
            posixAttributes(path);

        } catch (IOException e) {
            System.err.println("Error working with file attributes: " + e.getMessage());
        }

        System.out.println("\nAll file attribute operations completed.");
    }

    /**
     * Demonstrates basic file attributes using the legacy File class
     */
    private static void basicFileAttributes(String filePath) {
        System.out.println("\n--- Basic File Attributes (File class) ---");

        File file = new File(filePath);

        System.out.println("File exists: " + file.exists());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is hidden: " + file.isHidden());

        // Format timestamps
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Last modified time
        LocalDateTime lastModified = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(file.lastModified()),
                ZoneId.systemDefault());
        System.out.println("Last modified: " + formatter.format(lastModified));

        // Permissions
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Can execute: " + file.canExecute());
    }

    /**
     * Demonstrates basic file attributes using the NIO.2 API
     */
    private static void basicFileAttributesNIO(Path path) {
        System.out.println("\n--- Basic File Attributes (NIO.2 API) ---");

        try {
            // Get basic attributes
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("File size: " + attrs.size() + " bytes");
            System.out.println("Is directory: " + attrs.isDirectory());
            System.out.println("Is regular file: " + attrs.isRegularFile());
            System.out.println("Is symbolic link: " + attrs.isSymbolicLink());
            System.out.println("Is other: " + attrs.isOther());

            // Format timestamps
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // File times
            LocalDateTime creationTime = LocalDateTime.ofInstant(
                    attrs.creationTime().toInstant(),
                    ZoneId.systemDefault());
            LocalDateTime lastAccessTime = LocalDateTime.ofInstant(
                    attrs.lastAccessTime().toInstant(),
                    ZoneId.systemDefault());
            LocalDateTime lastModifiedTime = LocalDateTime.ofInstant(
                    attrs.lastModifiedTime().toInstant(),
                    ZoneId.systemDefault());

            System.out.println("Creation time: " + formatter.format(creationTime));
            System.out.println("Last access time: " + formatter.format(lastAccessTime));
            System.out.println("Last modified time: " + formatter.format(lastModifiedTime));

        } catch (IOException e) {
            System.err.println("Error reading basic file attributes: " + e.getMessage());
        }
    }

    /**
     * Demonstrates setting file timestamps
     */
    private static void setFileTimestamps(Path path) {
        System.out.println("\n--- Setting File Timestamps ---");

        try {
            // Get current attributes
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

            // Create a time in the past (1 day ago)
            FileTime pastTime = FileTime.from(
                    Instant.now().minusSeconds(24 * 60 * 60));

            // Set last modified time
            Files.setLastModifiedTime(path, pastTime);
            System.out.println("Set last modified time to 1 day ago");

            // Read the updated time
            BasicFileAttributes updatedAttrs = Files.readAttributes(path, BasicFileAttributes.class);
            LocalDateTime updatedTime = LocalDateTime.ofInstant(
                    updatedAttrs.lastModifiedTime().toInstant(),
                    ZoneId.systemDefault());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("Updated last modified time: " + formatter.format(updatedTime));

        } catch (IOException e) {
            System.err.println("Error setting file timestamps: " + e.getMessage());
        }
    }

    /**
     * Demonstrates working with file permissions
     */
    private static void filePermissions(Path path) {
        System.out.println("\n--- File Permissions ---");

        try {
            // Get current permissions
            Set<PosixFilePermission> permissions = null;
            try {
                permissions = Files.getPosixFilePermissions(path);
                System.out.println("Current POSIX permissions: " + permissions);
            } catch (UnsupportedOperationException e) {
                System.out.println("POSIX file permissions not supported on this file system");
            }

            // Check if file is readable/writable/executable using NIO
            System.out.println("Is readable: " + Files.isReadable(path));
            System.out.println("Is writable: " + Files.isWritable(path));
            System.out.println("Is executable: " + Files.isExecutable(path));

            // Set file permissions using legacy API (as an example)
            File file = path.toFile();
            boolean setReadable = file.setReadable(true, false); // readable by all
            boolean setWritable = file.setWritable(true, true);  // writable only by owner
            boolean setExecutable = file.setExecutable(false);   // not executable

            System.out.println("Set readable by all: " + setReadable);
            System.out.println("Set writable only by owner: " + setWritable);
            System.out.println("Set not executable: " + setExecutable);

        } catch (IOException e) {
            System.err.println("Error working with file permissions: " + e.getMessage());
        }
    }

    /**
     * Demonstrates getting file owner information
     */
    private static void fileOwnerInfo(Path path) {
        System.out.println("\n--- File Owner Information ---");

        try {
            // Get file owner
            UserPrincipal owner = Files.getOwner(path);
            System.out.println("File owner: " + owner.getName());

            // Get file system and user principal lookup
            FileSystem fs = path.getFileSystem();
            UserPrincipalLookupService lookupService = fs.getUserPrincipalLookupService();

            // This part is commented out as it would actually change the file owner
            // and requires elevated privileges
            /*
            try {
                // Look up a user principal by name
                UserPrincipal newOwner = lookupService.lookupPrincipalByName("newowner");
                
                // Set the new owner
                Files.setOwner(path, newOwner);
                System.out.println("Changed owner to: " + newOwner.getName());
            } catch (UserPrincipalNotFoundException e) {
                System.out.println("User not found: " + e.getMessage());
            }
            */

        } catch (IOException e) {
            System.err.println("Error getting file owner: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Getting file owner not supported on this file system: " + e.getMessage());
        }
    }

    /**
     * Demonstrates working with DOS attributes (Windows-specific)
     */
    private static void dosAttributes(Path path) {
        System.out.println("\n--- DOS Attributes (Windows-specific) ---");

        try {
            // Try to read DOS attributes
            try {
                DosFileAttributes dosAttrs = Files.readAttributes(path, DosFileAttributes.class);

                System.out.println("Archive: " + dosAttrs.isArchive());
                System.out.println("Hidden: " + dosAttrs.isHidden());
                System.out.println("Read-only: " + dosAttrs.isReadOnly());
                System.out.println("System: " + dosAttrs.isSystem());

                // Set the file as read-only
                Files.setAttribute(path, "dos:readonly", true);
                System.out.println("Set file as read-only");

                // Verify the change
                boolean isReadOnly = (boolean) Files.getAttribute(path, "dos:readonly");
                System.out.println("Is read-only now: " + isReadOnly);

                // Set it back to writable
                Files.setAttribute(path, "dos:readonly", false);
                System.out.println("Set file back to writable");

            } catch (UnsupportedOperationException e) {
                System.out.println("DOS attributes not supported on this file system");
            }

        } catch (IOException e) {
            System.err.println("Error working with DOS attributes: " + e.getMessage());
        }
    }

    /**
     * Demonstrates working with POSIX attributes (Unix/Linux-specific)
     * This will only work on Unix/Linux systems
     */
    private static void posixAttributes(Path path) {
        System.out.println("\n--- POSIX Attributes (Unix/Linux-specific) ---");

        try {
            // Try to read POSIX attributes
            try {
                PosixFileAttributes posixAttrs = Files.readAttributes(path, PosixFileAttributes.class);

                System.out.println("Owner: " + posixAttrs.owner().getName());
                System.out.println("Group: " + posixAttrs.group().getName());
                System.out.println("Permissions: " + posixAttrs.permissions());

                // Example of setting permissions (commented out)
                /*
                Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
                Files.setPosixFilePermissions(path, perms);
                System.out.println("Set permissions to: rw-r--r--");
                */

            } catch (UnsupportedOperationException e) {
                System.out.println("POSIX attributes not supported on this file system");
            }

        } catch (IOException e) {
            System.err.println("Error working with POSIX attributes: " + e.getMessage());
        }
    }
}