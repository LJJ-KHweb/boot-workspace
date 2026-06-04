package com.kh.study.busan.model.vo;

import java.sql.Date;

import com.kh.study.busan.model.domain.Rating;

public class Review {
	private Long ucSeq;
	private String content;
	private Rating rating;
	private Date createDate;
	
	
	public Review(Long ucSeq, String content, Rating rating) {
		super();
		this.ucSeq = ucSeq;
		this.content = content;
		this.rating = rating;
	}
	
	public static Review createReview(Long ucSeq, String content, int rating) {
		return new Review(ucSeq, content, new Rating(rating));
	}
	
	
	
}
