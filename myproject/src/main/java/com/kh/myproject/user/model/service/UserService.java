package com.kh.myproject.user.model.service;

import org.springframework.stereotype.Service;

import com.kh.myproject.exception.DuplicateUserIdException;
import com.kh.myproject.user.model.dao.UserMapper;
import com.kh.myproject.user.model.dto.UserDto;
import com.kh.myproject.user.model.vo.User;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UserService {

	private final UserMapper mapper;

	public void signUp(UserDto user) {
		
		int count = mapper.checkById(user.getUserId());
		
		if(count > 0) {
			throw new DuplicateUserIdException("아이디가 중복입니다.");
		}
		
		User userEntity = new User().builder()
								.userId(user.getUserId())
								.userPwd(user.getUserPwd())
								.userName(user.getUserName())
								.build();
		
		int result = mapper.signup(userEntity);
		if( 1 > result) {
			throw new DuplicateUserIdException("잠시후 시도해주세요");
		}
	}
}
