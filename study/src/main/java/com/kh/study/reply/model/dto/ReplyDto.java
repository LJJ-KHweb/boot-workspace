package com.kh.study.reply.model.dto;

public class ReplyDto {
	private Long replyNo;
	private String replyContent;
	private String replyWriter;
	private Long refBno;
	private String createDate;
	private String status;
	public ReplyDto() {
		super();
	}
	public ReplyDto(Long replyNo, String replyContent, String replyWriter) {
		super();
		this.replyNo = replyNo;
		this.replyContent = replyContent;
		this.replyWriter = replyWriter;
	}
	
	
	public Long getRefBno() {
		return refBno;
	}
	public void setRefBno(Long refBno) {
		this.refBno = refBno;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(Long replyNo) {
		this.replyNo = replyNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	@Override
	public String toString() {
		return "ReplyDto [replyNo=" + replyNo + ", replyContent=" + replyContent + ", replyWriter=" + replyWriter + "]";
	}

	

}

