package com.example.movieApp.service;

import com.example.movieApp.dto.UserDto;

public interface AuthService {

    public boolean checkEmail(String email);

    public boolean checkPassword(String password);

    public boolean validateAndLogin(UserDto userDto);

}
