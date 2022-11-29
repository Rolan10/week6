package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Oportunity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class clientDaoService {

    private static int id =0;
    private static ArrayList<Client> clients = new ArrayList<>();

    //static module to initialize the list with some clients.
    static {
        clients.add(new Client(++id, new Oportunity(1, "Rolan", "Gomez de Mayora",false,new ArrayList<Contact>()), "Product 1"));

    }
    public ArrayList<Client> getClients() {
        return null;
    }
    public void addClient(Client client) {

    }
    public Client getClientById(int id) { // incrementar id
        return null;
    }
    public Client deleteClient(int id) {
        return null;
    }
}
