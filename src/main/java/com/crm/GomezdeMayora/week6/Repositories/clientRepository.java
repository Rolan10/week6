package com.crm.GomezdeMayora.week6.Repositories;


import com.crm.GomezdeMayora.week6.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<Client,Integer> {

}

