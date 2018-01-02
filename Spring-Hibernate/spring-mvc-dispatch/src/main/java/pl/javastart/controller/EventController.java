package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.component.EventHolder;
import pl.javastart.model.Participant;

@Controller
public class EventController {
   private EventHolder eventHolder;

   @Autowired
    public EventController(EventHolder eventHolder) {
        this.eventHolder = eventHolder;
    }

    @PostMapping("/register")
    public String registration(@RequestParam String firstName,
                             @RequestParam String lastName) {
        Participant participant = new Participant(firstName,lastName);
        if(eventHolder.checkRegistration(participant) == true) {
            return "redirect:error";
        } else {
            eventHolder.addParticipant(participant);
            return "redirect:succes";
        }
    }

    @GetMapping("/succes")
    public String addProduct(){
       return "succes";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/show")
    public String show(){
        for(Participant p: eventHolder.getParticipants()) {
            System.out.print(p);
        }
        return "redirect:/";
    }


}
