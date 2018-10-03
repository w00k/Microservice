package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //with this overwrite the HTTP 500 to HTTP 404 ... Not Found 
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message); //with this, we return HTTP 500 
	}
	
}
