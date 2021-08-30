package com.example.covid.main.loginbean;


public class SigninResponse {

	int statusCode;
	String returnMessage;
	String userName;
	String password;


	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public SigninResponse(int statusCode, String returnMessage, String userName, String password) {
		super();
		this.statusCode = statusCode;
		this.returnMessage = returnMessage;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "SigninResponse [statusCode=" + statusCode + ", returnMessage=" + returnMessage + ", userName="
				+ userName + ", password=" + password + "]";
	}

	public SigninResponse() {
		super();
	}
	
	
}
