package com.example.demo;

public class User {
    private String username;
    private String password;
    private String role; // This could be "Admin", "Bride", or "Groom"

    // Constructor: This "creates" the user in the computer's memory
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // This method formats the user data to be saved into your text file
    @Override
    public String toString() {
        return username + "," + password + "," + role;
    }
}