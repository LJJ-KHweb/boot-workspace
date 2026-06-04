package com.kh.myproject.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kh.myproject.exception.model.dto.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handlerMethodArgumentNotValid(MethodArgumentNotValidException e){
		Map<String, String> errors = new HashMap();
		e.getBindingResult().getFieldErrors().forEach(err -> errors.put(err.getField(), err.getDefaultMessage()));
		return ResponseEntity.badRequest().body(new ErrorResponse("400","test"));
	}

	@ExceptionHandler(DuplicateUserIdException.class)
	public ResponseEntity<ErrorResponse> handlerDuplicatedUserId(DuplicateUserIdException e){
		ErrorResponse err = new ErrorResponse("400","중복된 아이디 입니다");
		return ResponseEntity.badRequest().body(err);
	}
}
