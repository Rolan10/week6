package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.User;

import java.util.ArrayList;

public class userDaoService {

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User( "solera@solera.com", "bootcamp4"));
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    public User addUser(User user) {
        users.add(user);
        return user;
    }
    public User Login(User user) {
        for (User user1 : users) {
            if (user1.getEmail().equals(user.getEmail()) && user1.getPassword().equals(user.getPassword())) {
                return user1;
            }
        }
        return null;
    }
}
