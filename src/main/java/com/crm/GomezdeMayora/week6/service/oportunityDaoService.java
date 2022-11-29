package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Oportunity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class oportunityDaoService {

    private static ArrayList<Oportunity> oportunities = new ArrayList<>();
    private static int id = 0;

    static {
        oportunities.add(new Oportunity(++id, "Rolan", "Gomez de Mayora", false, new ArrayList<Contact>()));
    }

    public ArrayList<Oportunity> getOportunities() {
        return null;
    }

    public Oportunity getOportunityById(int id) {

        return null;
    }
    public Oportunity addOportunity(Oportunity oportunity) {
        return null;
    }
}
