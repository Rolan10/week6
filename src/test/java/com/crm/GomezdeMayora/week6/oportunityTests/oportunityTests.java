package com.crm.GomezdeMayora.week6.oportunityTests;

import com.crm.GomezdeMayora.week6.Week6Application;
import com.crm.GomezdeMayora.week6.model.Opportunity;
import com.crm.GomezdeMayora.week6.service.opportunityDaoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Week6Application.class)
@Transactional
public class oportunityTests {

    @Autowired
    private opportunityDaoService opportunityService;

    @BeforeAll
    public static void setUp() {
        //setup
    }

    @AfterEach
    public void tearDown() {
        //tearDown
    }

    @Test
    public void getOportunities_WhenCalled_ReturnsNoOpportunityWithoutContacts() {

        List<Opportunity> opportunityList = opportunityService.getOpportunities();
        int cont = 0;
        for (Opportunity opportunity : opportunityList) {
            //Assertions.assertThat(opportunity.getContacts() != null);
            System.out.println(opportunity.getContacts().size());
            if (opportunity.getContacts().size() == 0) {
                cont++;
            }

        }
        assertEquals(0, cont);

    }
}
