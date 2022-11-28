package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Oportunity;

import java.util.ArrayList;

public class clientDaoService {


    private static ArrayList<Client> clients = new ArrayList<>();

    //static module to initialize the list with some clients.
    static {
        clients.add(new Client(1, new Oportunity(1, "Rolan", "Gomez de Mayora",false,new ArrayList<Contact>()), "Product 1"));

    }
    public ArrayList<Client> getClients() {
        return null;
    }
    public void addClient(Client client) {

    }
    public Client getClientById(int id) {
        return null;
    }
    public void deleteClient(int id) {

    }
}
