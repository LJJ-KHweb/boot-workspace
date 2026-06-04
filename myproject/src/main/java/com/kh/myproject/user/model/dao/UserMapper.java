package com.kh.myproject.user.model.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.kh.myproject.user.model.vo.User;

@Mapper
public interface UserMapper {
	
	@Insert("INSERT INTO TEST_USER VALUES(#{userId}, #{userPwd}, #{userName}, 'ROLE_USER', 'Y')")
	public int signup(User user);

	@Select("SELECT COUNT(*) FROM TEST_USER WHERE USER_ID = #{userId} AND STATUS = 'Y'")
	public int checkById(String userId);

}
