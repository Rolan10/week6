package com.crm.GomezdeMayora.week6.service;

import com.crm.GomezdeMayora.week6.Repositories.clientRepository;
import com.crm.GomezdeMayora.week6.Repositories.contactRepository;
import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class contactDaoService {

    @Autowired
    private contactRepository contactrepository;

    //Need access to opportunityDaoService to create a contact for the opportunity.
    @Autowired
    private opportunityDaoService OpportunityService;
    //Need access to clientDaoService to create a contact for the client.
    @Autowired
    private clientDaoService ClientService;

    public List<Contact> getContacts() {
        return contactrepository.findAll();
    }
    public Contact getContactById(int id) {
        return null;
    }

    /**
     * This method will check if the oportunity for this contact already exists.
     * if so, it will check if that oportunity has become already a client to add it.
     * otherwise it will add the contact to the list of oportunities.
     * If the oportunity does not exist, it will create a new oportunity and add the contact to the list of opportunities.
     *
     * @param contact: Contact to be added to the list of contacts.
     * @param name: Name of the opportunity.
     * @param lastName: Lastname of the opportunity.
     * @return the contact that has been added to the list of contacts.
     */
    public Contact addContact(Contact contact,String name, String lastName) {

        Opportunity op = OpportunityService.addOpportunity(new Opportunity(name, lastName));
        if(op != null){//If the opportunity has been created.
            contact.setOpportunity(op); // add the opportunity to the contact.
            contactrepository.save(contact); //save the contact.
            return contact; //return the contract.
        }
        else {
            op= OpportunityService.findOpportunityByNameAndLastName(name, lastName); //get the opportunity that already exists.
            if(op.isStatus()) {//If a Client exists for this opportunity
               contact.setClient(ClientService.getClientById(op.getClient())); //get the client and set it into the contact.
            }
            else contact.setOpportunity(op);

            contactrepository.save(contact); //save the contact.
            return contact;
        }
    }

}
