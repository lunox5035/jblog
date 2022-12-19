package com.bitacademy.jblog.vo;

public class CategoryVo {

	private Long no;
	private String title;
	private String explanation;
	private String id;
	
	private Long postCount;
	
	
	public Long getPostCount() {
		return postCount;
	}
	public void setPostCount(Long postCount) {
		this.postCount = postCount;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", title=" + title + ", id=" + id + ", explanation=" + explanation
				+ ", postCount=" + postCount + "]";
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
