package com.tactfactory.testu.exceptions;

public class AgeBelow0Exception extends Exception {

	private static final long serialVersionUID = -5739444457802928306L;

	public final static String AGE_BELOW_0_MESSAGE = "age cannot be below 0";

	@Override
	public String getMessage() {
		return AGE_BELOW_0_MESSAGE;
	}
}
