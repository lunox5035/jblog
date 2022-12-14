package com.bitacademy.jblog.vo;

public class PostVo {
	private String title;
	private String content;
	private String reg_date;
	private String category_no;
	private Long no;
	
	@Override
	public String toString() {
		return "PostVo [title=" + title + ", content=" + content + ", reg_date=" + reg_date + ", category_no="
				+ category_no + ", no=" + no + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getCategory_no() {
		return category_no;
	}
	public void setCategory_no(String category_no) {
		this.category_no = category_no;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}

}
