package com.example.payup.Controllers;

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




