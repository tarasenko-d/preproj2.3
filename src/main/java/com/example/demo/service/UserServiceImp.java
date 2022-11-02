package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserService userService;

    public UserServiceImp(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add(User user) {
        userService.add(user);
    }

    @Override
    public void delete(User user) {
        userService.delete(user);
    }

    @Override
    public void change(User user) {
        userService.change(user);
    }

    @Override
    public List<User> toList() {
        return userService.toList();
    }
}
