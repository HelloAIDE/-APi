package com.bigniu.exception;

public class TokenException extends RuntimeException{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TokenException(String message) {
		super(message);
		this.message = message;
	}
	public TokenException(){
		super();
	}
}
