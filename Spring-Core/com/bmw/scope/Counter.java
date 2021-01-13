package com.bmw.scope;

public class Counter {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Counter [message=" + message + "]";
	}
	
	

}
