package com.softserve.academy.edu12;

/**
 * A utility class for validating email addresses using regular expressions.
 * It provides methods to check if an email address is valid and to return a descriptive message.
 */
public class EmailValid {

    /**
     * Regular expression pattern for validating email addresses.
     * This pattern checks for:
     * - Alphanumeric characters, dots, underscores, percent signs, plus signs, and hyphens in the local part
     * - Alphanumeric characters, dots, and hyphens in the domain name
     * - A top-level domain with at least 2 characters
     */
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    /**
     * Validates if the provided string is a valid email address.
     *
     * @param email The email address to validate
     * @return true if the email is valid, false otherwise
     * @throws IllegalArgumentException if the email parameter is null
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        return email.matches(EMAIL_REGEX);
    }

    /**
     * Validates an email address and returns a descriptive message.
     *
     * @param email The email address to validate
     * @return A message indicating whether the email is valid or not
     * @throws IllegalArgumentException if the email parameter is null
     */
    public static String validateEmail(String email) {
        if (isValidEmail(email)) {
            return "Valid email address: " + email;
        } else {
            return "Invalid email address: " + email;
        }
    }


    public static void main(String[] args) {

        String validEmail = "user@example.com";
        String invalidEmail = "invalid.email@";

        try {
            System.out.println(validateEmail(validEmail));
            System.out.println(validateEmail(invalidEmail));

            System.out.println("\nDirect validation results:");
            System.out.println("Is '" + validEmail + "' valid? " + isValidEmail(validEmail));
            System.out.println("Is '" + invalidEmail + "' valid? " + isValidEmail(invalidEmail));

            // Demonstrate null handling
            // System.out.println(validateEmail(null)); // Uncomment to see exception handling
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
