package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.Opportunity;
import com.crm.GomezdeMayora.week6.service.opportunityDaoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class opportunityController {
    private opportunityDaoService service;

    public opportunityController(opportunityDaoService service) {
        this.service = service;
    }

    @GetMapping("/opportunities/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Opportunity getOpportunity(@PathVariable int id) {
        return service.getOpportunityById(id);
    }

    @GetMapping("/opportunities")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Opportunity> getAllOpportunities() {
        return service.getOpportunities();
    }



}
