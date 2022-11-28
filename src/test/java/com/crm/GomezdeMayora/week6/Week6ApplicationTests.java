package com.crm.GomezdeMayora.week6;

import com.crm.GomezdeMayora.week6.service.clientDaoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Week6ApplicationTests {
private clientDaoService client;
	@Test
	void contextLoads() {
	}

	@BeforeAll
	public void setUp() {
		client = new clientDaoService();
	}
	@AfterEach
	public void tearDown() {
		client = null;
	}
}
