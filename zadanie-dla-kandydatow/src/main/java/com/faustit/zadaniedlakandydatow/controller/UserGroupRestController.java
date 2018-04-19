package com.faustit.zadaniedlakandydatow.controller;

import com.faustit.zadaniedlakandydatow.data.UserGroupRepository;
import com.faustit.zadaniedlakandydatow.data.UserRepository;
import com.faustit.zadaniedlakandydatow.model.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserGroupRestController {

    private UserRepository userRepository;
    private UserGroupRepository userGroupRepository;

    @Autowired
    public UserGroupRestController(UserRepository userRepository, UserGroupRepository userGroupRepository) {
        this.userRepository = userRepository;
        this.userGroupRepository = userGroupRepository;
    }


    @GetMapping("group/{id}")
    public UserGroup userGroup(@PathVariable Long id){
        return userGroupRepository.findFirstById(id);
    }

    @GetMapping("groups")
    public List<UserGroup> userGroups(){
        List<UserGroup> userGroupList = userGroupRepository.findAll();
        return userGroupList;
    }



}
