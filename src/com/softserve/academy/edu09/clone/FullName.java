package com.softserve.academy.edu09.clone;

/**
 * FullName class represents a person's full name with first and last name components.
 * This class implements the Cloneable interface to support object cloning.
 */
public class FullName implements Cloneable {
    private String firstName;
    private String lastName;


    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Method to clone the FullName object.
     * This method creates a copy of the FullName object.
     * It uses the clone() method from the Object class to create a shallow copy.
     * Since firstName and lastName are immutable String objects, a shallow copy is enough.
     * 
     * @return A clone of this FullName object
     * @throws AssertionError if cloning is not supported (should not happen as this class implements Cloneable)
     */
    @Override
    public FullName clone() {
        try {
            // Call the Object.clone() method and cast the result to FullName
            return (FullName) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since we implement Cloneable
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
