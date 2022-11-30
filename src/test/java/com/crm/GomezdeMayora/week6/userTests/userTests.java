package com.crm.GomezdeMayora.week6.userTests;

import com.crm.GomezdeMayora.week6.Repositories.CustomUserRepositoryImpl;
import com.crm.GomezdeMayora.week6.Repositories.userRepository;
import com.crm.GomezdeMayora.week6.Week6Application;
import com.crm.GomezdeMayora.week6.model.User;
import com.crm.GomezdeMayora.week6.service.userDaoService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes= Week6Application.class)
public class userTests {

    @Autowired
    private userDaoService testService; //We need to Autowire the service to test it.

    @BeforeEach
    public void setUp() {
        //setup
        //testService = new userDaoService(); // Why this breaks the test?
    }

    @AfterAll
    public static void tearDown() {
        //tearDown
        //testService = null;
    }

    @Test
    public void Login_LoggingInWithCorrectCredentials_ReturnsTheUser() { // In a real project we should encrypt the password for security reasons.
        String username = "solera@solera.com";
        String password = "bootcamp4";
        User user = new User(username, password);
        User result = testService.Login(user);
        Assertions.assertEquals(user.getEmail(), result.getEmail());
        Assertions.assertEquals(user.getPassword(), result.getPassword());
    }

    @Test
    public void Login_LoggingWithEmailUpperCase_ReturnsTheUser() { // In a real project we should encrypt the password for security reasons.
        String username = "SOLERA@SOLERA.COM";
        String password = "bootcamp4";
        User user = new User(username, password);
        User result = testService.Login(user);
        user.setEmail(user.getEmail().toLowerCase());
        Assertions.assertEquals(user.getEmail(), result.getEmail());
        Assertions.assertEquals(user.getPassword(), result.getPassword());
    }

    @Test
    public void Login_LoggingInWithIncorrectCredentials_HandleExceptionAndReturnVoidUser(){

        String username = "1"; // This is not a valid email
        String password = "1"; // This is not a valid password
        User user = new User(username, password);
        User result = testService.Login(user);
        user.setEmail(user.getEmail().toLowerCase());
        Assertions.assertEquals("", result.getEmail());
        Assertions.assertEquals("", result.getPassword());

    }

}
