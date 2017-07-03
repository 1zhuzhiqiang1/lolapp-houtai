package com.iqiang.entity;

/**
 * 版本更新实体类
 * 
 * @author 朱志强
 *
 */
public class BBGXEntity {
	private String link;
	private String img_link;
	private String title;
	private String subtitle;
	private String user;
	private String time;

	public BBGXEntity(String link, String img_link, String title, String subtitle, String user, String time) {
		super();
		this.link = link;
		this.img_link = img_link;
		this.title = title;
		this.subtitle = subtitle;
		this.user = user;
		this.time = time;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImg_link() {
		return img_link;
	}

	public void setImg_link(String img_link) {
		this.img_link = img_link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
