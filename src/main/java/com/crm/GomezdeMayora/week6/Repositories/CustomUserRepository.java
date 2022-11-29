package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.User;

public interface CustomUserRepository {
    User findUserByEmailAndPassword(String email, String password);
}
