package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.clientRepository;
import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class clientDaoService {

    @Autowired
    private clientRepository clientrepository;

    public List<Client> getClients() {
        return clientrepository.findAll();
    }

    /**
     * This method will create a new client from an existing oportunity.
     **/
    public void addClient(Client client) {

    }

    public Client getClientById(int id) { // incrementar id
        return null;
    }

    public Client deleteClient(int id) {
        return null;
    }

    public void addContactToClient(int id, Contact contact) {

    }
}
