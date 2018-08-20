package com.example.payup.Controllers;

import com.example.payup.models.data.CompanyDao;
import com.example.payup.models.forms.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/pay-up/company")
public class CompanyController {

    @Autowired
    private CompanyDao companydao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCompanyForm(Model model) {
    model.addAttribute("title", "Add Company");
    model.addAttribute(new Company());
    return "company/add";

}

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCompanyForm(@ModelAttribute @Valid Company newCompany,
                                        Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Company");
            return "company/add";

        }

        companydao.save(newCompany);
        return "redirect:" + "/pay-up/dashboard";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCompanyForm(Model model){
        model.addAttribute("companies", companydao.findAll());
        model.addAttribute("title", "Remove Company");
        return"company/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCompanyForm(@RequestParam int [] companyIds){

        for (int companyId : companyIds){
            companydao.delete(companyId);
        }

        return "/pay-up/dashboard";
    }

}
