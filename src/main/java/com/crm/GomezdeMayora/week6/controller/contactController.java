package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.service.contactDaoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contactController {
    private contactDaoService service;

    public contactController(contactDaoService service) {
        this.service = service;
    }

    @PostMapping("/addcontacts/{contact}")
    public void addContact(@PathVariable Contact contact) {
        service.addContact(contact);



    }
}
