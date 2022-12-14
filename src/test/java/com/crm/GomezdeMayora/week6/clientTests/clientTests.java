package com.crm.GomezdeMayora.week6.clientTests;


import com.crm.GomezdeMayora.week6.Week6Application;
import com.crm.GomezdeMayora.week6.model.Client;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Week6Application.class)
@Transactional
public class clientTests {
    @Autowired
    private clientDaoService client;

    @Test
    public void addClients_WhenOpportunityExistInDataBase_CreateTheClientAndAssociateToTheOpportunity() {

        Opportunity o = new Opportunity("Rolan", "Gomez"); // Opportunity that exist in the database and it's not client.
        String product = "API"; // Product bought for the client.
        Client result = client.addClient(o, product);
        assertEquals("Rolan", result.getOpportunity().getName());
        assertEquals("Gomez", result.getOpportunity().getLastName());
    }
    @Test
    public void addClients_WhenOpportunityDoesNotExistInDataBase_DoNotCreate(){

        Opportunity o = new Opportunity("1", "1"); // Opportunity that doesn't exist in the database.
        String product = "API"; // Product bought for the client.
        Client result = client.addClient(o, product);
        assertEquals(null, result);

    }
    @Test
    public void addClients_WhenOpportunityIsClientAlready_DoNotCreate(){

        Opportunity o = new Opportunity("Rolan", "Gomez de Mayora"); // Opportunity is already Client.
        String product = "API"; // Product bought for the client.
        Client result = client.addClient(o, product);
        assertEquals(null, result);


    }


}
