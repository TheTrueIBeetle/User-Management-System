/**
 * Project Name: Springboot-Server
 * File Name: ResourceNotFoundException.java
 * Author: Luke Bas
 * Date Started: 2022-03-26
 * Context: Custom exception to be thrown when no resource found
 */

package com.spring.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
