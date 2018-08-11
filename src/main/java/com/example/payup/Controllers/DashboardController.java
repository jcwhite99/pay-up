package com.example.payup.Controllers;

import com.example.payup.models.Company;
import com.example.payup.models.data.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("pay-up/dashboard/main")
public class DashboardController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("title", "Dashboard");
        return "dashboard/main";
    }

    @Autowired
    private CompanyDao companydao;

    @RequestMapping(value = "add")

    public String add(Model model) {
        model.addAttribute("title", "Add Company");
        Company Company = new Company();
        model.addAttribute("Company", Company);
        return "dashboard/companyAdd";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid Company company, Errors errors, String verify) {

        List<Company> sameCompany = companydao.findByCompany(company.getCompany());

        return "dashboard/main";
    }


}


