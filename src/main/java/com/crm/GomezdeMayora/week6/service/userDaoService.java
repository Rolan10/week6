package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.userRepository;
import com.crm.GomezdeMayora.week6.model.User;
import org.hibernate.query.Query;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class userDaoService {
    @Autowired
    private userRepository userrepository;

    //void constructor
    public userDaoService() {

    }

    public List<User> getUsers() {
        return userrepository.findAll();
    }

    public User addUser(User user) { // In this method we should use a cypher to encrypt the password for security reasons.

        return null;
    }

    public User Login(@NotNull User user) {
        User result = userrepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
        if (result == null) return null;
        return result;
    }
}
