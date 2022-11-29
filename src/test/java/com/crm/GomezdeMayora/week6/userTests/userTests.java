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


@SpringBootTest
public class userTests {

    @Autowired
    private static userRepository testService;

    @BeforeEach
    public void setUp() {
        //setup
      // testService = new userDaoService();
    }

    @AfterAll
    public static void tearDown() {
        //tearDown
      //  testService = null;
    }

    @Test
    public void Login_LoggingInWithCorrectCredentials_ReturnsTrue() { // In a real project we should encrypt the password for security reasons.
        String username = "solera@solera.com";
        String password = "bootcamp4";
        User user = new User(username, password);
        User result = testService.findUserByEmailAndPassword(user.getEmail(),user.getPassword());
        Assertions.assertEquals(user.getEmail(), result.getEmail());
    }

    @Test
    public void Login_LoggingWithEmailUpperCase_ReturnsTrue() { // In a real project we should encrypt the password for security reasons.
        String username = "SOLERA@SOLERA.COM";
        String password = "bootcamp4";
        User user = new User(username, password);
        User result = testService.findUserByEmailAndPassword(user.getEmail(),user.getPassword());
        assert (result == user);
    }

}
