package pl.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javastart.model.Value;

@Controller
public class MainController {

    @PostMapping( params ="add")
    public String calculateAdd(@ModelAttribute Value value, Model model){
        model.addAttribute("value",value.getX()+value.getY());
        return "success";
    }

    @PostMapping( params ="sub")
    public String calculateSub(@ModelAttribute Value value, Model model){
        model.addAttribute("value",value.getX()-value.getY());
        return "success";
    }

    @PostMapping( params ="mul")
    public String calculateMul(@ModelAttribute Value value, Model model){
        model.addAttribute("value",value.getX()*value.getY());
        return "success";
    }

    @PostMapping( params ="div")
    public String calculateDiv(@ModelAttribute Value value, Model model){
        double wynik  = (double)value.getX() /value.getY();
        model.addAttribute("value",wynik);
        return "success";
    }


}
