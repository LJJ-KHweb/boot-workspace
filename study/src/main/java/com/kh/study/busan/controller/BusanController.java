package com.kh.study.busan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.study.busan.model.dto.ReviewDto;
import com.kh.study.busan.model.dto.UpdateReviewDto;
import com.kh.study.busan.model.service.BusanService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@Tag(name = "부산 맛집 API", description = "맛집 조회 및 리뷰 API") // 제목 설명 달아줌
@Validated
@RestController
@RequestMapping("/api/busans")
@CrossOrigin("*")
public class BusanController {
	/* 불편함 -> 해결책
	 *  RESTAPI 구현
	 *  POSTMAN 사용
	 * 	API 명세 작성
	 * 	Swagger 사용
	 * 	직접 유효성 검사
	 * 	Spring-Validator-Starter를 사용한 유효성 검사
	 *  전역 예외 처리
	 *  에러 응답 형식 표준화
	 */

	@Autowired
	private BusanService service;

	@Operation(summary = "맛집 목록 조회", description = "페이지 단위로 조회") // 메소드에서 설명해주준부분
	@GetMapping
	public String getRes(
			@Parameter(description = "페이지 번호", example = "1") @RequestParam(name = "page") @Min(1) int page) {
		return service.getRes(page);
	}

	@ApiResponses({ @ApiResponse(responseCode = "200", description = "조회성공"),
			@ApiResponse(responseCode = "404", description = "맛집이없음") })
	@Operation(summary = "맛집 상세조회")
	@GetMapping("/{seq}")
	public String getDetail(@Parameter(description = "페이지 번호", example = "1") @PathVariable(name = "seq") int seq) {
		return service.getDetail(seq);
	}

	@Operation(summary = "댓글 추가하기")
	@PostMapping("/{seq}/reviews")
	public ResponseEntity<?> save(@PathVariable(value = "seq") Long ucSeq, @Valid @RequestBody ReviewDto review) {
		service.save(ucSeq, review);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@Operation(summary = "댓글 조회하기")
	@GetMapping("/{seq}/reviews")
	public ResponseEntity<List<ReviewDto>> findBySeq(@PathVariable(value = "seq") Long ucSeq) {
		List<ReviewDto> reviews = service.findBySeq(ucSeq);
		return ResponseEntity.ok(reviews);
	}

	// 리뷰를 수정하는 기능 + 리뷰를 삭제하는 기능
	// @PutMapping => 전체 수정 => 요청 받을 때 DTO모든 필드에 값이 존재해야함
	// @PatchMapping => 부분 수정 => 요청 받을 때 DTO 바꾸고 싶은 필드만 값이 존재해도됨
	@Operation(summary = "댓글 수정하기")
	@ApiResponses({ @ApiResponse(responseCode = "200", description = "업데이트성공"),
			@ApiResponse(responseCode = "404", description = "리뷰가 존재하지 않음ㄴ") })
	@PatchMapping("/{seq}/reviews")
	public ResponseEntity<Void> update(@PathVariable(value = "seq") Long ucSeq, @RequestBody UpdateReviewDto urd) {

		// /api/busans/70/reviews
		// { "content" : "원본내용",
		// "updateContent" : "바꾸고싶은내용" }

		service.update(ucSeq, urd);

		return ResponseEntity.ok().build();
	}

	// @DeleteMapping => 삭제
	// /api/busans/70/reviews/식별값
	@Operation(summary = "댓글 삭제하기")
	@DeleteMapping("/{seq}/reviews")
	public ResponseEntity<Void> delete(@PathVariable(value = "seq") Long ucSeq, @RequestBody UpdateReviewDto urd) {
		// Method : DELETE
//		{ "content" :  "원본내용" }
		service.delete(ucSeq, urd);
		return ResponseEntity.noContent().build();
	}

}
/*	1. REST API 구현(C, R, U, D)
 * 	2. 유효성 검사
 * 	3. REST 방식의 예외처리
 * 	4. API명세 작성
 * 	5. API 테스트
 * 
 * 	사용자가 검증 코드에 대한 중복
 * 	사람의 실수 => 코드를 누락
 * 	
 * 	인증(Authentication : 너 누구야				=> 로그인
 *	인가(Authorization) : 너 이거 할 권한 있어?	=> 본인글만 삭제, 관리자만 삭제
 * 	
 * 
 * 
 * 
 * 
 */
