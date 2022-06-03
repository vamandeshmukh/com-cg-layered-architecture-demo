package com.cg.layered.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void sampleTest(String testName) {

		assertEquals(10, 10);

	}

	@Test
	public void sampleTest2(String testName) {

		assertNotEquals(10, 11);

	}
}
