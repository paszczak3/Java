package pl.paszczak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.paszczak.Calc;


@Controller
public class HomeController {

    @GetMapping("/")
    public String homeController(Model model){
        model.addAttribute("helloMessage", "Pierwszy program sam");
        return "index";
    }


    @PostMapping("/add")
     public String calculate(@ModelAttribute Calc calc, Model model) {
        model.addAttribute("calc",calc);

        return "redirect:/";
   }

    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article formArticle, Model model) {
        if(checkNotEmpty(formArticle)) {
            model.addAttribute("formArticle", formArticle);
            return "success";
        } else
            return "redirect:sorry";
    }

    @GetMapping("/sorry")
    public String error() {
        return "errorMessage";
    }

    private boolean checkNotEmpty(Article article) {
        return (article.getTitle()!=null && article.getTitle().length()>0)
                && (article.getContent()!=null && article.getContent().length()>0);
    }

}
