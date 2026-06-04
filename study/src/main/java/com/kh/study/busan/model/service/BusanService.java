package com.kh.study.busan.model.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kh.study.busan.model.dao.ReviewMapper;
import com.kh.study.busan.model.dto.ReviewDto;
import com.kh.study.busan.model.dto.UpdateReviewDto;
import com.kh.study.exception.ResourceNotFoundException;

@Service
public class BusanService {

	@Autowired
	private ReviewMapper mapper;

	

	public String getRes(int page) {

		String url = "https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey=e709bd20a5bf6bd9a618ce0c21cb1bd827931622120918517aeb919bbf63fc4c&numOfRows=6&resultType=JSON";
		url += "&pageNo=" + page;

		URI uri = null;

		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiResponse = new RestTemplate().getForObject(uri, String.class);
		return apiResponse;
	}

	public String getDetail(int seq) {

		String url = "https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey=e709bd20a5bf6bd9a618ce0c21cb1bd827931622120918517aeb919bbf63fc4c&pageNo=1&numOfRows=1&resultType=JSON";
		url += "&UC_SEQ=" + seq;
		URI uri = null;

		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String apiResponse = new RestTemplate().getForObject(uri, String.class);

		System.out.println(apiResponse);
		return apiResponse;
	}

	public void save(Long ucSeq, ReviewDto review) {
		review.setUcSeq(ucSeq);
		if (review.getRating() < 1 || review.getRating() > 5) {
			// 예외 발생시키기
			// rating에 대한 책임은 Review에게 있음
			// 지금 review는 단순히 데이터를 옮기는 Transfer용 객체임
			// 그럼 비즈니스 로직은 어디에 넣지 => VO => 초고수면 이런 형식으로감

		}

		mapper.save(review);
	}

	public List<ReviewDto> findBySeq(Long ucSeq) {
		return mapper.findBySeq(ucSeq);
	}

	public void update(Long ucSeq, UpdateReviewDto urd) {
		urd.setUcSeq(ucSeq);
		int result = mapper.update(urd);
		if (result < 1) {
			throw new ResourceNotFoundException("리뷰가 존재하지 않습니다.");
		}
	}

	public void delete(Long ucSeq, UpdateReviewDto urd) {
		urd.setUcSeq(ucSeq);
		mapper.delete(urd);
	}

}
