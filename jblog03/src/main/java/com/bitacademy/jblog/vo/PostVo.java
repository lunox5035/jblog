package com.bitacademy.jblog.vo;

public class PostVo {
	private String postTitle;
	private String content;
	private String regDate;
	private String category_no;
	private Long no;
	private String id;
	private String categoryTitle;
	
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	@Override
	public String toString() {
		return "PostVo [postTitle=" + postTitle + ", content=" + content + ", regDate=" + regDate + ", category_no="
				+ category_no + ", no=" + no + ", id=" + id + ", categoryTitle=" + categoryTitle + "]";
	}
	
	
}
