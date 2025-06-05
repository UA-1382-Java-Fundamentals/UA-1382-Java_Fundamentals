package com.softserve.academy.edu17.fileio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Random;
import java.util.zip.*;

/**
 * This class demonstrates working with binary files in Java:
 * - Reading and writing primitive data types
 * - Using DataInputStream and DataOutputStream
 * - Working with byte arrays
 * - Using NIO ByteBuffer and FileChannel
 * - Compressing binary data
 * - Calculating checksums
 */
public class BinaryFileExample {

    public static void main(String[] args) {
        System.out.println("===== BINARY FILE OPERATIONS =====\n");

        // Create directory for our examples
        String dirPath = "example_files\\binary_examples";
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 1. Writing and reading primitive data types
        String dataFilePath = dirPath + "\\primitive_data.bin";
        writePrimitiveData(dataFilePath);
        readPrimitiveData(dataFilePath);

        // 2. Working with byte arrays
        String byteArrayFilePath = dirPath + "\\byte_array.bin";
        writeByteArray(byteArrayFilePath);
        readByteArray(byteArrayFilePath);

        // 3. Using NIO ByteBuffer and FileChannel
        String channelFilePath = dirPath + "\\channel_data.bin";
        writeWithChannel(channelFilePath);
        readWithChannel(channelFilePath);

        // 4. Compressing binary data
        String originalFilePath = dirPath + "\\original_data.bin";
        String compressedFilePath = dirPath + "\\compressed_data.gz";
        String decompressedFilePath = dirPath + "\\decompressed_data.bin";
        compressBinaryData(originalFilePath, compressedFilePath);
        decompressBinaryData(compressedFilePath, decompressedFilePath);

        // 5. Calculating checksums
        String checksumFilePath = dirPath + "\\checksum_data.bin";
        writeWithChecksum(checksumFilePath);

        System.out.println("\nAll binary file operations completed.");
    }

