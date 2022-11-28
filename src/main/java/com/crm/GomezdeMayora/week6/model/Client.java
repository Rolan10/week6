package com.crm.GomezdeMayora.week6.model;

import java.util.ArrayList;

public class Client {
    private int id;
    private Oportunity oportunity;
    private ArrayList<Contact> contacts;
    private String product;

    public Client(int id, Oportunity oportunity, ArrayList<Contact> contacts, String product) {
        this.id = id;
        this.oportunity = oportunity;
        this.contacts = contacts;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Oportunity getOportunity() {
        return oportunity;
    }

    public void setOportunity(Oportunity oportunity) {
        this.oportunity = oportunity;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", oportunity=" + oportunity +
                ", contacts=" + contacts +
                ", product='" + product + '\'' +
                '}';
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}
