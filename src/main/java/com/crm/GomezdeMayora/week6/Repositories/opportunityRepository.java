package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface opportunityRepository extends JpaRepository<Opportunity,Integer> {
}
