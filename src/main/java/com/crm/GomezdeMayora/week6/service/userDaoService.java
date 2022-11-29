package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class userDaoService {

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User( "solera@solera.com", "bootcamp4"));
    }

    public ArrayList<User> getUsers() {
        return null;
    }
    public User addUser(User user) {

        return null;
    }
    public User Login(User user) {

        return null;
    }
}
