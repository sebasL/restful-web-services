package com.in28minutes.rest.webservices.restulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8131143408828908404L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
