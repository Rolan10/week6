package com.crm.GomezdeMayora.week6.contactTests;

import com.crm.GomezdeMayora.week6.Week6Application;

import com.crm.GomezdeMayora.week6.model.Contact;
import com.crm.GomezdeMayora.week6.service.contactDaoService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Week6Application.class)
@Transactional // This annotation is used to rollback the changes made in the database after the test.
public class contactTests {

    @Autowired
    private contactDaoService contactService;

    @Test
    public void getContacts_WhenCalled_ReturnsNoContactWithoutOpportunitiesOrClient() {

        List<Contact> contactList = contactService.getContacts();
        int cont = 0;
        for (Contact contact : contactList) {
            if (contact.getOpportunity()== -1 && contact.getClient() == -1) { //If there is a contact without opportunities or client, the test fails.
                cont++;
            }

        }
        assertEquals(0, cont);
    }
}
