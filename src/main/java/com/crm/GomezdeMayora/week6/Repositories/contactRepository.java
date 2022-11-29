package com.crm.GomezdeMayora.week6.Repositories;

import com.crm.GomezdeMayora.week6.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactRepository extends JpaRepository<Contact,Integer> {
}
