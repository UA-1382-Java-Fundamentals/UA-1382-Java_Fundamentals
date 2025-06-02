package com.softserve.academy.edu14;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class demonstrates the combined usage of flatMap with both Streams and Optional.
 * It shows practical examples of how these concepts can be used together to solve
 * real-world problems in a clean and functional way.
 */
public class CombinedFlatMapExample {
    public static void main(String[] args) {
        // Example 1: Finding all courses for students with valid enrollments
        System.out.println("Example 1: Finding all courses for students with valid enrollments");
        
        // Create a list of students with their enrollments
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList(
                        new Enrollment("CS101", "Computer Science", true),
                        new Enrollment("MATH201", "Mathematics", true)
                )),
                new Student("Bob", Arrays.asList(
                        new Enrollment("PHYS101", "Physics", false),  // Invalid enrollment
                        new Enrollment("CHEM101", "Chemistry", true)
                )),
                new Student("Charlie", null),  // Student with no enrollments
                new Student("Diana", Arrays.asList(
                        new Enrollment("BIO101", "Biology", true),
                        new Enrollment("CS101", "Computer Science", true)  // Duplicate course
                ))
        );
        
        // Find all unique valid course names across all students
        List<String> allValidCourses = students.stream()
                // First, get Optional<List<Enrollment>> for each student
                .map(Student::getEnrollments)
                // Convert Optional<List<Enrollment>> to Stream<List<Enrollment>>, filtering out empty Optionals
                .flatMap(Optional::stream)
                // Convert each List<Enrollment> to Stream<Enrollment>
                .flatMap(List::stream)
                // Filter only valid enrollments
                .filter(Enrollment::isValid)
                // Extract course names
                .map(Enrollment::getCourseName)
                // Remove duplicates
                .distinct()
                // Sort alphabetically
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("All valid courses: " + allValidCourses);
        
        // Example 2: Finding departments with active projects
        System.out.println("\nExample 2: Finding departments with active projects");
        
        // Create a list of departments with their projects
        List<Department> departments = Arrays.asList(
                new Department("Engineering", Arrays.asList(
                        new Project("Project A", true),
                        new Project("Project B", false)
                )),
                new Department("Marketing", null),  // Department with no projects
                new Department("HR", Arrays.asList(
                        new Project("Project C", true),
                        new Project("Project D", true)
                ))
        );
        
        // Find all departments with at least one active project
        List<String> departmentsWithActiveProjects = departments.stream()
                // For each department, try to find if it has active projects
                .filter(department -> 
                        // Get Optional<List<Project>>
                        department.getProjects()
                                // If present, check if any project is active
                                .map(projects -> 
                                        projects.stream()
                                                .anyMatch(Project::isActive)
                                )
                                // If no projects, return false
                                .orElse(false)
                )
                .map(Department::getName)
                .collect(Collectors.toList());
        
        System.out.println("Departments with active projects: " + departmentsWithActiveProjects);
        
        // Example 3: Finding all phone numbers for contacts in a given city
        System.out.println("\nExample 3: Finding all phone numbers for contacts in a given city");
        
        // Create a map of users with their contact information
        Map<String, User> users = new HashMap<>();
        users.put("user1", new User("Alice", new ContactInfo("New York", 
                Arrays.asList("123-456-7890", "098-765-4321"))));
        users.put("user2", new User("Bob", new ContactInfo("Boston", 
                Arrays.asList("111-222-3333"))));
        users.put("user3", new User("Charlie", null));  // User with no contact info
        users.put("user4", new User("Diana", new ContactInfo("New York", null)));  // User with no phone numbers
        
        // Find all phone numbers for users in New York
        String targetCity = "New York";
        List<String> phoneNumbersInCity = users.values().stream()
                // Get Optional<ContactInfo> for each user
                .map(User::getContactInfo)
                // Convert to Stream<ContactInfo>, filtering out empty Optionals
                .flatMap(Optional::stream)
                // Filter contacts in the target city
                .filter(contact -> targetCity.equals(contact.getCity()))
                // Get Optional<List<String>> of phone numbers
                .map(ContactInfo::getPhoneNumbers)
                // Convert to Stream<List<String>>, filtering out empty Optionals
                .flatMap(Optional::stream)
                // Convert each List<String> to Stream<String>
                .flatMap(List::stream)
                .collect(Collectors.toList());
        
        System.out.println("Phone numbers in " + targetCity + ": " + phoneNumbersInCity);
    }
    
    // Student class
    static class Student {
        private String name;
        private List<Enrollment> enrollments;
        
        public Student(String name, List<Enrollment> enrollments) {
            this.name = name;
            this.enrollments = enrollments;
        }
        
        public String getName() {
            return name;
        }
        
        // Return Optional to handle null enrollments
        public Optional<List<Enrollment>> getEnrollments() {
            return Optional.ofNullable(enrollments);
        }
    }
    
    // Enrollment class
    static class Enrollment {
        private String courseId;
        private String courseName;
        private boolean isValid;
        
        public Enrollment(String courseId, String courseName, boolean isValid) {
            this.courseId = courseId;
            this.courseName = courseName;
            this.isValid = isValid;
        }
        
        public String getCourseId() {
            return courseId;
        }
        
        public String getCourseName() {
            return courseName;
        }
        
        public boolean isValid() {
            return isValid;
        }
    }
    
    // Department class
    static class Department {
        private String name;
        private List<Project> projects;
        
        public Department(String name, List<Project> projects) {
            this.name = name;
            this.projects = projects;
        }
        
        public String getName() {
            return name;
        }
        
        // Return Optional to handle null projects
        public Optional<List<Project>> getProjects() {
            return Optional.ofNullable(projects);
        }
    }
    
    // Project class
    static class Project {
        private String name;
        private boolean active;
        
        public Project(String name, boolean active) {
            this.name = name;
            this.active = active;
        }
        
        public String getName() {
            return name;
        }
        
        public boolean isActive() {
            return active;
        }
    }
    
    // User class
    static class User {
        private String name;
        private ContactInfo contactInfo;
        
        public User(String name, ContactInfo contactInfo) {
            this.name = name;
            this.contactInfo = contactInfo;
        }
        
        public String getName() {
            return name;
        }
        
        // Return Optional to handle null contact info
        public Optional<ContactInfo> getContactInfo() {
            return Optional.ofNullable(contactInfo);
        }
    }
    
    // ContactInfo class
    static class ContactInfo {
        private String city;
        private List<String> phoneNumbers;
        
        public ContactInfo(String city, List<String> phoneNumbers) {
            this.city = city;
            this.phoneNumbers = phoneNumbers;
        }
        
        public String getCity() {
            return city;
        }
        
        // Return Optional to handle null phone numbers
        public Optional<List<String>> getPhoneNumbers() {
            return Optional.ofNullable(phoneNumbers);
        }
    }
}