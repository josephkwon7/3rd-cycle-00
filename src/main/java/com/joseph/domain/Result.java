package com.joseph.domain;

public class Result {
	private boolean valid;
	
	private String errorMessage;
	
	private Result(boolean valid, String  errrorMessage) {
		this.valid = valid;
		this.errorMessage = errorMessage;
	}
	
	public boolean isValid() {
		return valid;
	}

	public static Result ok() {
		return new Result(true, null);
	}
	
	public static Result fail(String errorMessage) {
		return new Result(false, errorMessage);
	}
	
}
