package com.example.payup.Controllers;

import com.example.payup.models.Company;
import com.example.payup.models.data.CompanyDao;
import com.example.payup.models.data.ServicesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pay-up/dashboard")
public class DashboardController {

    @Autowired
    private CompanyDao companydao;

    @Autowired
    private ServicesDao servicesdao;


    @RequestMapping(value = "")
    public String index (Model model) {
        model.addAttribute("title", "Dashboard");
        model.addAttribute("companies", companydao.findAll());
        model.addAttribute("services", servicesdao.findAll());
        return "dashboard/main";
    }


}








