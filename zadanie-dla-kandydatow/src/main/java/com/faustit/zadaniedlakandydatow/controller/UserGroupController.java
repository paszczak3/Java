package com.faustit.zadaniedlakandydatow.controller;

import com.faustit.zadaniedlakandydatow.data.UserGroupRepository;
import com.faustit.zadaniedlakandydatow.data.UserRepository;
import com.faustit.zadaniedlakandydatow.model.User;
import com.faustit.zadaniedlakandydatow.model.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@Controller
public class UserGroupController {

    private UserGroupRepository userGroupRepository;
    private UserRepository userRepository;

    @Autowired
    public UserGroupController(UserGroupRepository userGroupRepository, UserRepository userRepository) {
        this.userGroupRepository = userGroupRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/addGroup")
    public String addUserGroup(@RequestParam String name){
        if(userGroupRepository.findFirstByName(name) == null) {
            UserGroup userGroup = new UserGroup();
            userGroup.setName(name);
            userGroupRepository.save(userGroup);
            return "redirect:/";
        } else {
            return "redirect:/exist";
        }

    }

    @PostMapping("/addUserToGroup")
    public String addUserToGroup(@RequestParam String nick, @RequestParam String name) {
        User user = userRepository.findFirstByNick(nick);
        UserGroup userGroup = userGroupRepository.findFirstByName(name);
        if(user != null && userGroup != null) {
           user.setUserGroup(userGroup);
           userRepository.save(user);

            return "redirect:/";
        } else {
            return "redirect:/wrongInput";
        }
    }

    @GetMapping("/groupsUser")
    public String groupsUser(Model model){
        List<UserGroup> userGroupList = userGroupRepository.findAll();

        model.addAttribute("allGroups", userGroupList);
        return "groupsUser";
    }


    @PostMapping("/deleteGroup")
    public String deleteGroup(@RequestParam String name){
        if(userGroupRepository.findFirstByName(name) != null) {
            UserGroup userGroup = userGroupRepository.findFirstByName(name);
            userGroupRepository.delete(userGroup);
        } else {
            return "redirect:/fail";
        }
        return "redirect:/";
    }


    @PostMapping("/deleteUserFromGroup")
    public String deleteUserFromGroup(@RequestParam String nick){
        User user = userRepository.findFirstByNick(nick);
        //UserGroup userGroup = userGroupRepository.findFirstByName(user.getUserGroup().getName());
        if(user != null && user.getUserGroup()!= null) {
           // userGroup.removeUser(user);
            //userGroupRepository.save(userGroup);
            user.setUserGroup(null);
            userRepository.save(user);
            return "redirect:/";
        }

        return "redirect:/wrongInput";

    }





}
