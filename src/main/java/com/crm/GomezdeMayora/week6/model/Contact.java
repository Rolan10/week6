package com.crm.GomezdeMayora.week6.model;

import java.util.Date;

public class Contact {
    private int id;
    private int method;
    private Date date;
    private String description;


    public Contact(int id, int method, Date date, String description) {
        this.id = id;
        this.method = method;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", method=" + method +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
