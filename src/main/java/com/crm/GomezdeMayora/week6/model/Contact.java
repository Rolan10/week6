package com.crm.GomezdeMayora.week6.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "Contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int contact_id;
    @Column(name = "contact_method")
    private String method;
    @Column(name = "contact_date")
  //  @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;
    @Column(name = "contact_detail")
    private String information;

    @ManyToOne
    @JoinColumn(name = "opportunity_id")
    private Opportunity opportunity;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Contact(int id, int method, Date date, String description) {
        this.contact_id = id;
        this.date = date;
        this.information = description;
        switch (method) {
            case 1:
                this.method = "Email";
                break;
            case 2:
                this.method = "Phone";
                break;
            case 3:
                this.method = "In Person";
                break;

            default:
                this.method = "Other";
        }
    }

    public Contact(String method, Date date, String information) {
        this.method = method;
        this.date =date;
        this.information = information;
    }
    //needed for JSON parse.
    public void setDate(String date){
        try{
        this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);}catch (Exception e){
            System.out.println(e);
        }
    }

    public void setMethod(String method) {
        this.method = method;
    }
    /**
     * @return : id of the Opportunity if exists or -1 if not
     *
     **/
    public int getOpportunity() {

        if(opportunity != null){
            return opportunity.getOpportunity_id();
        }else return -1;
        //return opportunity.getOpportunity_id();
    }
    /**
     * @return :  the Opportunity Object
     *
     **/
    @JsonIgnore
    public Opportunity getOpportunityObject() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    /**
     * @return : id of the client if exists or -1 if not
     *
     **/
    public int getClient() {
        if (client != null) {
            return client.getClient_id();
        } else {
            return -1;
        }
       // return client.getClient_id();
    }
    /**
     * @return :  the Client Object
     *
     **/
    @JsonIgnore
    public Client getClientObject() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Contact(int contact_id, String method, Date date, String information, Opportunity opportunity, Client client) {
        this.contact_id = contact_id;
        this.method = method;
        this.date = date;
        this.information = information;
        this.opportunity = opportunity;
        this.client = client;
    }

    public Contact() {
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
        switch (method) {
            case 1:
                this.method = "Email";
                break;
            case 2:
                this.method = "Phone";
                break;
            case 3:
                this.method = "In Person";
                break;

            default:
                this.method = "Other";
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
