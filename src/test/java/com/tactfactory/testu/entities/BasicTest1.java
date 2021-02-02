package com.tactfactory.testu.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicTest1 {

	@Test
	public void test1() {
		int a = 7;
		int b = 7;

		assertEquals(a * 2, a + b);
	}

	@Test
	public void test2() {
		int a = 7;
		int b = 8;

		assertEquals(a * 2, a + b);
	}

	@Test
	public void test3() {
		int a = 8;
		int b = 7;

		assertEquals(a * 2, a + b);
	}

	@Test
	public void test4() {
		int a = 8;
		int b = 8;

		assertEquals(a * 2, a + b);
	}
}
