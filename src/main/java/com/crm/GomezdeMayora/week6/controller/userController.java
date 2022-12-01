package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.User;
import com.crm.GomezdeMayora.week6.service.userDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userController {
   // @Autowired
    private userDaoService service;

    public userController(userDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/addusers")
    @CrossOrigin(origins = "http://localhost:3000")
    public User addUser(@RequestParam User user) {
        return service.addUser(user);
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public User Login(@RequestBody User user) {
        System.out.println(user.getEmail() + " " + user.getPassword());
        return service.Login(user);
    }
}
