package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.clientRepository;
import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class clientDaoService {

    @Autowired
    private clientRepository clientrepository;
    @Autowired
    private Opportunity opportunityService;
    public List<Client> getClients() {
        return clientrepository.findAll();
    }

    /**
     * This method will create a new client from an existing oportunity, veryfiying that the oportunity exists and that it has not been already converted into a client.
     *
     * @param : The client that will be created.
     * @return the client that has been created.
     **/
    public Client addClient(Opportunity opportunity,String product) {
        return null;
    }

    public Client getClientById(int id) { // incrementar id
        return clientrepository.findById(id).orElse(null);
    }

    /**
     * This function will delete the client specified by the id.
     * @return the Client deleted.
     * **/
    public Client deleteClient(int id) {
        return null;
    }

}
