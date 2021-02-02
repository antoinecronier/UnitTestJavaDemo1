package com.tactfactory.testu.exceptions;

public class AgeExceed150Exception extends Exception {

	private static final long serialVersionUID = -5739755557802928306L;

	public final static String AGE_EXCEED_150_MESSAGE = "age cannot exceed 150";

	@Override
	public String getMessage() {
		return AGE_EXCEED_150_MESSAGE;
	}
}
