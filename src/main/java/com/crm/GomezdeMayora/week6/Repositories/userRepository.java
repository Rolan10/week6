package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Integer>, CustomUserRepository {

}



