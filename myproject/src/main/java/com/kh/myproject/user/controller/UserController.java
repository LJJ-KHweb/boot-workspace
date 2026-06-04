package com.kh.myproject.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.myproject.user.model.dto.UserDto;
import com.kh.myproject.user.model.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/users")
public class UserController {
	
	// 처음 Security filter에서 loginfrom disable하고 postMapping 써줘야지만 서버 응답함
	private final UserService service;
	
	
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserDto user) {
		service.signUp(user);
		
	    return ResponseEntity.ok("회원 생성");
	}

}
