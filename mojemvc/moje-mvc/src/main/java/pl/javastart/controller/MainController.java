package pl.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javastart.model.Value;
import pl.javastart.model.ValueCalculate;

@Controller
public class MainController {

    ValueCalculate valueCalculate = new ValueCalculate();

    @PostMapping( params ="add")
    public String calculateAdd(@ModelAttribute Value value, Model model){
        valueCalculate.calculateAdd(value.getX(), value.getY());
        model.addAttribute("value",valueCalculate.getCalculate());
        return "success";
    }

    @PostMapping( params ="sub")
    public String calculateSub(@ModelAttribute Value value, Model model){
        valueCalculate.calculateSub(value.getX(), value.getY());
        model.addAttribute("value",valueCalculate.getCalculate());
        return "success";
    }

    @PostMapping( params ="mul")
    public String calculateMul(@ModelAttribute Value value, Model model){
        valueCalculate.calcuateMul(value.getX(),value.getY());
        model.addAttribute("value",valueCalculate.getCalculate());
        return "success";
    }

    @PostMapping( params ="div")
    public String calculateDiv(@ModelAttribute Value value, Model model){
            valueCalculate.calculateDiv(value.getX(), value.getY());
            model.addAttribute("value", valueCalculate.getCalculate());
            return "success";
    }


}
