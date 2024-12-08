package com.bschostak.slyfoxdict;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;

@SpringBootTest
class SlyfoxdictApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void main() {
		String[] args = { "abc", "abc", "abc" };
		SlyfoxdictApplication.main(args);
	}

}
