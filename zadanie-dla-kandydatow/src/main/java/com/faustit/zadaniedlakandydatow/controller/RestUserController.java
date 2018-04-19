package com.faustit.zadaniedlakandydatow.controller;

import com.faustit.zadaniedlakandydatow.data.UserRepository;
import com.faustit.zadaniedlakandydatow.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestUserController {

    private UserRepository userRepository;

    @Autowired
    public RestUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findFirstById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/notes")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        User user = userRepository.findFirstById(id);
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser){
        User user = userRepository.findFirstById(id);
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setNick(updatedUser.getNick());
        user.setPassword(updatedUser.getPassword());
        user.setDate(updatedUser.getDate());


        User user1 = userRepository.save(user);
        return user1;
    }
}
