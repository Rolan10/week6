package com.crm.GomezdeMayora.week6.userTests;

import com.crm.GomezdeMayora.week6.model.User;
import com.crm.GomezdeMayora.week6.service.userDaoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class userTests {

    private static userDaoService testService;

    @BeforeAll
    public static void setUp() {
        //setup
        testService = new userDaoService();
    }

    @AfterEach
    public void tearDown() {
        //tearDown
        testService = new userDaoService();
    }

    @Test
    public void Login_LoggingInWithCorrectCredentials_ReturnsTrue() { // In a real project we should encrypt the password for security reasons.
        String username = "solera@solera.com";
        String password = "bootcamp4";
        User user = new User(username, password);
        User result = testService.Login(user);
        assert (result == user);
    }

}
