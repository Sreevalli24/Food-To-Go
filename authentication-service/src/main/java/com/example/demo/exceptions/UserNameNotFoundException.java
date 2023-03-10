package com.example.demo.exceptions;

public class UserNameNotFoundException extends Exception {
	
private String message;
	
	public String getMessage() {
		
		return message;
	}

	public void setMessage(String message) {
		
		this.message = message;
	}

	
	public UserNameNotFoundException() {
		
	}
	
	public UserNameNotFoundException(String msg){
		
		super(msg);
		this.message=msg;
	}
}
