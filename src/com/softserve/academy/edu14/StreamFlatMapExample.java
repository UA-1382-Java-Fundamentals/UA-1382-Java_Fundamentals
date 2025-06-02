package com.softserve.academy.edu14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class demonstrates the use of flatMap operation in Java Streams.
 * flatMap is used to flatten a stream of collections into a single stream of elements.
 */
public class StreamFlatMapExample {
    public static void main(String[] args) {
        // Example 1: Flattening a list of lists
        System.out.println("Example 1: Flattening a list of lists");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        
        // Without flatMap - would get Stream<List<Integer>>
        System.out.println("Lists without flattening:");
        listOfLists.stream()
                .forEach(System.out::println);
        
        // With flatMap - get Stream<Integer>
        System.out.println("Flattened list:");
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)  // Converts each list to a stream and flattens
                .collect(Collectors.toList());
        System.out.println(flattenedList);
        
        // Example 2: Flattening arrays of words into characters
        System.out.println("\nExample 2: Flattening arrays of words into characters");
        String[] words = {"Hello", "World"};
        
        // Without flatMap - would get Stream<String[]>
        System.out.println("Words as arrays of characters:");
        Arrays.stream(words)
                .map(word -> word.split(""))
                .forEach(array -> System.out.println(Arrays.toString(array)));
        
        // With flatMap - get Stream<String> of individual characters
        System.out.println("Flattened characters:");
        List<String> characters = Arrays.stream(words)
                .map(word -> word.split(""))  // Converts words to arrays of characters
                .flatMap(Arrays::stream)      // Flattens arrays into a single stream
                .collect(Collectors.toList());
        System.out.println(characters);
        
        // Example 3: Practical example - Finding all distinct tags from a list of products
        System.out.println("\nExample 3: Finding all distinct tags from products");
        List<Product> products = Arrays.asList(
                new Product("Laptop", Arrays.asList("electronics", "computers", "office")),
                new Product("Phone", Arrays.asList("electronics", "communication", "mobile")),
                new Product("Desk", Arrays.asList("furniture", "office", "home"))
        );
        
        // Get all unique tags across all products
        List<String> allTags = products.stream()
                .flatMap(product -> product.getTags().stream())  // Flatten the list of tags
                .distinct()  // Remove duplicates
                .sorted()    // Sort alphabetically
                .collect(Collectors.toList());
        
        System.out.println("All unique product tags: " + allTags);
    }
    
    // Product class for Example 3
    static class Product {
        private String name;
        private List<String> tags;
        
        public Product(String name, List<String> tags) {
            this.name = name;
            this.tags = tags;
        }
        
        public String getName() {
            return name;
        }
        
        public List<String> getTags() {
            return tags;
        }
        
        @Override
        public String toString() {
            return name + " (tags: " + tags + ")";
        }
    }
}