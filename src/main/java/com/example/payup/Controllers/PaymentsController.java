package com.example.payup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pay-up/payments")
public class PaymentsController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Pay-Up! Payments");
        return "home/payments";

    }
}