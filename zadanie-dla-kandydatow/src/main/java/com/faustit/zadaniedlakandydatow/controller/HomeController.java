package com.faustit.zadaniedlakandydatow.controller;

import com.faustit.zadaniedlakandydatow.model.User;
import com.faustit.zadaniedlakandydatow.model.UserGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String homeController(Model model){
        model.addAttribute("groupUser", new UserGroup());
        model.addAttribute("user", new User());
        return "index2";
    }


}
