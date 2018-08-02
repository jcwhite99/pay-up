package com.example.payup.Controllers;

import com.example.payup.Models.Forms.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String getRegisterForm() {
        return "register";
    }
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register(@ModelAttribute(name="RegisterForm") RegisterForm registerForm, Model model) {

        String username = registerForm.getUsername();
        String password = registerForm.getPassword();
        String confirmPassword = registerForm.getConfirmPassword();
        String email = registerForm.getEmail();


        if("admin".equals(username) && "admin".equals(password) && "admin".equals(confirmPassword) && "admin".equals(email)){
            return "login";
        }

        model.addAttribute("invalidCredentials", true);

        return "Home/register";



    }

}



