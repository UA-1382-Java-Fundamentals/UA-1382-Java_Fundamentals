package com.softserve.academy.edu14;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates the use of flatMap with Optional in Java.
 * flatMap is particularly useful with Optional when you have methods that return Optional
 * and you want to chain operations without nested Optional objects.
 */
public class OptionalFlatMapExample {
    public static void main(String[] args) {
        // Example 1: Basic Optional flatMap usage
        System.out.println("Example 1: Basic Optional flatMap");
        
        // Create a user that might or might not have an address
        User user = new User("John", 
                new Address("123 Main St", "New York", "10001"));
        
        // Without flatMap - would need to check each Optional separately
        Optional<User> optUser = Optional.of(user);
        if (optUser.isPresent()) {
            Optional<Address> optAddress = optUser.get().getAddress();
            if (optAddress.isPresent()) {
                System.out.println("City: " + optAddress.get().getCity());
            }
        }
        
        // With flatMap - chain operations on Optional values
        String city = Optional.of(user)
                .flatMap(User::getAddress)  // Returns Optional<Address> instead of Optional<Optional<Address>>
                .map(Address::getCity)      // Extract city from Address
                .orElse("Unknown city");
        System.out.println("City using flatMap: " + city);
        
        // Example 2: Handling a chain of Optional dependencies
        System.out.println("\nExample 2: Chain of Optional dependencies");
        
        // Create a database of users and their orders
        Map<String, User> userDb = new HashMap<>();
        userDb.put("user1", new User("Alice", new Address("456 Oak St", "Boston", "02108")));
        userDb.put("user2", new User("Bob", null)); // User without address
        
        // Find user by ID and get their zip code
        String userId = "user1";
        String zipCode = findUserById(userDb, userId)
                .flatMap(User::getAddress)
                .map(Address::getZipCode)
                .orElse("No zip code available");
        System.out.println("Zip code for user " + userId + ": " + zipCode);
        
        // Try with a user that has no address
        userId = "user2";
        zipCode = findUserById(userDb, userId)
                .flatMap(User::getAddress)
                .map(Address::getZipCode)
                .orElse("No zip code available");
        System.out.println("Zip code for user " + userId + ": " + zipCode);
        
        // Try with a non-existent user
        userId = "user3";
        zipCode = findUserById(userDb, userId)
                .flatMap(User::getAddress)
                .map(Address::getZipCode)
                .orElse("No zip code available");
        System.out.println("Zip code for user " + userId + ": " + zipCode);
        
        // Example 3: Practical example - Parsing and converting values
        System.out.println("\nExample 3: Parsing and converting values");
        
        // Parse string to integer, then double the value if successful
        String numStr = "42";
        Integer result = parseToInt(numStr)
                .flatMap(OptionalFlatMapExample::doubleTheValue)
                .orElse(-1);
        System.out.println("Parsed and doubled: " + result);
        
        // Try with an invalid number
        numStr = "not a number";
        result = parseToInt(numStr)
                .flatMap(OptionalFlatMapExample::doubleTheValue)
                .orElse(-1);
        System.out.println("Parsed and doubled (invalid input): " + result);
    }
    
    // Helper method to find a user by ID
    private static Optional<User> findUserById(Map<String, User> userDb, String userId) {
        return Optional.ofNullable(userDb.get(userId));
    }
    
    // Helper method to parse string to integer
    private static Optional<Integer> parseToInt(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
    
    // Helper method that returns an Optional
    private static Optional<Integer> doubleTheValue(Integer value) {
        if (value > 100) {
            return Optional.empty(); // Demonstrate returning empty for certain conditions
        }
        return Optional.of(value * 2);
    }
    
    // User class with Optional Address
    static class User {
        private String name;
        private Address address;
        
        public User(String name, Address address) {
            this.name = name;
            this.address = address;
        }
        
        public String getName() {
            return name;
        }
        
        // Return Optional<Address> to handle null addresses
        public Optional<Address> getAddress() {
            return Optional.ofNullable(address);
        }
    }
    
    // Address class
    static class Address {
        private String street;
        private String city;
        private String zipCode;
        
        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }
        
        public String getStreet() {
            return street;
        }
        
        public String getCity() {
            return city;
        }
        
        public String getZipCode() {
            return zipCode;
        }
    }
}