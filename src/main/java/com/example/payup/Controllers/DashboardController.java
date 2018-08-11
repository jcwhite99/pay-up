package com.example.payup.Controllers;

import com.example.payup.models.forms.Services;
import com.example.payup.models.data.ServicesDao;
import com.example.payup.models.forms.Company;
import com.example.payup.models.data.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCompanyForm(Model model) {
        model.addAttribute("title", "Add Company");
        model.addAttribute(new Company ());
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
        return "redirect: dashboard/main";
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

        return "dashboard/main";
    }

    @Autowired
    private ServicesDao servicesdao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddServicesForm(Model model) {
        model.addAttribute("title", "Add Service");
        model.addAttribute(new Services ());
        return "service/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddServicesForm(@ModelAttribute @Valid Services newServices,
                                        Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Service");
            return "service/add";

        }

        servicesdao.save(newServices);
        return "redirect: dashboard/main";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveServiceForm(Model model){
        model.addAttribute("services", servicesdao.findAll());
        model.addAttribute("title", "Remove Service");
        return "services/remove";
    }



    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveServiceForm(@RequestParam String[] Services){

        for(String service : Services){
            servicesdao.delete(service);
        }

        return "dashboard/main";
    }

}






