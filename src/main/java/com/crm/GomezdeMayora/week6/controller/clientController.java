package com.crm.GomezdeMayora.week6.controller;


import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController {

    clientDaoService service = new clientDaoService();


    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable int id) {
        return service.getClientById(id);
    }
}
