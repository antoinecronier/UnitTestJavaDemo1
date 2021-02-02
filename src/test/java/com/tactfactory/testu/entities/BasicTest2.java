package com.tactfactory.testu.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest2 {

	private static int a = 0;
	private static int b = 0;

	@Test
	public void test1() {
		assertEquals(a * 2, a + b);
	}

	@Test
	public void test2() {
		assertEquals(a * 2, b * 2);
	}

	@BeforeEach
	public void prepareTest() {
		a = 8;
		b = 8;
	}
}
