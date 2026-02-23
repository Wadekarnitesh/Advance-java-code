package com.jsp.spring_web_restApi1.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Configuration;


public class ResponseStructure<T>  {
	
	private T data;
	private int statusCode;
	
	private String exceptionMessage;
	
	private LocalDate date;
	
	public ResponseStructure() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public ResponseStructure(T data, int statusCode, String exceptionMessage, LocalDate date) {
		this.data = data;
		this.statusCode = statusCode;
		this.exceptionMessage = exceptionMessage;
		this.date = date;
	}





	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	

}
