package pl.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.model.Article;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("helloMessage","Hello here is Thymeleaf");
        model.addAttribute("formArticle", new Article("some title", "content here", "tag1, tag..."));
        return "index";
    }
}
