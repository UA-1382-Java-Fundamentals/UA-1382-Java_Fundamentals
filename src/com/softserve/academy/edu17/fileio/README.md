# Java File Operations Examples

This package contains a comprehensive set of examples demonstrating various file operations in Java. It covers
everything from basic file handling to advanced operations like working with binary data, character encodings, and
proper resource management.

## Overview

The examples are organized into several classes, each focusing on a specific aspect of file operations:

1. **FileBasicOperationsExample**: Demonstrates basic file operations like creating files and directories, checking
   existence, getting file information, and listing directory contents.

2. **FileReadingExample**: Shows different methods for reading from files, including FileReader, BufferedReader,
   FileInputStream, Scanner, and the Files class from Java NIO.

3. **FileWritingExample**: Illustrates various approaches to writing to files, including FileWriter, BufferedWriter,
   FileOutputStream, PrintWriter, and the Files class from Java NIO.

4. **PathAndDirectoryExample**: Explores working with paths and directories using the Java NIO Path API, including
   creating, navigating, and manipulating paths and directories.

5. **FileAttributesExample**: Demonstrates reading and modifying file attributes like timestamps, permissions, and
   ownership using both the legacy File class and the newer NIO.2 API.

6. **BinaryFileExample**: Shows how to work with binary files, including reading and writing primitive data types, using
   byte arrays, working with NIO ByteBuffer and FileChannel, compressing data, and calculating checksums.

7. **CharacterStreamExample**: Focuses on character streams, working with different character encodings, comparing
   character streams vs byte streams for text, and handling line-oriented text.

8. **TryWithResourcesExample**: Demonstrates proper resource management using try-with-resources, comparing it with
   traditional try-finally blocks, and handling exceptions during resource management.

## How to Use

The package includes a main demo class `FileOperationsDemo` that provides a menu-driven interface to run any of the
examples. To use it:

1. Run the `FileOperationsDemo` class
2. Select an option from the menu (1-8) to run a specific example
3. Follow the output to see the results of the operations
4. Press Enter to return to the menu after each example
5. Select option 0 to exit the program

## Key Concepts Covered

- File and directory creation, deletion, and manipulation
- Reading and writing text and binary data
- Working with file paths and navigating directory structures
- Handling file attributes and metadata
- Character encodings and text processing
- Binary data handling and compression
- Proper resource management with try-with-resources

## Requirements

- Java 8 or higher (some examples use features from Java 11, but fallbacks are provided)
- Basic understanding of Java I/O concepts

## Notes

- The examples create files in an `example_files` directory in the current working directory
- Some examples demonstrate platform-specific features (like DOS or POSIX attributes) that may not work on all operating
  systems
- Error handling is included in all examples to show proper exception management

## Learning Path

If you're new to Java file operations, it's recommended to go through the examples in order (1 through 8) as they build
on concepts introduced in earlier examples.