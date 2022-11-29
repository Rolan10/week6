package com.crm.GomezdeMayora.week6.clientTests;


import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class clientTests {
    private static clientDaoService client;

    @BeforeAll
    public static void setUp() {
        client = new clientDaoService();
    }

    @AfterEach
    public void tearDown() {
        //client = null;
    }

    @Test
    public void testGetClients() {
        assertEquals(1, client.getClients().size());
    }

}
