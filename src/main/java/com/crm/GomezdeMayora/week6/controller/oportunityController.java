package com.crm.GomezdeMayora.week6.controller;

import com.crm.GomezdeMayora.week6.model.Oportunity;
import com.crm.GomezdeMayora.week6.service.oportunityDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class oportunityController {
    private oportunityDaoService service;

    public oportunityController(oportunityDaoService service) {
        this.service = service;
    }
    @GetMapping("/oportunities/{id}")
    public Oportunity getOportunity(@PathVariable int id) {
        return service.getOportunityById(id);
    }
    @GetMapping("/oportunities")
    public ArrayList<Oportunity> getAllOportunities() {
        return service.getOportunities();
    }
}
