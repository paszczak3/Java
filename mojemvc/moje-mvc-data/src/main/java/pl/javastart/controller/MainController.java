package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javastart.model.Value;
import pl.javastart.model.ValueCalculate;
import pl.javastart.repository.ValueRepository;

@Controller
public class MainController {

   // private ValueRepository valueRepository;
    private ValueCalculate valueCalculate = new ValueCalculate();


    /*
    @Autowired
    public MainController(ValueRepository valueRepository) {
        this.valueRepository = valueRepository;
    }
    */

    @PostMapping(params = "add")
    public String calculateAdd(@ModelAttribute Value value, Model model){
        valueCalculate.calculateAdd(value.getX(), value.getY());
        model.addAttribute("value", valueCalculate.getWynik());
      //  valueRepository.save(value);
        return "success";
    }

    @PostMapping(params = "sub")
    public String calculateSub(@ModelAttribute Value value, Model model){
        valueCalculate.calculateSub(value.getX(), value.getY());
        model.addAttribute("value", valueCalculate.getWynik());
       // valueRepository.save(value);
        return "success";
    }

    @PostMapping(params = "mul")
    public String calculateMul(@ModelAttribute Value value, Model model){
        valueCalculate.calculateMul(value.getX(),value.getY());
        model.addAttribute("value",valueCalculate.getWynik());
        //valueRepository.save(value);
        return "success";
    }

    @PostMapping(params = "div")
    public String calculateDiv(@ModelAttribute Value value, Model model){
        double temp = 0;
        temp = (double)value.getX() / value.getY();
        model.addAttribute("value", temp);
       // valueRepository.save(value);
        return "success";
    }

}
