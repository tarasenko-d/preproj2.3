package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(User user);

    void change(User user);

    List<User> toList();
}
