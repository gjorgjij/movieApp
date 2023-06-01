package com.example.movieApp.service;

import com.example.movieApp.model.User;
import com.example.movieApp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLSession;
import java.util.Optional;


public interface UserService {
    Optional<User> findById(Integer id);

    Optional<User> findByEmail(String email);
}
