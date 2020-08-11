package com.gerardo.users.Controller;

import java.util.List;

import com.gerardo.users.Service.UserService;
import com.gerardo.users.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired 
    UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable int id){ 
        return userService.findById(id); 
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "Saved";
    }
}