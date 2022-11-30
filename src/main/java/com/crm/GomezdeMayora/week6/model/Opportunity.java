package com.crm.GomezdeMayora.week6.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "opportunities")
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int opportunity_id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "status")
    private boolean status;
    @OneToMany(mappedBy = "opportunity")
    private List<Contact> contacts;

    @OneToOne(mappedBy = "opportunity")
    private Client client;



    /**
     * @return the client id.
     * */
    public int getClient() {
        if(client != null)
        return client.getClient_id();
        else return -1;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isStatus() {
        return status;
    }

    public Opportunity(String name, String lastName, boolean status, List<Contact> contacts, Client client) {
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.contacts = contacts;
        this.client = client;
    }

    public Opportunity(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Opportunity(int id, String name, String lastName, boolean status, ArrayList<Contact> contacts) {
        this.opportunity_id = id;
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.contacts = contacts;
    }
    public Opportunity() {

    }

    public void setContacts(List<Contact> contacts) {
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

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
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
