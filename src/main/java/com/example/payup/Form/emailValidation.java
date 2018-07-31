package com.example.payup.Form;

class emailvalidation {
    public void emailValidation(String email) {
        boolean valid = true;
        String specialChar = "@";
        if (!email.matches(specialChar)) {
            System.out.println("Email should contain @ symbol");
            valid = false;
            if (valid) {
                System.out.println("Email is valid.");


            }

        }
    }
}