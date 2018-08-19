package com.example.payup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pay-up/dashboard")
public class DashboardController {


    @RequestMapping(value = "")
    public String index(Model model) {
        //model.addAttribute("company", companydao.findAll());
        model.addAttribute("title", "Dashboard");
        return "dashboard/main";
    }

}








