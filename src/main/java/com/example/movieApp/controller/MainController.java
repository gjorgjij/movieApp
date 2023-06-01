package com.example.movieApp.controller;

import com.example.movieApp.model.User;
import com.example.movieApp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(value = "/users/{userId}/home")
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("")
//    public ModelAndView getMovies(@PathVariable Integer userId){
//        Optional<User> user = userService.findById(userId);
//        if (user.isPresent()) {
//
//        }
//    }
}
