package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomUserRepositoryImpl implements CustomUserRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public User findUserByEmailAndPassword(String email,String password){


        return (User)entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password", User.class)
                .setParameter("email", email)
                .setParameter("password",password)
                .getSingleResult();
    }
}
