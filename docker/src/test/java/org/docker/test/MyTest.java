package org.docker.test;

import static org.assertj.core.api.Assertions.*;
import org.docker.my.MyRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyTest {

	@Autowired
	private MyRestController controller;
	
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
}
