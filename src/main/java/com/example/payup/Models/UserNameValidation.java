package com.example.payup.Models;

import java.util.ArrayList;

class usernamevalidation {
    public void usernameValidation(String userName) {
        boolean valid = true;
        ArrayList<String> username = new ArrayList<>();
        if (userName.length() > 15 || userName.length() < 8) {
            System.out.println("Username should be less than 15 characters and more than 8 characters in length");
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!userName.matches(upperCaseChars)) {
            System.out.println("Username should contain at least one upper case letter");
            valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!userName.matches(lowerCaseChars)) {
            System.out.println("Username should contain at least one lower case letter");
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!userName.matches(numbers)) {
            System.out.println("Username should contain at least one number.");
            valid = false;
            if (valid) {
                System.out.println("Username is valid.");


            }
        }
    }
}