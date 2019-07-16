package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

        @RequestMapping("/")
        public String displayMessage(Model model){
        User u = new User("Welcome to Stackroute...");
        model.addAttribute("message",u.getName());
        return "index";

    }

}
