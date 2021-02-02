package com.tactfactory.testu.entities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import com.tactfactory.testu.exceptions.AgeBelow0Exception;
import com.tactfactory.testu.exceptions.AgeExceed150Exception;

public class UserAgeTest {

	@Test
	public void userSetAgeIs150() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		user.setAge(150);

		assertTrue(user.getAge() <= 150);
	}

	@Test
	public void userSetAgeIs151() {
		User user = new User();

		assertEquals(assertThrows(AgeExceed150Exception.class, () -> {
			user.setAge(151);
		}).getMessage(), "age cannot exceed 150");
	}

	@Test
	public void userSetAgeIs40() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		user.setAge(40);

		assertTrue(user.getAge() == 40);
	}

	@Test
	public void userSetAgeIs40NotThrowException() {
		User user = new User();

		assertDoesNotThrow(() -> {
			user.setAge(40);
		});
	}

	@Test
	public void userSetAgeIsBetween0And150() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		for (int i = 0; i <= 150; i++) {
			user.setAge(i);
			assertTrue(user.getAge() == i);
		}
	}

	@Test
	public void userSetAgeBetween0And150NotThrowException() {
		User user = new User();

		assertDoesNotThrow(() -> {
			for (int i = 0; i <= 150; i++) {
				user.setAge(i);
			}
		});
	}

	@Test
	public void userSetAgeIs0() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		user.setAge(0);

		assertTrue(user.getAge() >= 0);
	}

	@Test
	public void userSetAgeIsBelow0() {
		User user = new User();

		assertEquals(assertThrows(AgeBelow0Exception.class, () -> {
			user.setAge(-1);
		}).getMessage(), "age cannot be below 0");
	}

	@Test
	public void userSetAgeIsMaxInteger() {
		User user = new User();

		assertEquals(assertThrows(AgeExceed150Exception.class, () -> {
			user.setAge(Integer.MAX_VALUE);
		}).getMessage(), "age cannot exceed 150");
	}

	@Test
	public void userSetAgeIsMinInteger() {
		User user = new User();

		assertEquals(assertThrows(AgeBelow0Exception.class, () -> {
			user.setAge(Integer.MIN_VALUE);
		}).getMessage(), "age cannot be below 0");
	}


	@Test
	public void userGetDefaultIs0() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		assertTrue(user.getAge() == 0);
	}

	@Test
	public void userGetAgeNotIn0And150ThrowException() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		User user = new User();

		Class<?> clazz = User.class;
		Field f = clazz.getDeclaredField("age");
		f.setAccessible(true);
		f.setInt(user, -65);

		assertThrows(Exception.class, () -> {
				user.getAge();
		});
	}

	@Test
	public void userGetAgeNotIn0And150ThrowGoodException() throws AgeBelow0Exception, AgeExceed150Exception {
		User user = new User();

		assertDoesNotThrow(() -> {
			try {
				user.getAge();
			} catch (Exception e) {
				assertTrue(e instanceof AgeBelow0Exception || e instanceof AgeExceed150Exception);
				throw e;
			}
		});
	}
}
