package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class contactDaoService {

    /**
     * @param contact: Contact to be added to the list of contacts
     * @return: the contact that has been added to the list of contacts
     * @body: this method will check if the oportunity for this contact already exists, if so, it will check if that oportunity has become already a client to add it into the client, otherwise
     * it will add the contact to the list of oprtunities.
     * If the oportunity does not exist, it will create a new oportunity and add the contact to the list of opportunities.
     */
    public Contact addContact(Contact contact) {
        System.out.println("Contact added");
        return null;
    }

}
