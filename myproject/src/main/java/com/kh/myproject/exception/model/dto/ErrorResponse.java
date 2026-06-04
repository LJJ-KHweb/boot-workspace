package com.kh.myproject.exception.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {
	private String code;
	private String message;
	private Object data;
	public ErrorResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	
}
