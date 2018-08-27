package com.example.payup.Controllers;


import com.example.payup.models.data.ServicesDao;
import com.example.payup.models.Services;
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
@RequestMapping("/pay-up/services")
public class ServicesController {

    @Autowired
    private ServicesDao servicesdao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddServicesForm(Model model) {
        model.addAttribute("title", "Add Services");
        model.addAttribute(new Services());
        return "services/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddServicesForm(@ModelAttribute @Valid Services newServices,
                                         Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Services");
            model.addAttribute("services", newServices);
            return "services/add";

        }

        servicesdao.save(newServices);
        return "redirect:" + "/pay-up/dashboard";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveServiceForm(Model model) {
        model.addAttribute("services", servicesdao.findAll());
        model.addAttribute("title", "Remove Services");
        return "services/remove";
    }

    //@RequestMapping(value = "remove", method = RequestMethod.POST)
    //public String processRemoveServiceForm(@RequestParam int servicesIds){

        //for(int servicesId : servicesIds ){
            //servicesdao.delete(servicesId);
        //}
        //return "dashboard/main";
    }
//}

