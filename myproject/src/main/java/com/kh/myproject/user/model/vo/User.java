package com.kh.myproject.user.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class User {
	private String userId;
	private	String userPwd;
	private String userName;
	private String role;
	private String status;
}
