package com.example.crud.exception;

public class ProductNotFoundException extends RuntimeException{
	
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}

}
