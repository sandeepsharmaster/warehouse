package com.warehouse.auth.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.warehouse.auth.model.FileBucket;
import com.warehouse.auth.model.InvardShipment;
import com.warehouse.auth.model.User;
import com.warehouse.auth.service.SecurityService;
import com.warehouse.auth.service.ShipmentService;
import com.warehouse.auth.service.UserService;
import com.warehouse.auth.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private ShipmentService shipmentService;
    
    
   

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        
       // System.out.println(helloService.getHelloMessage());
        
        System.out.println("Method Called : registration");

        return "registration";
    }
    
    @RequestMapping(value = "/shipment", method = RequestMethod.GET)
    public String shipment(Model model) {
        model.addAttribute("shipmentForm", new InvardShipment());
        
       // System.out.println(helloService.getHelloMessage());
        
        System.out.println("Method Called : shipment");

        return "shipment";
    }
    
    @RequestMapping(value = "/shipment", method = RequestMethod.POST)
    public String saveShipment(@ModelAttribute("shipmentForm") InvardShipment shipmentForm, BindingResult bindingResult, Model model) {
        model.addAttribute("shipmentForm", new InvardShipment());
        
        if (bindingResult.hasErrors()) {
            return "shipment";
        }
        
       // System.out.println(helloService.getHelloMessage());
        
        System.out.println("Method Called : shipment_1");
        System.out.println("Method Called : shipmentService" + shipmentService);
        
        shipmentService.save(shipmentForm);
        
        System.out.println("Method Called : shipment_12");

        return "viewShipment";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        
        System.out.println("Method Called : registration_1");


        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        System.out.println("Method Called : login");
        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
    	
    	 System.out.println("Method Called : welcome");
        return "welcome";
    }
}
