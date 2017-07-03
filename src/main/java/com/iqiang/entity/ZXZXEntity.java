package com.iqiang.entity;

import org.jsoup.nodes.Element;

/**
 * 最新资讯实体类
 * 
 * @author 朱志强
 *
 */
public class ZXZXEntity {
	private String time;
	private String link;
	private String title;

	public ZXZXEntity(String title, String link, String time) {
		super();
		this.time = time;
		this.link = link;
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
