package com.kh.study.sceen.model.dto;

public class FindKeywordDto {

	private String keyword;
	private int page;
	public FindKeywordDto() {
		super();
	}
	public FindKeywordDto(String keyword, int page) {
		super();
		this.keyword = keyword;
		this.page = page;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "FindKeywordDto [keyword=" + keyword + ", page=" + page + "]";
	}
	
	
}
