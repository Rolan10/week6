package com.crm.GomezdeMayora.week6.controller;


import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class clientController {

    clientDaoService service;

    public clientController(clientDaoService service) {
        this.service =  service;
    }
    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable int id) {
        return service.getClientById(id);
    }
    @GetMapping("/clients")
    public ArrayList<Client> getAllClients() {
        return service.getClients();
    }
    @PostMapping("/addclients/{client}")
    public Client addClient(@PathVariable Client client) {
        service.addClient(client);
        return client;
    }
    @DeleteMapping("/deleteclients/{id}")
    public Client deleteClient(@PathVariable int id) {
        return service.deleteClient(id);
    }
}
