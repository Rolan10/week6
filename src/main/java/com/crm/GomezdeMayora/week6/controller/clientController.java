package com.crm.GomezdeMayora.week6.controller;


import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class clientController {

    private clientDaoService service;

    public clientController(clientDaoService service) {
        this.service = service;
    }

    @GetMapping("/clients/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Client getClient(@PathVariable int id) {
        return service.getClientById(id);
    }

    @GetMapping("/clients")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Client> getAllClients() {
        return service.getClients();
    }

    @PostMapping("/addclients{product}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Client addClient(@RequestBody Opportunity opportunity, @RequestParam(value = "product") String product) {

        return service.addClient(opportunity, product);
    }

    @DeleteMapping("/deleteclients{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Client deleteClient(@RequestParam(value = "id") int id) {
        return service.deleteClient(id);
    }//delete doesn't accept body
}
