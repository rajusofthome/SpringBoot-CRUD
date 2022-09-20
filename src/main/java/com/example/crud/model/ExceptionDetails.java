package com.example.crud.model;

public class ExceptionDetails {

	private String errorMessage;
	private String errorTimeStamp;

	public ExceptionDetails(String errorMessage, String errorTimeStamp) {
		this.errorMessage = errorMessage;
		this.errorTimeStamp = errorTimeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorTimeStamp() {
		return errorTimeStamp;
	}

	public void setErrorTimeStamp(String errorTimeStamp) {
		this.errorTimeStamp = errorTimeStamp;
	}

}
