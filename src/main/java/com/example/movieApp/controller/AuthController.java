package com.example.movieApp.controller;

import com.example.movieApp.dto.UserDto;
import com.example.movieApp.service.AuthService;
import com.example.movieApp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    public AuthController(AuthService authService, AuthenticationManager authenticationManager, UserService userService) {
        this.authService = authService;
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new UserDto());
        LOG.debug("LOGIN VIEW");
        return "login";
    }

    // Login form with error
    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        LOG.debug("LOGIN ERROR VIEW");

        return "login";
    }

    @PostMapping("/login-successful")
    public Object loginSuccessful(@Valid UserDto userDto, ModelMap modelMap) {
        modelMap.addAttribute("user", userDto);
        LOG.debug("LOGIN SUCCESSFUL VIEW");
        Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDto.getEmail(), userDto));
        }catch (Exception e) {
            LOG.debug("Exception occurred", e);
            modelMap.addAttribute("user", userDto);
            modelMap.addAttribute("error", e.getMessage());
            return "login";
        }
        if(authService.validateAndLogin(userDto)){
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return new RedirectView("/users/" + userService.findByEmail(userDto.getEmail()).get().getUserId() + "/home");
        }
//        if(authentication.isAuthenticated()){
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            return new RedirectView("/");
//        }
        modelMap.addAttribute("loginError", true);
        modelMap.addAttribute("user", userDto);
        return "login";
    }

}
