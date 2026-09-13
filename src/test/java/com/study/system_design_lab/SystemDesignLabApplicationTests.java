package com.study.system_design_lab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SystemDesignLabApplicationTests {

	@Test
	void contextLoads() {
	}

}
