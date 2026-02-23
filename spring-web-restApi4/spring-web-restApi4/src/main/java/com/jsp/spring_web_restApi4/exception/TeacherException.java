package com.jsp.spring_web_restApi4.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TeacherException {
	
	@ExceptionHandler(value = CustomException.class)
	public String ObjectNotFoundException(CustomException e)
	{
		return e.getMessage();
	}

}
