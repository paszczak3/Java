package pl.adres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.adres.model.Information;

@Controller
public class HomeController {

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String homeController(Model model) {
        model.addAttribute("text", "Rejestracja");
        model.addAttribute("information",new Information());
        return "index";
    }
}
