package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface opportunityRepository extends JpaRepository<Opportunity,Integer> {

    @Query("SELECT o FROM Opportunity o WHERE o.name = :name AND o.lastName = :lastName")
    Optional<Opportunity> findOpportunityByNameAndLastName(@Param("name") String name, @Param("lastName") String lastName);
}
