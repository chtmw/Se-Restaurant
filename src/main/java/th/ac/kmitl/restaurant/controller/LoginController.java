package th.ac.kmitl.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.restaurant.service.CustomerService;
import th.ac.kmitl.restaurant.model.Customer;

@Controller
@RequestMapping("/login")
public class LoginController {
    private CustomerService customerService;
    public LoginController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public  String getLoginPage(){
        return  "login";
    }

    @PostMapping
    public  String login(@ModelAttribute Customer customer, Model model){
        // 1.check to see if id end pin matched customer info
        Customer matchingCustomer = customerService.checkPin(customer);

        return  "home";
    }
}
