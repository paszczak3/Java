package pl.adres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.adres.data.InformationRepository;
import pl.adres.model.Information;
import pl.adres.model.Value;
import pl.adres.model.ValueCalculate;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Controller
public class MainController {

    ValueCalculate valueCalculate = new ValueCalculate();
    private InformationRepository informationRepository;
    private Validator validator;

    @Autowired
    public MainController(InformationRepository informationRepository, Validator validator) {
        this.informationRepository = informationRepository;
        this.validator = validator;
    }

    @PostMapping(params = "rejestracja")
    public String rejestracja(@ModelAttribute Information information, Model model){
        model.addAttribute("text","logowanie");
        Set<ConstraintViolation<Information>> errors = validator.validate(information);

        if(errors.isEmpty()) {
            if (informationRepository.findFirstByLogin(information.getLogin()) == null &&
                    informationRepository.findFirstByEmail(information.getEmail()) == null) {

                informationRepository.save(information);
            } else {
                System.out.println("taki nick lub email juz isteneje");
                model.addAttribute("text", "Rejestracja");
                return "index";
            }
        } else {
            System.out.println("podales zle dane");
            model.addAttribute("text", "Rejestracja");
            return "index";
        }
       // informationRepository.save(information);
        model.addAttribute("information",new Information());
        return "zaloguj";
    }

    @PostMapping(params = "logowanie")
    public String logowanie(@ModelAttribute Information information, Model model){
        List<Information> informationList = informationRepository.findAll();

        for(int i = 0; i<informationList.size(); i++) {
            if(informationList.get(i).getLogin().equals(information.getLogin()) &&
                    informationList.get(i).getPassword().equals(information.getPassword())) {
                model.addAttribute("text","Witaj w kalkulatorze :" + information.getLogin());
                model.addAttribute("value", new Value());
                return "kalkulator";
            }
        }

        model.addAttribute("text","logowanie");
        return "zaloguj";
    }

    @GetMapping("/rejestracja")
    public String rejestracja(Model model){
        model.addAttribute("text", "Rejestracja");
        model.addAttribute("information",new Information());
        return "index";
    }

    @GetMapping("logowanie")
    public String logowanie2(Model model){
        model.addAttribute("text","logowanie");
        model.addAttribute("information",new Information());
        return "zaloguj";
    }

    @GetMapping("wyloguj")
    public String wyloguj(Model model){
        model.addAttribute("text","logowanie");
        model.addAttribute("information", new Information());
        return "zaloguj";
    }



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
        valueCalculate.calculateDiv(value.getX(),value.getY());
        model.addAttribute("value", valueCalculate.getCalculate());
        return "success";
    }




}
