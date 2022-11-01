package com.example.demo.mvc.dao;

import com.example.demo.mvc.model.User;

import java.util.List;


public interface UserDao {

    void add(User user);

    void delete(User user);

    void change(User user);

    List<User> toList();
}
