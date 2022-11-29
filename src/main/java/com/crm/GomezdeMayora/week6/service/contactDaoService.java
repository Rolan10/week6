package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.clientRepository;
import com.crm.GomezdeMayora.week6.Repositories.contactRepository;
import com.crm.GomezdeMayora.week6.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class contactDaoService {

    @Autowired
    private contactRepository contactrepository;


    public List<Contact> getContacts() {
        return contactrepository.findAll();
    }
}
