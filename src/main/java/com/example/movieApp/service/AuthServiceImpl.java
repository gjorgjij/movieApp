package com.example.movieApp.service;

import com.example.movieApp.dto.UserDto;
import com.example.movieApp.model.User;
import com.example.movieApp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class AuthServiceImpl implements AuthService {
    private static final Logger LOG = LoggerFactory.getLogger(AuthServiceImpl.class);
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean checkEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        String regexPattern = "^(.+)@(\\S+)$";

        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

    @Override
    public boolean checkPassword(String password) {
        if (StringUtils.isEmpty(password)) {
            return false;
        }
        String regexPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{7,}";
        return Pattern.compile(regexPattern)
                .matcher(password)
                .matches();
    }

    @Override
    public boolean validateAndLogin(UserDto userDto) {
        Optional<User> user = userRepository.findByEmail(userDto.getEmail());
        if (user.isPresent()) {
            if (passwordEncoder.matches(userDto.getPassword(), user.get().getPassword())) {
                LOG.debug("User successfully validated.");
                return true;
            } else {
                LOG.debug("Password does not match.");
                return false;
            }
        }
        LOG.debug("User does not exist.");
        return false;
    }
}
