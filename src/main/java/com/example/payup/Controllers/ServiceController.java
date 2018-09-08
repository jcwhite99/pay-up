package com.example.payup.Controllers;

import com.example.payup.models.data.ServiceDao;
import com.example.payup.models.Service;
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
@RequestMapping("/pay-up/service")
public class ServiceController {

    @Autowired
    private ServiceDao servicedao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddServiceForm(Model model) {
        model.addAttribute("title", "Add Service");
        model.addAttribute(new Service());
        return "service/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddServiceForm(@ModelAttribute @Valid Service newService,
                                        Errors errors, Model model) {
        //System.out.println(errors);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Service");
            model.addAttribute("service", newService);
            return "redirect:/service/add";
        }

        servicedao.save(newService);
        return "redirect:" + "/pay-up/dashboard";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveServiceForm(Model model) {
        model.addAttribute("services", servicedao.findAll());
        model.addAttribute("title", "Remove Service");
        return "service/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveServiceForm(@RequestParam int [] serviceIds){

        for(int serviceId : serviceIds){
            servicedao.delete(serviceId);
        }

        return "redirect:" + "/pay-up/dashboard";

    }

}


