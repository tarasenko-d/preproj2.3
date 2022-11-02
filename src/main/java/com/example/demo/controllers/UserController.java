package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class UserController {
private UserService userService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<User> listUser = userService.toList();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listCustomer", listUser);
        return modelAndView;
    }

}
