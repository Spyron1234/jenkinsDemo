package com.jd.api;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		LoggerFactory.getLogger(JenkinsDemoApplicationTests.class).info("Application Test Cases started - Modified - pipleine view");
	}

}
