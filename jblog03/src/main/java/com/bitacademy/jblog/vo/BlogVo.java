package com.bitacademy.jblog.vo;

public class BlogVo {

	private String user_id;
	@Override
	public String toString() {
		return "BlogVo [user_id=" + user_id + ", title=" + title + ", profile=" + profile + "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	private String title;
	private String profile;
}
