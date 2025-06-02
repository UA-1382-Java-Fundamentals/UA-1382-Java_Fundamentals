package com.softserve.academy.edu14;

import java.util.List;
import java.util.Objects;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}

class UserDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice"),
                new User("Bob"),
                new User("Charlie"),
                new User("Bob"),
                new User("Alice")
        );
        List<User> uniqueUsers = users.stream()
                .distinct()
                .toList();
        System.out.println("Unique users:");
        uniqueUsers.forEach(user -> System.out.println(user.name));
    }
}