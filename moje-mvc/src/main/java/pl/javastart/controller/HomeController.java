package pl.javastart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.model.Value;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeController(Model model){
        model.addAttribute("text","Moje mvc");
        model.addAttribute("value",new Value());
        return "index";
    }
}
