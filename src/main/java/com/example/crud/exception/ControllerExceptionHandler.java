package com.example.crud.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.crud.model.ExceptionDetails;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> usernameNotFoundException(ProductNotFoundException e)
	{
		ExceptionDetails ed = new ExceptionDetails(e.getMessage(), Instant.now().toString());
		return new ResponseEntity<Object>(ed,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
