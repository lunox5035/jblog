package com.bitacademy.jblog.vo;

public class CategoryVo {

	private Long no;
	private String categoryTitle;
	private String explanation;
	private String id;
	
	private Long postCount;

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

	public Long getPostCount() {
		return postCount;
	}

	public void setPostCount(Long postCount) {
		this.postCount = postCount;
	}

	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", categoryTitle=" + categoryTitle + ", explanation=" + explanation + ", id="
				+ id + ", postCount=" + postCount + "]";
	}
	
	
}
