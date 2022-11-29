package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class opportunityDaoService {

    private static ArrayList<Opportunity> opportunities = new ArrayList<>();
    private static int id = 0;

    static {
        opportunities.add(new Opportunity(++id, "Rolan", "Gomez de Mayora", false, new ArrayList<Contact>()));
    }

    public ArrayList<Opportunity> getOpportunities() {
        return null;
    }

    public Opportunity getOpportunityById(int id) {

        return null;
    }
    public Opportunity addOpportunity(Opportunity opportunity) {
        return null;
    }
    public void addContactToOpportunity(int id, Contact contact) {

    }
}
