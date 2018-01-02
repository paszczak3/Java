package pl.javastart.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pl.javastart.model.City;
import pl.javastart.repository.CityRepository;

@Controller
@RequestMapping("/city")
public class CityController {

    private CityRepository cityRepo;

    @Autowired
    public CityController(CityRepository cityRepo) {
        this.cityRepo = cityRepo;
    }

    @GetMapping
    public String listCities(Model model) {
        List<City> cities = cityRepo.findAll();
        model.addAttribute("cityList", cities);
        return "list";
    }

    @PostMapping
    public String addCity(@ModelAttribute City cityModel, RedirectAttributes redirectAttr) {
        cityRepo.save(cityModel);
        redirectAttr.addFlashAttribute("message", "City added successfuly");
        return "redirect:/";
    }
}