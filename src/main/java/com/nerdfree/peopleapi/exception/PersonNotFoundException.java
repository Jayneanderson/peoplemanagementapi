package com.nerdfree.peopleapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {
	
	public PersonNotFoundException(Long id) {
		super(String.format("Pessoa com ID %s não encontrada!", id));
		
	}
	
}
