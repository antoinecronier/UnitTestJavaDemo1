package com.tactfactory.testu.entities;

import com.tactfactory.testu.exceptions.AgeBelow0Exception;
import com.tactfactory.testu.exceptions.AgeExceed150Exception;

public class User {

	private int id;
	private String firstname;
	private String lastname;
	private String login;
	private String password;

	/**
	 * Ne peut pas être négatif et ne peut pas excéder 150 ans.
	 */
	private int age;

	public User () {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() throws AgeBelow0Exception, AgeExceed150Exception {
		if (age < 0) {
			throw new AgeBelow0Exception();
		}

		if (age > 150) {
			throw new AgeExceed150Exception();
		}

		return age;
	}

	public void setAge(int age) throws AgeBelow0Exception, AgeExceed150Exception {
		if (age < 0) {
			throw new AgeBelow0Exception();
		}

		if (age > 150) {
			throw new AgeExceed150Exception();
		}

		this.age = age;
	}

}
