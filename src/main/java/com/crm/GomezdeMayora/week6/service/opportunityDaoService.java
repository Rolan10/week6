package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.opportunityRepository;
import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component

public class opportunityDaoService {
    @Autowired
    private opportunityRepository opportunityrepository;

    public List<Opportunity> getOpportunities() {
        return opportunityrepository.findAll();
    }

    public Opportunity getOpportunityById(int id) {

        return null;
    }

    public Opportunity addOpportunity(Opportunity opportunity) {
        return null;
    }

    public Opportunity addContactToOpportunity(int id, Contact contact) { // By a lack of time the test will insert data in Database.
        //Comprobar que el contacto no está vacio y no existe ya en oportunidad
        //buscar la oportunidad por ID
        //añadir el contacto Con la oportunidad obtenida a la base de datos
        return null;
    }
}
