package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.service.clientDaoService;
import com.crm.GomezdeMayora.week6.service.contactDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class contactController {

    private contactDaoService service;

    public contactController(contactDaoService service) {
        this.service = service;
    }

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return service.getContacts();
    }

}
