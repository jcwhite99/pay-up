package com.example.payup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;



@Controller
@RequestMapping(value = "register")
public class  RegisterController {
    static ArrayList<String> register = new ArrayList<>();


    // Request path: /register
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("register", register);
        model.addAttribute("title", "register");
        return "register/index";
    }

    // Request path register/add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayRegisterForm(Model model) {
        model.addAttribute("title", "register");
        return "register/add";

    }

    //Request path: register/add
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddRegisterForm(@RequestParam String email, @RequestParam String username, @RequestParam String psw) {
        register.add(email);
        register.add(username);
        register.add(psw);

        //Redirect to register
        return "redirect:/register";

    }
}

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
        }
    }
}
