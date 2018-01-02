package pl.javastart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javastart.model.Book;

import java.util.Arrays;

@Controller
public class AppController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("book",new Book());
        return "home";
    }

    @GetMapping("/if")
    public String ifExample(Model model){
        model.addAttribute("text","sample text");
        model.addAttribute("a",123);
        model.addAttribute("b",456);
        return "if";
    }

    @GetMapping("/loop")
    public String loopExample(Model model) {
        model.addAttribute("books", Arrays.asList(
                new Book("Ksiazka 1","Autor 1",55.60),
                new Book("Ksiazka 2","Autor 2",22.22),
                new Book("Ksiazka 3","Autor 3",33.33)
        ));
        return "loop";
    }

    @PostMapping("/bookadd")
    public String bookAdd(@ModelAttribute Book book, Model model) {
        model.addAttribute("message", "Book " + book + " added!");
        return "home";
    }

}
