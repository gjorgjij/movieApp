package com.example.movieApp.controller;

import com.example.movieApp.service.UserService;
import com.example.movieApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/new")
//    public String addNewUser(@RequestBody User user) {
//        return userService.addUser(user);
//    }
}
