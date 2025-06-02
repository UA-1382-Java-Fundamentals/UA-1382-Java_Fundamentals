package com.softserve.academy.edu13;

public class Security {
    public boolean checkAccess(String user, int level) {
        // Simulate a security check
        return level >= 3;
    }
}

@FunctionalInterface
interface SecurityCheck {
    boolean check(String user, int level);
}
/**
 * Reference to an instance method
 */
class SecurityDemo {
    public static void main(String[] args) {
        Security security = new Security();

        SecurityCheck check = (user, level) -> security.checkAccess(user, level);
        SecurityCheck check2 = security::checkAccess; // Method reference

        System.out.println("Access granted: " + check.check("Alice", 4));
        System.out.println("Access granted: " + check2.check("Bob", 2));
    }
}
