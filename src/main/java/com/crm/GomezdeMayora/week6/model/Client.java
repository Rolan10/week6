package com.crm.GomezdeMayora.week6.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int client_id;
    @OneToOne
    @JoinColumn(name = "opportunity_id")
    private Opportunity opportunity;
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts;
    @Column(name = "Product")
    private String product;

    public Client(int id, Opportunity opportunity, List<Contact> contacts, String product) {
        this.client_id = id;
        this.opportunity = opportunity;
        this.contacts = contacts;
        this.product = product;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Client() {
    }

    public Client(int id, Opportunity opportunity, String product) {
        this.client_id = id;
        this.opportunity = opportunity;
        this.product = product;
        this.contacts = new ArrayList<>();
    }

    public Client(Opportunity opportunity, String product) {
        this.opportunity = opportunity;
        this.product = product;
        this.contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + client_id + ", oportunity=" + opportunity + ", contacts=" + contacts + ", product='" + product + '\'' + '}';
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}
