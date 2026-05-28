package com.kh.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("study")
// SpringWebStarter에는 기본으로 JSON형태로 Converting해줄 수 있는 Jackson라이브러리를 포함
// produces 기본값이 application/json; charset=UTF-8이기 때문에
// 자동으로 MessageConverter로 변환됨 잘 응답됨
public class StudyController {
	/*
	 * 	Spring Starter
	 * 	
	 * 	특정 기능에 필요한 의존성 라이브러리들을 한 번에 관리할 수 있는 개념
	 * 
	 *  웹개발해야지! -> Servlet, MVC, DispactcherServlet, JSON관련 라이브러리....
	 * 	-> Spring Boot Starter Web : 웹 애플리케이션 개발에 필요한 의존성들이 모여 있음
	 * 
	 * 	개발자가 필요한 기능이 있다 => Starter가서 추가해야지 -> 의존성관리를 직접하지 않음
	 * 	모든 개발자가 동일한 Starter를 쓰기 때문에 프로젝트 간 의존성 충돌도 방지 할 수 있음
	 * 
	 *  ※ Starter에 세상 모든 라이브러리가 다 있지는 않음 
	 * 
	 */
	@Autowired
	private StudyBean studyBean;
	
	@GetMapping
	public String test() {
		return "돌아갑니다";
	}
}
