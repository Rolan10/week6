package com.crm.GomezdeMayora.week6.model;

import java.util.ArrayList;

public class Oportunity {
    private int id;
    private String name;
    private String lastName;
    private boolean status;
    private ArrayList<Contact> contacts;


    public Oportunity(int id, String name, String lastName, boolean status, ArrayList<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isStatus() {
        return status;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                ", contacts=" + contacts +
                '}';
    }
}
