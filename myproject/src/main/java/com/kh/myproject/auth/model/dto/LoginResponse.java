package com.kh.myproject.auth.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class LoginResponse {
	private String memberId;
	private String memberName;
	private String role;
	private String accessToken;
	private String refreshToken;

}
