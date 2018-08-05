package com.example.payup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("pay-up")
public class HomeController {

    @RequestMapping(value="", method=RequestMethod.GET)
        public String index(Model model) {

            model.addAttribute("title","Pay Up!" );
            return "home/index";
        }
    }
