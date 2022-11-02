package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;


public interface UserDao {

    void add(User user);

    void delete(User user);

    void change(User user);

    List<User> toList();
}
