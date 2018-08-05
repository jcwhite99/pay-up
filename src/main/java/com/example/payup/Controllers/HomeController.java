package com.example.payup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;



@Controller
@RequestMapping("pay-up")
public class HomeController {

    static ArrayList register= new ArrayList<>();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("title", "Pay Up!");
        return "home/index";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String displayRegisterForm(Model model) {
        model.addAttribute("title", "Register");
        return "home/register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegisterForm(@RequestParam String email, @RequestParam String username,
                                      @RequestParam String password, @RequestParam String confirmPassword) {
        register.add(email);
        register.add(username);
        register.add(password);
        register.add(confirmPassword);
        return "redirect:";
    }
}







