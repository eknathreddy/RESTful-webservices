package com.eknath.springboot.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse{

	private Date timeStamp;
	private String messaage;
	private String details;

	public ExceptionResponse(Date timeStamp, String messaage, String details) {
		this.timeStamp = timeStamp;
		this.messaage = messaage;
		this.details = details;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessaage() {
		return messaage;
	}
	public void setMessaage(String messaage) {
		this.messaage = messaage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
		
}
