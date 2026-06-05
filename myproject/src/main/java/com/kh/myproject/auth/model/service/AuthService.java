package com.kh.myproject.auth.model.service;

import java.util.Date;
import java.util.Map;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.token.TokenService;
import org.springframework.stereotype.Service;

import com.kh.myproject.auth.model.dto.LoginRequestDto;
import com.kh.myproject.auth.model.dto.LoginResponse;
import com.kh.myproject.auth.model.vo.CustomUserDetails;

import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthService {

	private final AuthenticationManager authenticationManager;
	private final TokenService tokenService;

	public LoginResponse login(@Valid LoginRequestDto lrd) {
		Authentication auth = null;
		try {
		auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(lrd.getMemberId(), lrd.getMemberPwd()));
	}catch(AuthenticationException e){
		throw new CustomAuthenticationException("아이또는 비밀번호 오류");
	}
	CustomUserDetails user = (CustomUserDetails) auth.getPrincipal();
	
		
	Jwts.builder().subject(user.getUsername()).issuedAt(new Date()).expiration(new Date()).compact();
	Map<String, String> tokens = tokenService.getTokens(user);
	return LoginResponse.builder().memberId(user.getUsername())
											.memberName(user.getMemberName())
											.role(user.getAuthorities().toString())
											.accessToken(tokens.get("accessToken"))
											.refreshToken(tokens.get("refreshToken"))
											.build();
	}

}
