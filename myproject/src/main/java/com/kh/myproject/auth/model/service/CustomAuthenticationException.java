package com.kh.myproject.auth.model.service;

public class CustomAuthenticationException extends RuntimeException {
	public CustomAuthenticationException(String message) {
		super(message);
	}
}
