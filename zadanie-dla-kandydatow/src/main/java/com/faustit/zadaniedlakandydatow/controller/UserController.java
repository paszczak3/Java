package com.faustit.zadaniedlakandydatow.controller;

import com.faustit.zadaniedlakandydatow.data.UserRepository;
import com.faustit.zadaniedlakandydatow.model.User;
import com.faustit.zadaniedlakandydatow.model.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Controller
public class UserController{

    private UserRepository userRepository;
    private Validator validator;

    @Autowired
    public UserController(UserRepository userRepository, Validator validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user){
        Set<ConstraintViolation<User>> set = validator.validate(user);
        if(set.isEmpty()) {
            userRepository.save(user);
            return "redirect:/";
        } else {
            return "redirect:/wrongInput";
        }
    }


    @PostMapping("/editUser")
    public String editUser(@RequestParam String newNick, @ModelAttribute User user){
        Set<ConstraintViolation<User>> set = validator.validate(user);
        User user1 = userRepository.findFirstByNick(user.getNick());

        if(user1 == null) {
            return "redirect:/fail";
        } else {
            if(set.isEmpty()) {
                if(newNick.equals(user.getNick())) {
                    update(user1,user,newNick);
                    return "redirect:/";
                } else {
                    if(userRepository.findFirstByNick(newNick) == null) {
                        update(user1,user,newNick);
                        return "redirect:/";
                    } else {
                        return "redirect:/exist";
                    }
                }
            } else {
                return "redirect:/wrongInput";
            }
        }
    }


    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam String nick) {
        User user = userRepository.findFirstByNick(nick);

        if(user == null) {
            return "redirect:/fail";
        } else {
            userRepository.delete(user);
            return "redirect:/";
        }

    }

    @GetMapping("/exist")
    public String exist(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("groupUser", new UserGroup());
        model.addAttribute("text", "user/group has existed already");
        return "index2";
    }



    @GetMapping("/fail")
    public String errorDelete(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("groupUser", new UserGroup());
        model.addAttribute("text", "user/group has not existed ");
        return "index2";
    }

    @GetMapping("/wrongInput")
    public String errorUpdate(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("groupUser", new UserGroup());
        model.addAttribute("text", "wrong input");
        return "index2";
    }

    @GetMapping("/listUsers")
    public String listUsers(Model model){
        List<User> userList =  userRepository.findAll();
        model.addAttribute("allUsers", userList);
        return "listUsers";
    }

    public void update(User updatedUser, User detailsUser, String newNick){
        updatedUser.setNick(newNick);
        updatedUser.setFirstName(detailsUser.getFirstName());
        updatedUser.setLastName(detailsUser.getLastName());
        updatedUser.setDate(detailsUser.getDate());
        updatedUser.setPassword(detailsUser.getPassword());
        userRepository.save(updatedUser);
    }


}
