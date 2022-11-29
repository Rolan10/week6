package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.User;
import com.crm.GomezdeMayora.week6.service.userDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class userController {
    @Autowired
    private userDaoService service;

    public userController(userDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/addusers/{user}")
    public User addUser(@PathVariable User user) {
        return service.addUser(user);
    }

    @PostMapping("/login/{user}")
    public User Login(@PathVariable User user) {
        return null;
    }
}