    /**
     * Writes primitive data types to a binary file using DataOutputStream
     */
    private static void writePrimitiveData(String filePath) {
        System.out.println("\n--- Writing Primitive Data Types ---");

        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filePath)))) {

            // Write various primitive types
            dos.writeBoolean(true);
            dos.writeByte(127);
            dos.writeShort(32767);
            dos.writeInt(2147483647);
            dos.writeLong(9223372036854775807L);
            dos.writeFloat(3.14159f);
            dos.writeDouble(2.71828);
            dos.writeChar('A');
            dos.writeUTF("Hello, Binary World!");

            System.out.println("Successfully wrote primitive data to: " + filePath);
            System.out.println("File size: " + new File(filePath).length() + " bytes");

        } catch (IOException e) {
            System.err.println("Error writing primitive data: " + e.getMessage());
        }
    }

    /**
     * Reads primitive data types from a binary file using DataInputStream
     */
    private static void readPrimitiveData(String filePath) {
        System.out.println("\n--- Reading Primitive Data Types ---");

        try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filePath)))) {

            // Read various primitive types in the same order they were written
            boolean boolValue = dis.readBoolean();
            byte byteValue = dis.readByte();
            short shortValue = dis.readShort();
            int intValue = dis.readInt();
            long longValue = dis.readLong();
            float floatValue = dis.readFloat();
            double doubleValue = dis.readDouble();
            char charValue = dis.readChar();
            String stringValue = dis.readUTF();

            // Display the read values
            System.out.println("Boolean: " + boolValue);
            System.out.println("Byte: " + byteValue);
            System.out.println("Short: " + shortValue);
            System.out.println("Int: " + intValue);
            System.out.println("Long: " + longValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Char: " + charValue);
            System.out.println("String: " + stringValue);

        } catch (IOException e) {
            System.err.println("Error reading primitive data: " + e.getMessage());
        }
    }

    /**
     * Writes a byte array to a binary file
     */
    private static void writeByteArray(String filePath) {
        System.out.println("\n--- Writing Byte Array ---");

        try (FileOutputStream fos = new FileOutputStream(filePath)) {

            // Create a random byte array
            byte[] data = new byte[1024]; // 1KB of data
            new Random().nextBytes(data);

            // Write the byte array to the file
            fos.write(data);

            System.out.println("Successfully wrote " + data.length + " bytes to: " + filePath);

        } catch (IOException e) {
            System.err.println("Error writing byte array: " + e.getMessage());
        }
    }

    /**
     * Reads a byte array from a binary file
     */
    private static void readByteArray(String filePath) {
        System.out.println("\n--- Reading Byte Array ---");

        File file = new File(filePath);
        byte[] data = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(file)) {

            // Read the entire file into the byte array
            int bytesRead = fis.read(data);

            System.out.println("Successfully read " + bytesRead + " bytes from: " + filePath);
            System.out.println("First 10 bytes (hex): " + bytesToHex(data, 0, Math.min(10, data.length)));

        } catch (IOException e) {
            System.err.println("Error reading byte array: " + e.getMessage());
        }
    }

    /**
     * Writes data using NIO FileChannel and ByteBuffer
     */
    private static void writeWithChannel(String filePath) {
        System.out.println("\n--- Writing with NIO Channel ---");

        Path path = Paths.get(filePath);

        try (FileChannel channel = FileChannel.open(path,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            // Create a ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB buffer

            // Put some data into the buffer
            buffer.putInt(42);
            buffer.putDouble(Math.PI);
            buffer.put("NIO Channel Example".getBytes());

            // Prepare the buffer for reading (by the channel)
            buffer.flip();

            // Write the buffer to the channel
            int bytesWritten = channel.write(buffer);

            System.out.println("Successfully wrote " + bytesWritten + " bytes using NIO channel to: " + filePath);

        } catch (IOException e) {
            System.err.println("Error writing with NIO channel: " + e.getMessage());
        }
    }

    /**
     * Reads data using NIO FileChannel and ByteBuffer
     */
    private static void readWithChannel(String filePath) {
        System.out.println("\n--- Reading with NIO Channel ---");

        Path path = Paths.get(filePath);

        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)) {

            // Create a ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB buffer

            // Read from the channel into the buffer
            int bytesRead = channel.read(buffer);

            // Prepare the buffer for reading (by our code)
            buffer.flip();

            // Read the data from the buffer
            int intValue = buffer.getInt();
            double doubleValue = buffer.getDouble();

            // Read the remaining bytes as a string
            byte[] stringBytes = new byte[buffer.remaining()];
            buffer.get(stringBytes);
            String stringValue = new String(stringBytes);

            System.out.println("Successfully read " + bytesRead + " bytes using NIO channel from: " + filePath);
            System.out.println("Int value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("String value: " + stringValue);

        } catch (IOException e) {
            System.err.println("Error reading with NIO channel: " + e.getMessage());
        }
    }

    /**
     * Compresses binary data using GZIP
     */
    private static void compressBinaryData(String originalFilePath, String compressedFilePath) {
        System.out.println("\n--- Compressing Binary Data ---");

        // First, create some sample data
        try {
            // Create a 100KB file with random data
            byte[] randomData = new byte[100 * 1024]; // 100KB
            new Random().nextBytes(randomData);
            Files.write(Paths.get(originalFilePath), randomData);
            System.out.println("Created sample file of size: " + randomData.length + " bytes");
        } catch (IOException e) {
            System.err.println("Error creating sample data: " + e.getMessage());
            return;
        }

        // Now compress the data
        try (GZIPOutputStream gzipOut = new GZIPOutputStream(
                new FileOutputStream(compressedFilePath));
             FileInputStream fileIn = new FileInputStream(originalFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            // Read from the input file and write to the GZIP output stream
            while ((bytesRead = fileIn.read(buffer)) != -1) {
                gzipOut.write(buffer, 0, bytesRead);
            }

            gzipOut.finish();

            // Compare file sizes
            long originalSize = new File(originalFilePath).length();
            long compressedSize = new File(compressedFilePath).length();
            double compressionRatio = (double) originalSize / compressedSize;

            System.out.println("Original size: " + originalSize + " bytes");
            System.out.println("Compressed size: " + compressedSize + " bytes");
            System.out.println("Compression ratio: " + String.format("%.2f", compressionRatio) + "x");

        } catch (IOException e) {
            System.err.println("Error compressing data: " + e.getMessage());
        }
    }

    /**
     * Decompresses GZIP compressed binary data
     */
    private static void decompressBinaryData(String compressedFilePath, String decompressedFilePath) {
        System.out.println("\n--- Decompressing Binary Data ---");

        try (GZIPInputStream gzipIn = new GZIPInputStream(
                new FileInputStream(compressedFilePath));
             FileOutputStream fileOut = new FileOutputStream(decompressedFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            // Read from the GZIP input stream and write to the output file
            while ((bytesRead = gzipIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            // Verify the decompressed file size
            long decompressedSize = new File(decompressedFilePath).length();
            System.out.println("Decompressed size: " + decompressedSize + " bytes");

            // Verify that the decompressed file matches the original
            boolean filesMatch = compareFiles(Paths.get("example_files\\binary_examples\\original_data.bin"),
                    Paths.get(decompressedFilePath));
            System.out.println("Decompressed file matches original: " + filesMatch);

        } catch (IOException e) {
            System.err.println("Error decompressing data: " + e.getMessage());
        }
    }

    /**
     * Writes data with a checksum
     */
    private static void writeWithChecksum(String filePath) {
        System.out.println("\n--- Writing with Checksum ---");

        try (FileOutputStream fos = new FileOutputStream(filePath);
             CheckedOutputStream checkedOut = new CheckedOutputStream(fos, new CRC32());
             DataOutputStream dos = new DataOutputStream(checkedOut)) {

            // Write some data
            for (int i = 0; i < 100; i++) {
                dos.writeInt(i);
            }

            // Get the checksum value
            long checksum = checkedOut.getChecksum().getValue();

            System.out.println("Successfully wrote data with checksum: " + checksum);
            System.out.println("File size: " + new File(filePath).length() + " bytes");

            // Verify the data by reading it back
            verifyChecksumData(filePath, checksum);

        } catch (IOException e) {
            System.err.println("Error writing with checksum: " + e.getMessage());
        }
    }

    /**
     * Verifies data with a checksum
     */
    private static void verifyChecksumData(String filePath, long expectedChecksum) {
        System.out.println("\n--- Verifying Checksum Data ---");

        try (FileInputStream fis = new FileInputStream(filePath);
             CheckedInputStream checkedIn = new CheckedInputStream(fis, new CRC32());
             DataInputStream dis = new DataInputStream(checkedIn)) {

            // Read all the data
            for (int i = 0; i < 100; i++) {
                int value = dis.readInt();
                if (i < 5) {
                    System.out.println("Read value #" + i + ": " + value);
                }
            }

            // Get the calculated checksum
            long calculatedChecksum = checkedIn.getChecksum().getValue();

            System.out.println("Expected checksum: " + expectedChecksum);
            System.out.println("Calculated checksum: " + calculatedChecksum);
            System.out.println("Checksums match: " + (expectedChecksum == calculatedChecksum));

        } catch (IOException e) {
            System.err.println("Error verifying checksum: " + e.getMessage());
        }
    }

    /**
     * Compares two files to check if they are identical
     */
    private static boolean compareFiles(Path file1, Path file2) throws IOException {
        if (Files.size(file1) != Files.size(file2)) {
            return false;
        }

        byte[] bytes1 = Files.readAllBytes(file1);
        byte[] bytes2 = Files.readAllBytes(file2);
        return Arrays.equals(bytes1, bytes2);
    }

    /**
     * Converts bytes to a hexadecimal string representation
     */
    private static String bytesToHex(byte[] bytes, int offset, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = offset; i < offset + length; i++) {
            sb.append(String.format("%02X ", bytes[i]));
        }
        return sb.toString();
    }
}
