package com.example.registrationaldemo.service;

import com.example.registrationaldemo.dto.UserDto;
import com.example.registrationaldemo.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
