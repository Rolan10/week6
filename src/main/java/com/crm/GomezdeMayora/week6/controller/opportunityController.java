package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.Opportunity;
import com.crm.GomezdeMayora.week6.service.opportunityDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class opportunityController {
    private opportunityDaoService service;

    public opportunityController(opportunityDaoService service) {
        this.service = service;
    }
    @GetMapping("/opportunities/{id}")
    public Opportunity getOpportunity(@PathVariable int id) {
        return service.getOpportunityById(id);
    }
    @GetMapping("/opportunities")
    public ArrayList<Opportunity> getAllOpportunities() {
        return service.getOpportunities();
    }


    /**
     * This method will check if the oportunity for this contact already exists.
     * if so, it will check if that oportunity has become already a client to add it.
     * otherwise it will add the contact to the list of oportunities.
     * If the oportunity does not exist, it will create a new oportunity and add the contact to the list of opportunities.
     *
     * @param contact: Contact to be added to the list of contacts
     * @return the contact that has been added to the list of contacts
     *
     */
}
