package com.example.payup.Models;

import java.util.ArrayList;

class passwordvalidation {

    public void passwordValidation(String userName, String password) {
        boolean valid = true;
        if (password.length() > 15 || password.length() < 8) {
            System.out.println("Password should be less than 15 characters and more than 8 characters in length.");
            valid = false;
        }
        if (password.indexOf(userName) > -1) {
            System.out.println("Password Should not be same as user name");
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            System.out.println("Password should contain at least one upper case letter");
            valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password should contain at least one lower case letter");
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            System.out.println("Password should contain at least one number.");
            valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars)) {
            System.out.println("Password should contain at least one special character");
            valid = false;
        }
        if (valid) {
            System.out.println("Password is valid.");
        }
    }
}
