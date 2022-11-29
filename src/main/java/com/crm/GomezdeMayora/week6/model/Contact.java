package com.crm.GomezdeMayora.week6.model;

import javax.persistence.*;
import java.util.Date;

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contact_id;
    @Column(name="Contact method")
    private String method;
    @Column(name="Contact date")
    private Date date;
    @Column(name="Contact detail")
    private String information;

    @ManyToOne
    @JoinColumn(name="opportunity_id")
    private Opportunity opportunity;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    public Contact(int id, int method, Date date, String description) {
        this.contact_id = id;
        this.date = date;
        this.information = description;
        switch(method){
            case 1 : this.method = "Email";
                break;
            case 2 : this.method = "Phone";
                break;
            case 3 : this.method = "In Person";
                break;

            default: this.method = "Other";
        }
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(int method) {
        switch(method){
            case 1 : this.method = "Email";
            break;
            case 2 : this.method = "Phone";
            break;
            case 3 : this.method = "In Person";
            break;

            default: this.method = "Other";
        }

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + contact_id +
                ", method=" + method +
                ", date=" + date +
                ", description='" + information + '\'' +
                '}';
    }
}
