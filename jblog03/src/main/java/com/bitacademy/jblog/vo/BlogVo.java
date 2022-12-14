package com.bitacademy.jblog.vo;

public class BlogVo {

	private String id;
	private String title;
	private String profile;
	private Long no;
	private String categoryTitle;
	private String postTitle;
	private String content;
	private String regDate;
	private String explanation;
	
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
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
	@Override
	public String toString() {
		return "BlogVo [id=" + id + ", title=" + title + ", profile=" + profile + ", no=" + no + ", categoryTitle="
				+ categoryTitle + ", postTitle=" + postTitle + ", content=" + content + ", regDate=" + regDate
				+ ", explanation=" + explanation + "]";
	}
	
	
	
}