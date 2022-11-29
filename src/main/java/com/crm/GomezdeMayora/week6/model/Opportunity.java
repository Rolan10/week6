package com.crm.GomezdeMayora.week6.model;

import javax.persistence.*;
import java.util.ArrayList;

public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int opportunity_id;
    @Column(name="Name")
    private String name;
    @Column(name="Last Name")
    private String lastName;
    @Column(name="Status")
    private boolean status;
    @OneToMany(mappedBy = "opportunity_id")
    private ArrayList<Contact> contacts;

    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    public boolean isStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Opportunity(int id, String name, String lastName, boolean status, ArrayList<Contact> contacts) {
        this.opportunity_id = id;
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.contacts = contacts;
    }

    public int getOpportunity_id() {
        return opportunity_id;
    }

    public void setOpportunity_id(int opportunity_id) {
        this.opportunity_id = opportunity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    @Override
    public String toString() {
        return "Oportunity{" +
                "id=" + opportunity_id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                ", contacts=" + contacts +
                '}';
    }
}
